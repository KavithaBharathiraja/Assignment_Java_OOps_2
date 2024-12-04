package CiscoApp_9;

public class CiscoApp_Main {
    public static void main(String[] args) {
        // Creating a Cisco WebEx app instance
        CiscoWebEx webEx = new CiscoWebEx("Cisco WebEx", "2.3.1", "123456", "Alice");

        // Creating a Cisco AnyConnect app instance
        CiscoAnyConnect anyConnect = new CiscoAnyConnect("Cisco AnyConnect", "5.9.0", "vpn.cisco.com", false);

        // Displaying app details
        System.out.println("WebEx App Details:");
        webEx.displayAppDetails();
        webEx.joinMeeting();

        System.out.println("\nAnyConnect App Details:");
        anyConnect.displayAppDetails();
        anyConnect.connect();
        anyConnect.displayAppDetails(); // Show updated status
    }
}
