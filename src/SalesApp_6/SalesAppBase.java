package SalesApp_6;

public abstract class SalesAppBase {

    private String productName;
    private String category;
    private double price;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method to calculate total revenue
    public abstract double calculateRevenue();

    // Abstract method to display product details
    public abstract void displayDetails();
}


