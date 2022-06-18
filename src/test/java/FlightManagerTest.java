import com.sun.corba.se.impl.logging.POASystemException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    FlightManager flightManager;
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void before(){
        pilot = new Pilot("Bowser", Rank.CAPTAIN, "N64-39");
        plane = new Plane(PlaneType.BOEING777);
        passenger1 = new Passenger("Toad", 1);
        passenger2 = new Passenger("Peach", 1);
        flight = new Flight(pilot, plane, "JA01", "LAS", "EDI", "0600hrs");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void flightManagerCanCalculateBaggageForEachPassenger(){
        assertEquals(30, flightManager.calculateTotalReservedWeightForPassengers(flight), 0.0);
    }

    @Test
    public void flightManagerCanCalculateHowMuchWeightIsBookedByAllPassengers(){
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
        flightManager.calculateTotalReservedWeightForPassengers(flight);
        assertEquals(60, flightManager.getTotalWeightBookedByPassengers(flight));
    }

    @Test
    public void flightManagerCanCalculateWeightRemainingForPassengersForFlight(){
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
        assertEquals(16440, flightManager.getRemainingWeightForPassengers(flight));
    }



}


