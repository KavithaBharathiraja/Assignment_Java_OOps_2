package RestaurantApp_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantAppMain {

    public static void main(String[] args) {

        // Creating Restaurant objects
        Restaurant restaurant1 = new Restaurant(
                "Pasta Palace",
                "New York",
                4.5,
                "Italian",
                50.0,
                80,
                "123-456-7890");
        Restaurant restaurant2 = new Restaurant(
                "Sushi Spot",
                "Los Angeles",
                4.8,
                "Japanese",
                70.0,
                60,
                "987-654-3210");
        Restaurant restaurant3 = new Restaurant(
                "Taco Town",
                "Austin",
                4.3,
                "Mexican",
                30.0,
                100,
                "555-555-5555");

        // Adding restaurants to a list
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);

        // Displaying restaurants before sorting
        System.out.println("Restaurants before sorting by rating:");
        for (Restaurant restaurant : restaurants) {
            restaurant.displayDetails(true);
            System.out.println();
        }

        // Sorting restaurants by rating
        Collections.sort(restaurants);

        // Displaying restaurants after sorting
        System.out.println("Restaurants after sorting by rating:");
        for (Restaurant restaurant : restaurants) {
            restaurant.displayDetails(true);
            System.out.println();
        }
    }
}
