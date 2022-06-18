import java.util.ArrayList;
import java.util.Random;

public class Passenger extends Person {

    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.seatNumber = seatNumber;
        this.flight = flight;
    }

    public int getNoOfBags() {
        return this.numberOfBags;
    }

    public void setNumberOfBags(int bags) {
        this.numberOfBags = bags;
    }

    public Flight getBookedFlight() {
        return this.flight;
    }

    public void setFlight(Flight flight1) {
        this.flight = flight1;
    }

    public int getSeatNumber(){
        return this.seatNumber;
    }

    public void setSeatNumber(Flight flight){
        ArrayList<Integer> bookedSeats = new ArrayList<Integer>();
        ArrayList<Passenger> bookedPassengers = flight.returnPassengersArray();
        for(Passenger passenger : bookedPassengers) {
            bookedSeats.add(this.seatNumber);
        }
            int flightSeats = flight.getNumberOfAvailableSeats();
            Random seat = new Random();
            int seatNumber = seat.nextInt(flightSeats);
            for(int bookedSeat : bookedSeats) {
                if (bookedSeat != seatNumber) {
                    this.seatNumber = seatNumber;
                    break;
                }
            }
}}


