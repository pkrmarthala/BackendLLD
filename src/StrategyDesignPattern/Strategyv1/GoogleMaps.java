package StrategyDesignPattern.Strategyv1;

import java.nio.file.Path;

public class GoogleMaps {
    public void findPathByMode(TravelMode travelMode) { // Violates the OCP. Obeys the Dependency Inversion
        if(travelMode.equals(TravelMode.BIKE)) {
            PathCalculatorStrategy p = new BikePathCalculatorStrategy();
            p.findPath();
        } else if(travelMode.equals(TravelMode.WALK)) {
            PathCalculatorStrategy p = new WalkPathCalculatorStrategy();
            p.findPath();
        } else if(travelMode.equals(TravelMode.CAR)) {
            PathCalculatorStrategy p = new CarPathCalculatorStrategy();
            p.findPath();
        }
    }
}
