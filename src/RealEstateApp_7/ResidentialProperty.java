package RealEstateApp_7;

public class ResidentialProperty extends RealEstateAppBase{

    private int bedrooms;
    private boolean hasGarden;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculateRevenue() {
        return getArea() * getPricePerSqFt();
    }

    @Override
    public void displayDetails() {
        System.out.println("Residential Property: " + getPropertyName());
        System.out.println("Location: " + getLocation());
        System.out.println("Area: " + getArea() + " sqft");
        System.out.println("Price per sqft: $" + getPricePerSqFt());
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Garden: " + (hasGarden ? "Yes" : "No"));
        System.out.println("Total Price: $" + calculateRevenue());
    }

}
