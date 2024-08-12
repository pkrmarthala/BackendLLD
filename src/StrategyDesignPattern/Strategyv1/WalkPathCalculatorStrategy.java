package StrategyDesignPattern.Strategyv1;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath() {
        System.out.println("Walk path is being calculated.");
    }
}
