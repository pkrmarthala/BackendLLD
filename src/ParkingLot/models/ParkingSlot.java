package ParkingLot.models;

import java.util.List;

public class ParkingSlot extends BaseModel {
    private String parkingSlotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    // private List<SupportedVehicleType> vehicleTypes;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;

    public String getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

//    public List<SupportedVehicleType> getVehicleTypes() {
//        return vehicleTypes;
//    }
//
//    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
//        this.vehicleTypes = vehicleTypes;
//    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
