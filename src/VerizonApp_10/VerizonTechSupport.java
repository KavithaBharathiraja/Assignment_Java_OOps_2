package VerizonApp_10;

public class VerizonTechSupport extends VerizonApp_Base {
    private String caseId;
    private String customerName;

    public VerizonTechSupport(String appName, String version, String caseId, String customerName) {
        super(appName, version); // Initialize common attributes
        this.caseId = caseId;
        this.customerName = customerName;
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Overriding the abstract method
    @Override
    public void displayAppDetails() {
        System.out.println("App Name: " + getAppName());
        System.out.println("Version: " + getVersion());
        System.out.println("Support Case ID: " + caseId);
        System.out.println("Customer Name: " + customerName);
    }

    // Additional behavior
    public void resolveCase() {
        System.out.println("Resolving case for customer: " + customerName);
    }
}
