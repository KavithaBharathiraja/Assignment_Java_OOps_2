package CiscoApp_9;

public class CiscoAnyConnect extends CiscoApp_Base {
    private String vpnServer;
    private boolean connectionStatus;

    public CiscoAnyConnect(String appName, String version, String vpnServer, boolean connectionStatus) {
        super(appName, version); // Initialize common attributes
        this.vpnServer = vpnServer;
        this.connectionStatus = connectionStatus;
    }

    // Getters and Setters for vpnServer and connectionStatus
    public String getVpnServer() {
        return vpnServer;
    }

    public void setVpnServer(String vpnServer) {
        this.vpnServer = vpnServer;
    }

    public boolean isConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(boolean connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    // Overriding the displayAppDetails method
    @Override
    public void displayAppDetails() {
        System.out.println("App Name: " + getAppName());
        System.out.println("Version: " + getVersion());
        System.out.println("VPN Server: " + vpnServer);
        System.out.println("Connection Status: " + (connectionStatus ? "Connected" : "Disconnected"));
    }

    // Additional behavior
    public void connect() {
        System.out.println("Connecting to VPN Server: " + vpnServer);
        connectionStatus = true;
    }
}
