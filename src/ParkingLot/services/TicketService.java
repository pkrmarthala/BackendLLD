package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

import static ParkingLot.strategies.SlotAssignmentStrategyFactory.getSlotAssignmentStrategy;

public class TicketService { // Note 7
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            int gateId,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType
    ) { // Refer Note 9
        // 1. Properly create a ticket object with required details,
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date()); // Refer Practice Session DateInAction.java

        // setting the gate - Note 10
        // in-memory representation of the DB: repository
        // Gate gate = gateRepository.findGateByID(gateId);
        // Note 12: : gate might come as null.

        Optional<Gate> gateOptional = gateRepository.findGateByID(gateId);
        if(gateOptional.isEmpty()) {
            throw new IllegalArgumentException("Gate not found!");
        }
        Gate gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator()); // Operator who cut the ticket.


        // check if the vehicle is already present in the repository
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()) { // put this vehicle to the repo
            vehicle = new Vehicle();
            vehicle.setLicensePlate(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            // once the vehicle object is created, we should store it in the DB.
            vehicleRepository.save(vehicle);
        } else {
            vehicle = vehicleOptional.get();
        }

        // 2. Assigning ParkingSlot
        ParkingLot parkingLot = gate.getParkingLot();
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategy(parkingLot.getSlotAssignmentStrategyType())
                .assignSlot(parkingLot, vehicleType);

        ticket.setParkingSlot(parkingSlot);

        // 3. save the created ticket and return the Data
        return ticketRepository.save(ticket);
    }
}
