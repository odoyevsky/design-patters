package patterns.viewer.example;

public class ForeCastDisplay implements Displayer, Observer{
    private WeatherCondition weatherCondition;
    private WeatherSensor weatherSensor;

    @Override
    public void display() {
        System.out.println("Weather Condition Forecast: /n" + weatherCondition);
    }

    @Override
    public void update() {
        weatherCondition = weatherSensor.getWeatherCondition();
        weatherCondition.setTemperature(100000023);
        display();
    }

    public ForeCastDisplay(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
    }
}
