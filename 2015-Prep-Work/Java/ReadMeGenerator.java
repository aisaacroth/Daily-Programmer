
/**
 * ReadMeGenerator.java -
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class ReadMeGenerator {
    private String projectName;

    public ReadMeGenerator() {
        this.projectName = null;
    }

    public ReadMeGenerator(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
