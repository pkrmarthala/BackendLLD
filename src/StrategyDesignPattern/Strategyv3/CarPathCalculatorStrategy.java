package StrategyDesignPattern.Strategyv3;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath() {
        System.out.println("Car path is being calculated.");
    }
}
