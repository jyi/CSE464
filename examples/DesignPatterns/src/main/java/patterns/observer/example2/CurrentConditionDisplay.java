package patterns.observer.example2;

public class CurrentConditionDisplay extends Observer {
    protected WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.add( this );
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "C degrees and " + humidity + "% humidity");
    }
}
