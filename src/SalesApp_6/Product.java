package SalesApp_6;

public class Product extends SalesAppBase implements Comparable<Product> {

    private int unitsSold;
    private double discount;
    private String brand;
    private int rating;
    private int stockQuantity;
    private int launchYear;
    private int warranty;

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public double calculateRevenue() {
        double effectivePrice = getPrice() - (getPrice() * discount / 100);
        return unitsSold * effectivePrice;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product Name: " + getProductName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: $" + getPrice());
        System.out.println("Units Sold: " + unitsSold);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Brand: " + brand);
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Revenue: $" + calculateRevenue());
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.calculateRevenue(), other.calculateRevenue());
    }
}
