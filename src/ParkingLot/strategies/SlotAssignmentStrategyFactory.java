package ParkingLot.strategies;

import ParkingLot.models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotAssignmentStrategy(SlotAssignmentStrategyType type) {
        return new RandomSlotAssignmentStrategy();
    }
//        switch(type){
//            case RANDOM:
//                return new RandomSlotAssignmentStrategy();
//                break;
////            case FARTHEST:
//
//        }
//    }
}
