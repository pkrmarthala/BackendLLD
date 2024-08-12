package StrategyDesignPattern.Strategyv3;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath() {
        System.out.println("Walk path is being calculated.");
    }
}
