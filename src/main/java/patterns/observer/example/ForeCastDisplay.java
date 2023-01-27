package patterns.observer.example;

public class ForeCastDisplay implements Displayer, Observer{
    private WeatherCondition weatherCondition;
    private WeatherCondition foreCastWeatherCondition;
    private WeatherSensor weatherSensor;

    @Override
    public void display() {
        System.out.println("Weather Condition Forecast: " + foreCastWeatherCondition);
    }

    @Override
    public void update(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
        makeForeCast();
        display();
    }

    private void makeForeCast(){
        foreCastWeatherCondition.setTemperature(weatherCondition.getTemperature() + 10);
        foreCastWeatherCondition.setHumidity(weatherCondition.getHumidity() + 10);
        foreCastWeatherCondition.setPressure(weatherCondition.getPressure() + 10);
    }

    public ForeCastDisplay(WeatherSensor weatherSensor) {
        this.weatherSensor = weatherSensor;
        foreCastWeatherCondition = new WeatherCondition();
    }
}
