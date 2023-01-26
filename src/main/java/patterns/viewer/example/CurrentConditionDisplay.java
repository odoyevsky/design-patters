package patterns.viewer.example;

public class CurrentConditionDisplay implements Observer, Displayer{
    private WeatherCondition weatherCondition = new WeatherCondition();
    private WeatherSensor weatherSensor;

    @Override
    public void display() {
        System.out.println("Current Weather Condition: /n" + weatherCondition);
    }

    @Override
    public void update() {
        this.weatherCondition = weatherSensor.getWeatherCondition();
        weatherCondition.setTemperature(10);
        weatherCondition.setHumidity(1000);
        weatherCondition.setTemperature(10000000);
        display();
    }

    public CurrentConditionDisplay(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
    }
}
