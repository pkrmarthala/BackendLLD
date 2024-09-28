package ParkingLot.DTOs;

import ParkingLot.models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket;
    // private String time;
    // You don't need to send this. It can be generated in the Front End as well.
    private ResponseStatus responseStatus;
    private String failureMessage;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }
}
