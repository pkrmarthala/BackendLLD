package ObserverDesignPattern;

public class WeatherStation {
    public static void main(String[] args) {
        // created a new subject
        WeatherData weatherData = new WeatherData();

        // created new subscribers
        CurrentConditionsDisplay currCondDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // this is a bad one !
//		currCondDisplay.update();
//		statisticsDisplay.update();
//		forecastDisplay.update();

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        currCondDisplay.deregister();
        weatherData.setMeasurements(62, 90, 28.1f);
        System.out.println();
        currCondDisplay.registerToGetUpdates();
        weatherData.setMeasurements(99, 90, 28.1f);
        System.out.println();

    }
}
