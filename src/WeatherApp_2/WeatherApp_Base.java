package WeatherApp_2;

public abstract class WeatherApp_Base {

    private String cityName;
    private String date;

    public WeatherApp_Base(String cityName, String date) {
        this.cityName = cityName;
        this.date = date;

    }

    public String getCityName() {

        return cityName;
    }

    public void setCityName(String cityName) {

        this.cityName = cityName;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public abstract void displayForecast();


}
