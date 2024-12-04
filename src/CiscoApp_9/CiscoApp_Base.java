package CiscoApp_9;

public abstract class CiscoApp_Base {
    private String appName;
    private String version;

    public CiscoApp_Base(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    // Getters and Setters for appName and version
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // Abstract method for displaying app details
    public abstract void displayAppDetails();
}
