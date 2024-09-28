package ParkingLot.controllers;


import ParkingLot.DTOs.IssueTicketRequestDTO;
import ParkingLot.DTOs.IssueTicketResponseDTO;
import ParkingLot.DTOs.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController { // Note 4
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO ticketRequest) { // Note 5, 6
        IssueTicketResponseDTO ticketResponse = new IssueTicketResponseDTO();
        // basic validations can be done here.

        // request object can have a lot of other details. So, internally, we do not send the request DTO everywhere.

        // Exception can be caught at different levels, but it should not go beyond the controller.
        try {
            Ticket ticket = ticketService.issueTicket(
                    ticketRequest.getGateId(),
                    ticketRequest.getVehicleNumber(),
                    ticketRequest.getOwnerName(),
                    ticketRequest.getVehicleType()
            );
            ticketResponse.setResponseStatus(ResponseStatus.SUCCESS);
            ticketResponse.setTicket(ticket);
        } catch(Exception ex) {
            ticketResponse.setResponseStatus(ResponseStatus.FAILURE);
            ticketResponse.setFailureMessage(ex.getMessage());
        }

        return ticketResponse;
    }
}
