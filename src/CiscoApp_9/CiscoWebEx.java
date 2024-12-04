package CiscoApp_9;

public class CiscoWebEx extends CiscoApp_Base {
    private String meetingId;
    private String hostName;

    public CiscoWebEx(String appName, String version, String meetingId, String hostName) {
        super(appName, version); // Initialize common attributes
        this.meetingId = meetingId;
        this.hostName = hostName;
    }

    // Getters and Setters for meetingId and hostName
    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    // Overriding the displayAppDetails method
    @Override
    public void displayAppDetails() {
        System.out.println("App Name: " + getAppName());
        System.out.println("Version: " + getVersion());
        System.out.println("Meeting ID: " + meetingId);
        System.out.println("Host Name: " + hostName);
    }

    // Additional behavior
    public void joinMeeting() {
        System.out.println("Joining the meeting with ID: " + meetingId);
    }
}
