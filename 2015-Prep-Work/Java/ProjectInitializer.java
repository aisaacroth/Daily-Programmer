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
    }

    private static void printUsage() {
        System.err.println("usage: java ProjectInitializer <Project Name> "
                + "<Language 1> <Language 2> ...");
    }
}
