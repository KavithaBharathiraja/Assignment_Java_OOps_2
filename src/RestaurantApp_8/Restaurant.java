package RestaurantApp_8;

public class Restaurant extends RestaurantAppBase  implements Comparable<Restaurant>{


    private double rating;
    private String cuisineType;
    private double avgCostForTwo;
    private int seatingCapacity;
    private String contactInfo;

    public Restaurant(String name, String location, double rating, String cuisineType, double avgCostForTwo, int seatingCapacity, String contactInfo) {
        super(name, location);
        this.rating = rating;
        this.cuisineType = cuisineType;
        this.avgCostForTwo = avgCostForTwo;
        this.seatingCapacity = seatingCapacity;
        this.contactInfo = contactInfo;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public double getAvgCostForTwo() {
        return avgCostForTwo;
    }

    public void setAvgCostForTwo(double avgCostForTwo) {
        this.avgCostForTwo = avgCostForTwo;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public void displayDetails() {
        System.out.println("Restaurant: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Cuisine: " + cuisineType);

    }


    // Overloaded Display for Detailed Information
    public void displayDetails(boolean includeExtras) {
        if (includeExtras) {
            displayDetails(); // Call base display method
            System.out.println("Average Cost for Two: $" + avgCostForTwo);
            System.out.println("Seating Capacity: " + seatingCapacity + " people");
            System.out.println("Contact Info: " + contactInfo);
        } else {
            displayDetails();
        }
    }

    @Override
    public int compareTo(Restaurant other) {
        return Double.compare(other.rating, this.rating); // Descending order
    }
    }

