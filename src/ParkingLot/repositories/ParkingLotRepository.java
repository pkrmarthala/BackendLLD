package ParkingLot.repositories;

import ParkingLot.models.Gate;
import ParkingLot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot findParkingLotByGate(Gate gateToCheck) {
        for(ParkingLot parkingLot : parkingLots.values()) {
            for(Gate gate : parkingLot.getEntryGates()) {
                if(gate.getId() == gateToCheck.getId()) {
                    return parkingLot;
                }
            }

        }
        return null;
    }

    public ParkingLot findParkingLotById(int id) {
        if(parkingLots.containsKey(id)) {
            return parkingLots.get(id);
        }
        return null;
    }
}

// Note 14
