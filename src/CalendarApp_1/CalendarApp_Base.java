package CalendarApp_1;

public class CalendarApp_Base {

    private String appName;

    public CalendarApp_Base(String appName) {

        this.appName = appName;
    }

    public String getAppName() {

        return appName;
    }

    public void setAppName(String appName) {

        this.appName = appName;
    }

    public void displayInfo() {

        System.out.println("Calendar App Name: " + appName);
    }


}
