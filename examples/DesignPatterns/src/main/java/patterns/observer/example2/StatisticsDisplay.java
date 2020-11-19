package patterns.observer.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StatisticsDisplay extends Observer {
    protected WeatherData weatherData;
    private List<Float> temperatureList = new ArrayList<>();
    private List<Float> humidityList = new ArrayList<>();
    private List<Float> pressureList = new ArrayList<>();

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.add(this);
    }

    @Override
    public void update() {
        this.temperatureList.add(weatherData.getTemperature());
        this.humidityList.add(weatherData.getHumidity());
        this.pressureList.add(weatherData.getPressure());
        display();
    }

    public void display() {
        System.out.printf("Avg/Max/Min temparature: %.1f / %.1f / %.1f\n",
                temperatureList.stream().mapToDouble(v -> v).average().orElseThrow(NoSuchElementException::new),
                temperatureList.stream().mapToDouble(v -> v).max().orElseThrow(NoSuchElementException::new),
                temperatureList.stream().mapToDouble(v -> v).min().orElseThrow(NoSuchElementException::new));
    }
}
