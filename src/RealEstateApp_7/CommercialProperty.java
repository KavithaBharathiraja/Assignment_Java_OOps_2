package RealEstateApp_7;

public class CommercialProperty extends RealEstateAppBase{
    private boolean hasParking;
    private double rentalIncome; // Mon

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public double getRentalIncome() {
        return rentalIncome;
    }

    public void setRentalIncome(double rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    @Override
    public double calculateRevenue() {
        return (getArea() * getPricePerSqFt()) + (rentalIncome * 12);
    }

    @Override
    public void displayDetails() {
        System.out.println("Commercial Property: " + getPropertyName());
        System.out.println("Location: " + getLocation());
        System.out.println("Area: " + getArea() + " sqft");
        System.out.println("Price per sqft: $" + getPricePerSqFt());
        System.out.println("Parking: " + (hasParking ? "Available" : "Not Available"));
        System.out.println("Annual Rental Income: $" + (rentalIncome * 12));
        System.out.println("Total Revenue: $" + calculateRevenue());
    }
}
