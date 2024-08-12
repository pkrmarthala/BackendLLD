package StrategyDesignPattern.Strategyv3;

import StrategyDesignPattern.Strategyv3.TravelMode;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategyByMode(TravelMode travelMode) {
        PathCalculatorStrategy p = null;
        if(travelMode.equals(StrategyDesignPattern.Strategyv3.TravelMode.BIKE)) {
            p = new BikePathCalculatorStrategy();
        } else if(travelMode.equals(StrategyDesignPattern.Strategyv3.TravelMode.WALK)) {
            p = new WalkPathCalculatorStrategy();;
        } else if(travelMode.equals(StrategyDesignPattern.Strategyv3.TravelMode.CAR)) {
            p = new CarPathCalculatorStrategy();
        }
        return p;
    }
}
