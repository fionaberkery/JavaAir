import java.util.Random;

public class Passenger extends Person {

    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
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

    public void setSeatNumber(){
        Random seat = new Random();
        int upperbound = 150;
        this.seatNumber = seat.nextInt(upperbound);
    }
}
