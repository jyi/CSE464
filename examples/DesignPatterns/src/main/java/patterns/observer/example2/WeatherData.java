package patterns.observer.example2;

public class WeatherData extends Subject {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

//    public void add(Observer o) {
//        observers.add(o);
//    }

    public void setMeasurements(float temperature, float humidity,
                                float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
