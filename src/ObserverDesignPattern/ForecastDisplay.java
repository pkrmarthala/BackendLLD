package ObserverDesignPattern;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    // Every observer need to have the provider / the subject details.
    private WeatherData weatherData;

    // constructor
    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;

        // As soon as the object is created, we are registering it with the Provider or the Subject.
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }


    @Override
    public void display() {
        System.out.println("Forecast: ");
        if(currentPressure > lastPressure) {
            System.out.println("Improving weather on the way.");
        } else if(currentPressure == lastPressure) {
            System.out.println("More of the same.");
        } else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather.");
        }
    }

}
