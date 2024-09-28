package ParkingLot.repositories;

import ParkingLot.models.Gate;

import java.util.Optional;

public class GateRepository { // Note 10
    // This will have the methods to interact with this repo (DB replica).
    public Optional<Gate> findGateByID(int id) {
        return Optional.empty();
    }
}

// Note 11