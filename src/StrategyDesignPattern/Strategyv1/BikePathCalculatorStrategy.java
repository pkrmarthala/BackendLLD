package StrategyDesignPattern.Strategyv1;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath() {
        System.out.println("Bike path is being calculated.");
    }
}
