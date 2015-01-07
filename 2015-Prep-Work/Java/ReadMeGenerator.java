import java.io.*;

/**
 * ReadMeGenerator.java - Generates ReadMe file with project name.
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class ReadMeGenerator {
    private String projectName;
    private final String README = "README.md";

    public ReadMeGenerator() {
        this.projectName = null;
    }

    public ReadMeGenerator(String projectName) {
        this.projectName = projectName;
    }

    public void generateReadMe() throws FileNotFoundException {
        File readMe = createReadMe();
        writeReadMe(readMe);
    }

    private File createReadMe() {
        String projectPath = this.getProjectName() + "/" + README;
        File readMe = new File(projectPath);
        return readMe;
    }

    private void writeReadMe(File readMe) throws FileNotFoundException {
        PrintWriter readMeWriter = new PrintWriter(readMe);
        readMeWriter.write(this.getProjectName() + "\n");
        readMeWriter.write("======\n");
        readMeWriter.flush();
        readMeWriter.close();
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
