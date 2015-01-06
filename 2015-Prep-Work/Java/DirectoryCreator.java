/**
 * DirectoryCreator.java -
 *
 * @author Alexander Roth
 * @date   2015-01-06
 **/
public class DirectoryCreator {
    private String projectDirectory;
    private String[] languageDirectories;

    public DirectoryCreator() {
        this.projectDirectory = null;
        this.languageDirectories = null;
    }

    public DirectoryCreator(String projectDirectory,
            String[] languageDirectories) {
        this.projectDirectory = projectDirectory;
        this.languageDirectories = languageDirectories;
    }

    public String getProjectDirectory() {
        return this.projectDirectory;
    }

    public String[] getLanguageDirectories() {
        return this.languageDirectories;
    }

    public void setProjectDirectory(String projectDirectory) {
        this.projectDirectory = projectDirectory;
    }

    public void setLanguageDirectories(String[] languageDirectories) {
        this.languageDirectories = languageDirectories;
    }

}
