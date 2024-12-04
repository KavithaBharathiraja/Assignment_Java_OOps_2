package WeatherApp_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WeatherApp_Main {

    public static void main(String[] args) {

        // Creating WeatherForecast objects

        WeatherForecast forecast1 = new WeatherForecast("New York", "2024-11-19", 12.5, 60, 15.0, "Cloudy", "08:00 AM", 10.0, 5, 50);
        WeatherForecast forecast2 = new WeatherForecast("Los Angeles", "2024-11-19", 22.8, 40, 10.0, "Sunny", "02:00 PM", 2.0, 8, 30);
        WeatherForecast forecast3 = new WeatherForecast("Chicago", "2024-11-19", 8.3, 80, 20.0, "Snow", "06:00 AM", 30.0, 2, 75);

        // Adding forecasts to a list
        List<WeatherForecast> forecasts = new ArrayList<>();
        forecasts.add(forecast1);
        forecasts.add(forecast2);
        forecasts.add(forecast3);

        // Displaying forecasts before sorting
        System.out.println("Weather Forecasts before sorting by temperature:");
        for (WeatherForecast forecast : forecasts) {
            forecast.displayForecast(true);
            System.out.println();
        }

        // Sorting forecasts by temperature
        Collections.sort(forecasts);

        // Displaying forecasts after sorting
        System.out.println("Weather Forecasts after sorting by temperature:");
        for (WeatherForecast forecast : forecasts) {
            forecast.displayForecast(true);
            System.out.println();
        }
    }


}
