package ObserverDesignPattern;
import java.util.ArrayList;
import java.util.List;
public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { observers = new ArrayList<Observer>(); }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer registered: " + o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer removed: " + o);
    }

    @Override
    public void notifyObservers() {
        // older version might have been directly associated to the classes and not dynamic
        //  currentDisplay.update();
        //  statisticsDisplay.update();
        //  forecastDisplay.update();
        //  HeatIndex.update();
        System.out.println("******** LET'S NOTIFY ********");
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // do something else before notifying the observers
        notifyObservers();
    }

    // this is called by weatherStation
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
