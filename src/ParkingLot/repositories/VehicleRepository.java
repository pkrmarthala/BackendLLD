package ParkingLot.repositories;

import ParkingLot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository { // To check if the vehicle is already present in the DB (repo)
    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {
        return Optional.empty();
    }

    public Vehicle save (Vehicle vehicle) {
        // id will be attached by the DB for the object that is received and will be returned.
        return null;
    }
}
