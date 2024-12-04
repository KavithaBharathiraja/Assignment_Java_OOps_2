package WeatherApp_2;

// Implementing Comparable
public class WeatherForecast extends WeatherApp_Base implements Comparable<WeatherForecast> {
    private double temperature;
    private int humidity;
    private double windSpeed;
    private String condition;
    private String time;
    private double precipitationChance;
    private int uvIndex;
    private int airQualityIndex;

    // Constructor
    public WeatherForecast(String cityName, String date, double temperature, int humidity, double windSpeed, String condition, String time, double precipitationChance, int uvIndex, int airQualityIndex) {
        super(cityName, date);
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.condition = condition;
        this.time = time;
        this.precipitationChance = precipitationChance;
        this.uvIndex = uvIndex;
        this.airQualityIndex = airQualityIndex;
    }




    // Overloaded constructor (for simpler forecasts without time and some details)
    public WeatherForecast(String cityName, String date, double temperature, int humidity, String condition) {
        super(cityName, date);
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    // Getters and Setters (unchanged)

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getPrecipitationChance() {
        return precipitationChance;
    }

    public void setPrecipitationChance(double precipitationChance) {
        this.precipitationChance = precipitationChance;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getAirQualityIndex() {
        return airQualityIndex;
    }

    public void setAirQualityIndex(int airQualityIndex) {
        this.airQualityIndex = airQualityIndex;
    }



    // Overriding the abstract method
    @Override
    public void displayForecast() {
        System.out.println("Weather Forecast for " + getCityName() + " on " + getDate() + ":");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Condition: " + condition);
        System.out.println("Humidity: " + humidity + "%");
    }

    // Overloaded method for display
    public void displayForecast(boolean includeDetails) {
        if (includeDetails) {
            displayForecast(); // Call base method
            System.out.println("Wind Speed: " + windSpeed + " km/h");
            System.out.println("Precipitation Chance: " + precipitationChance + "%");
            System.out.println("UV Index: " + uvIndex);
            System.out.println("Air Quality Index: " + airQualityIndex);
        } else {
            displayForecast(); // Call the basic display method
        }
    }

    // Comparable implementation: Compare by temperature
    @Override
    public int compareTo(WeatherForecast other) {
        return Double.compare(this.temperature, other.temperature);
    }
}
