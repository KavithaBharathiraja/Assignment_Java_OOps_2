package VerizonApp_10;

public abstract class VerizonApp_Base {
    private String appName;
    private String version;

    public VerizonApp_Base(String appName, String version) {
        this.appName = appName;
        this.version = version;
    }

    // Getters and Setters
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

    // Abstract method to display app details
    public abstract void displayAppDetails();

    // Common behavior
    public void startApp() {
        System.out.println(appName + " is starting...");
    }

    public void stopApp() {
        System.out.println(appName + " is stopping...");
    }
}
