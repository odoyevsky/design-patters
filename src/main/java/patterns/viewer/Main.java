package patterns.viewer;

import patterns.viewer.example.*;

public class Main {
    public static void main(String[] args) {
        WeatherSensor weatherSensor = new WeatherSensor();
        CurrentConditionDisplay displayerCondition = new CurrentConditionDisplay(weatherSensor);
        ForeCastDisplay displayerForecast = new ForeCastDisplay(weatherSensor);

        weatherSensor.registerObserver(displayerCondition);
        weatherSensor.registerObserver(displayerForecast);
        weatherSensor.measurementChanged();

        System.out.println(weatherSensor.getWeatherCondition());
    }
}
