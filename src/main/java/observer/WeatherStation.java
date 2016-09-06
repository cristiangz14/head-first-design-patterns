package observer;

/**
 * Created by cristian on 5/09/16.
 */
public class WeatherStation {

    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 32.2f);
        weatherData.setMeasurements(75, 69, 35.1f);

    }
}
