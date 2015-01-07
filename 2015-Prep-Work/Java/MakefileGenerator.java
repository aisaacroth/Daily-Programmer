import java.io.*;

/**
 * MakefileGenerator.java - Generates generic makefile.
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class MakefileGenerator {
    private String projectName;
    private final String MAKEFILE = "Makefile";

    public MakefileGenerator() {
        this.projectName = null;
    }

    public MakefileGenerator(String projectName) {
        this.projectName = projectName;
    }

    public void generateMakefile() throws FileNotFoundException {
        File makefile = createMakefile();
        writeMakefile(makefile);
    }

    private File createMakefile() {
        String projectPath = projectName + "/" + MAKEFILE;
        File makefile = new File(projectPath);
        return makefile;
    }

    private void writeMakefile(File makefile) throws FileNotFoundException {
        PrintWriter makefileWriter = new PrintWriter(makefile);
        makefileWriter.write("# Automates the build and cleaning for the " 
                + this.getProjectName() + " project\n");
        makefileWriter.write("#\n");
        makefileWriter.write("# Author:\n");
        makefileWriter.write("# Date:\n");
        makefileWriter.write("\n");
        makefileWriter.write(".PHONY: clean\n");
        makefileWriter.write("clean:\n");
        makefileWriter.write("\trm -f *~\n");
        makefileWriter.write("\n");
        makefileWriter.write(".PHONY: all\n");
        makefileWriter.write("all: clean\n");
        makefileWriter.flush();
        makefileWriter.close();
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
