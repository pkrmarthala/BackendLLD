package StrategyDesignPattern.Strategyv0;

public class GoogleMaps {
    public void findPathByMode(TravelMode travelMode) { // violates the SRP, OCP
        if(travelMode.equals(TravelMode.BIKE)) {
            System.out.println("Finding the path for Bike.");
        } else if(travelMode.equals(TravelMode.WALK)) {
            System.out.println("Finding the path for Walking.");
        } else if(travelMode.equals(TravelMode.CAR)) {
            System.out.println("Finding the path for Car.");
        }
    }
}
