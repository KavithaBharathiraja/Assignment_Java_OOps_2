package VerizonApp_10;

public class VerizonApp_Main {
    public static void main(String[] args) {
        // Create a Verizon Tech Support instance
        VerizonTechSupport techSupport = new VerizonTechSupport("Verizon Tech Support", "1.0", "CASE12345", "John Doe");

        // Create a Verizon Billing App instance
        VerizonBillingApp billingApp = new VerizonBillingApp("Verizon Billing App", "2.1", "ACC56789", 120.50);

        // Use Tech Support app
        System.out.println("Tech Support App Details:");
        techSupport.displayAppDetails();
        techSupport.startApp();
        techSupport.resolveCase();
        techSupport.stopApp();

        System.out.println("\nBilling App Details:");
        // Use Billing app
        billingApp.displayAppDetails();
        billingApp.startApp();
        billingApp.payBill();
        billingApp.stopApp();
    }
}
