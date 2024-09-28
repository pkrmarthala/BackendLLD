package ParkingLot;

import ParkingLot.DTOs.IssueTicketRequestDTO;
import ParkingLot.DTOs.IssueTicketResponseDTO;
import ParkingLot.DTOs.ResponseStatus;
import ParkingLot.controllers.TicketController;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.ParkingLotRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(gateRepository,vehicleRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO request = new IssueTicketRequestDTO();
        request.setGateId(1);
        request.setOwnerName("Marthala");
        request.setVehicleNumber("AP40 R 6648");
        request.setVehicleType(VehicleType.TWO_WHEELER);

        IssueTicketResponseDTO response = ticketController.issueTicket(request);
        if( response.getResponseStatus().equals(ResponseStatus.SUCCESS) ) {
            System.out.println("Ticket Successfully Issued");
            System.out.println(response.getTicket().getParkingSlot().getParkingSlotNumber());
        } else {
            System.out.println("Ticket is not generated due to " + response.getFailureMessage());
        }

    }
}

// TicketController : TicketService : Repositories
// topological sorting