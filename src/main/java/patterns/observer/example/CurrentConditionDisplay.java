package patterns.observer.example;

public class CurrentConditionDisplay implements Observer, Displayer{
    private WeatherCondition weatherCondition;
    private WeatherSensor weatherSensor;

    @Override
    public void display() {
        System.out.println("Current Weather Condition: " + weatherCondition);
    }

    @Override
    public void update(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
        display();
    }

    public CurrentConditionDisplay(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
    }
}
