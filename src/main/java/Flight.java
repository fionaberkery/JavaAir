import java.util.ArrayList;


public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime){
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public String getPilotsName() {
        return this.pilot.getName();
    }

    public Rank getPilotsRank() {
        return this.pilot.getRank();
    }

    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }

    public int getNumberOfPassengersOnFlight() {
        return this.passengers.size();
    }

    public ArrayList<Passenger> returnPassengersArray(){
        return this.passengers;
    }

    public int getNumberOfCabinCrewOnFlight() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime(){
        return this.departureTime;
    }

    public int getNumberOfAvailableSeats() {
        return getPlaneType().getCapacity();
    }

    public String bookPassenger(Passenger passenger1, Flight flight1) {
        int bookedPassengers = this.getNumberOfPassengersOnFlight();
        int capacity = getPlaneType().getCapacity();
        if (capacity != bookedPassengers) {
            passengers.add(passenger1);
            passenger1.setFlight(flight1);
            passenger1.setSeatNumber(flight1);
            return "You're all booked";
        } else
            return "ERROR***FULLY BOOKED";
        };
    }
