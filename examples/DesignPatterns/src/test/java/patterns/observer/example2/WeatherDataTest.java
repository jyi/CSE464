package patterns.observer.example2;

import org.junit.Test;

public class WeatherDataTest {

    @Test
    public void weatherDataTest() {
        WeatherData sub = new WeatherData();
        // Client configures the number and type of Observers
        new CurrentConditionDisplay(sub);
        new StatisticsDisplay(sub);

        sub.setMeasurements(28, 65, 30.4f);
        sub.setMeasurements(33, 80, 30.4f);
    }
}
