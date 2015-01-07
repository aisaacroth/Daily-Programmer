import java.util.Arrays;

/**
 * ProjectInitializer.java - 
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class ProjectInitializer {

    public static void main(String[] args) {
        if (args.length < 1) {
            printUsage();
            System.exit(1);
        }

        String projectName = args[0];
        String[] subDirectories = null;

        if (hasSubDirectories(args)) {
            subDirectories = copyOverLanguages(args);
        } 

        DirectoryCreator directoryCreator = new DirectoryCreator(projectName, 
                subDirectories);

        try {
            directoryCreator.createProjectDirectory();
            directoryCreator.createLanguageDirectories();
        } catch (SecurityException e) {
            e.printStackTrace();
        }

        printStats(projectName, directoryCreator);

    }

    private static void printUsage() {
        System.err.println("usage: java ProjectInitializer <Project Name> "
                + "<Language 1> <Language 2> ...");
    }

    private static boolean hasSubDirectories(String[] args) {
        return args.length > 1;
    }

    private static String[] copyOverLanguages(String[] args) {
        return Arrays.copyOfRange(args, 1, args.length);
    }

    private static void printStats(String projectName, 
            DirectoryCreator directoryCreator) {
        System.out.println("Created project directory: " + projectName);
        System.out.println();
        System.out.println("Created language directories");
        System.out.println("----------------------------");

        for (String sub : directoryCreator.getLanguageDirectories()) {
            System.out.println(sub);
        }
    }
}
