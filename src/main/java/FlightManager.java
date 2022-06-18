import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double calculateTotalReservedWeightForPassengers(Flight flight) {
        double flightsReservedWeightForAllPassengers = (flight.getPlaneType().getTotalWeight()) / 2;
        return flightsReservedWeightForAllPassengers / (flight.getPlaneType().getCapacity());
    }


    public int getTotalWeightBookedByPassengers(Flight flight) {
        ArrayList <Passenger> passengers = flight.returnPassengersArray();
        int total = 0;
        for(Passenger passenger : passengers){
            total += passenger.getNoOfBags();
        }
        return (int) (total * (calculateTotalReservedWeightForPassengers(flight)));

    }

    public int getRemainingWeightForPassengers(Flight flight) {
        int totalPassengerWeightReservedForFlight = (flight.getPlaneType().getTotalWeight()) / 2;
        return totalPassengerWeightReservedForFlight - getTotalWeightBookedByPassengers(flight);
    }
}


