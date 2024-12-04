package RealEstateApp_7;

public abstract class RealEstateAppBase {
    private String propertyName;
    private String location;
    private double area; // in square feet
    private double pricePerSqFt;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPricePerSqFt() {
        return pricePerSqFt;
    }

    public void setPricePerSqFt(double pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

    public abstract double calculateRevenue();

    // Abstract method to display details
    public abstract void displayDetails();
}





