package StrategyDesignPattern.Strategyv3;

import StrategyDesignPattern.Strategyv3.PathCalculatorStrategy;

public class GoogleMaps { // Free from SPR, OCP and Dependency Inversion violations
    public void findPathByMode(TravelMode travelMode) { // Violates the OCP. Obeys the Dependency Inversion
        PathCalculatorStrategy p = PathCalculatorStrategyFactory.getPathCalculatorStrategyByMode(travelMode);
        p.findPath();
    }
}
