package patterns.observer;

import patterns.observer.example.*;

public class Main {
    public static void main(String[] args) {
        WeatherSensor weatherSensor = new WeatherSensor();
        CurrentConditionDisplay displayerCondition = new CurrentConditionDisplay(weatherSensor);
        ForeCastDisplay displayerForecast = new ForeCastDisplay(weatherSensor);

        weatherSensor.registerObserver(displayerCondition);
        weatherSensor.registerObserver(displayerForecast);
        weatherSensor.measurementChanged();
        System.out.println(weatherSensor.getWeatherCondition());

        System.out.println();
        weatherSensor.removeObserver(displayerForecast);
        weatherSensor.measurementChanged();
    }
}
