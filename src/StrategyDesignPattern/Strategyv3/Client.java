package StrategyDesignPattern.Strategyv3;

public class Client {
    public static void main(String[] args) {
        GoogleMaps g = new GoogleMaps();
        g.findPathByMode(TravelMode.BIKE);
    }
}
