package RestaurantApp_8;

public abstract class  RestaurantAppBase {

    private String name;
    private String location;

    public RestaurantAppBase(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void displayDetails();
}

