package patterns.observer.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class WeatherCondition implements Cloneable{
    private int temperature;
    private int humidity;
    private int pressure;

    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public WeatherCondition clone(){
        try{
            return (WeatherCondition) super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        throw new RuntimeException("This is a mistake: cloneWeatherCondition");
    }

}
