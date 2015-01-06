/**
 * MakefileGenerator.java -
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class MakefileGenerator {
    private String projectName;

    public MakefileGenerator() {
        this.projectName = null;
    }

    public MakefileGenerator(String projectName) {
        this.projectName = null;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
