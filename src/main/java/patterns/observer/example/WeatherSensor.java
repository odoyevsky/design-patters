package patterns.observer.example;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensor implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private WeatherCondition weatherCondition;

    private void determineWeatherCondition(){
        this.weatherCondition = new WeatherCondition();
        weatherCondition.update(1,1,1);
    }

    public void measurementChanged(){
        determineWeatherCondition();
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(weatherCondition.clone()));
    }

    @Override
    public void registerObserver(Observer observer) {
       observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public WeatherCondition getWeatherCondition(){
        return weatherCondition;
    }
}
