package VerizonApp_10;

public class VerizonBillingApp extends VerizonApp_Base {
    private String accountNumber;
    private double billingAmount;

    public VerizonBillingApp(String appName, String version, String accountNumber, double billingAmount) {
        super(appName, version); // Initialize common attributes
        this.accountNumber = accountNumber;
        this.billingAmount = billingAmount;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(double billingAmount) {
        this.billingAmount = billingAmount;
    }

    // Overriding the abstract method
    @Override
    public void displayAppDetails() {
        System.out.println("App Name: " + getAppName());
        System.out.println("Version: " + getVersion());
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Billing Amount: $" + billingAmount);
    }

    // Additional behavior
    public void payBill() {
        System.out.println("Processing payment for account: " + accountNumber + " with amount: $" + billingAmount);
    }
}
