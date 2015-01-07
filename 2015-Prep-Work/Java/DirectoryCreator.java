import java.io.File;

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

    public void createProjectDirectory() throws SecurityException {
        File projectDirectory = new File(this.getProjectDirectory() + "/");
        projectDirectory.mkdir();
    }

    public void createLanguageDirectories() throws SecurityException {
        String projectPath = this.getProjectDirectory() + "/";

        if (this.getLanguageDirectories() == null) {
            return;
        }

        for (String subPath : this.getLanguageDirectories()) {
            String completePath = projectPath + subPath + "/";
            File subDirectory = new File(completePath);
            subDirectory.mkdir();
        }
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
