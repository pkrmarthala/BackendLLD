Notes:
<< ----------------------------------------------------   1   ---------------------------------------------------- >>
id is going to be a common attribute for each and every class.
In Spring, created_at, modified_at -> can also be certain attributes which will be common for every class.



<< ----------------------------------------------------   2   ---------------------------------------------------- >>

It is not a good idea to create HashMap in models classes.
Because, in future there might be chances of adding more data elements and the HashMap will get longer and longer.

Eg.: HashMap<vehicleType, Integer> if some attribute comes later, we need to have a separate DS inside the HashMap.

It is good to keep temporary classes with such types.
Eg.: the ParkingLotVehicleType class



<< ----------------------------------------------------   3   ---------------------------------------------------- >>

It is possible that there'll be mixed modes of payment.
Cash: 30, UPI: 20
Coupon from shopping: 10, UPI: 40

And also possible that there'll be multiple failed payments before a successful one.
Payment 1: Cancelled, Payment 2: Successful
Payment 1: Failed, Payment 2: Successful
Payment: Successful, but you want to cancel the services and want a refund (which also is a payment made).

So, we'll have a List<Payment> instead of having a single Payment object in the Bill class,
to ensure partial payments / refunds / cancellations.



<< ----------------------------------------------------   4   ---------------------------------------------------- >>

In the controllers, we'll be doing the
1. creation of ticket: major CRUD ops on : Ticket; ParkingSlot allotment and others are not the core ops.
Hence, name the controller accordingly.



<< ----------------------------------------------------   5   ---------------------------------------------------- >>

DTOs:
To avoid exposing / sending sensitive / too much information to the Client, we should not use models in return types.
Sending back / Using model directly with the client is not suggested.

For these Scenarios, we create separate objects called Data Transfer Objects (DTOs).



<< ----------------------------------------------------   6   ---------------------------------------------------- >>

We can have the function to issue Ticket like below.
public IssueTicketResponseDTO issueTicket(int gateId, String vehicleNumber) { }
But, if any other parameter need to be added later, we have to modify this method or we need to create a new method.
So, instead of having a function with a parameters like above, we can pass the DTO to this function.



<< ----------------------------------------------------   7   ---------------------------------------------------- >>

Ticket Service is an internal class. It will not be interacting with the Client. So, we can return the direct object.
We can also use / return DTOs. But for more clarity of the code, we use models directly.



<< ----------------------------------------------------   8   ---------------------------------------------------- >>

Flow:
1. Client will be calling the controller,
2. TicketController will be taking the IssueTicketRequestDTO
3. It'll get a response
4. The issueTicket() in the TicketService will be called with gateId, vehicleNumber
5. Ticket will be created and assigned to ticket object
6. Set the ticket's Response status & the ticket ID
7. Return the ticketResponse.



<< ----------------------------------------------------   9   ---------------------------------------------------- >>

TicketService:
1. Properly create a ticket object with required details,
2. Assigning ParkingSlot
3. Return the Data

To create a ticket object, we need



<< ----------------------------------------------------   10   ---------------------------------------------------- >>

Package - Repositories:
We are not interacting / connecting the DB here. We are doing it in-memory.
So, we need to have the package Repositories, that replicates the DB behaviour.

Repositories are used when we need an object from the DB, but it is not connected, we need this package.
We need to talk to the repositories, if we need to talk to the DB.



<< ----------------------------------------------------   11   ---------------------------------------------------- >>

GateRepository:
+ Contains the methods that are used to interact with the DB, Table: Gates

findGateByID(int id):
This method will query your DB.

"SELECT * from Gates WHERE id = 5;"

This data can come in any particular format, like JSON, simple String, ...
So, some kind of deserialization has to happen, and it gets converted to the object of your need.

gate data -> Object
all the attributes that are returned from the query will be mapped to the object attributes.
This is called Object Relation Mapping (ORM).
This process is a heavy-lifting and we need not do it manually.
All the frameworks that we use in the backend will have this ORM available in them.



<< ----------------------------------------------------   12   ---------------------------------------------------- >>

If we directly return the gate object, it might come as null, and the dev must keep a null check.
To handle that, we can either throw an exception if gate is null or handle it by using Optional.



<< ----------------------------------------------------   13   ---------------------------------------------------- >>

Parking Slot Assignment Strategy:
To assign a parking slot, we need
1. VehicleType
2. Floors: not available directly. They are in the lot.

We need to find them.
Using the gate object, can we find the parking lots? Yes, it is available in the DB.



<< ----------------------------------------------------   14   ---------------------------------------------------- >>

ParkingLot Repository:
Which DS closely resembles a DB?
Map: TreeMap
TreeMap contains the sorting, indexes.















