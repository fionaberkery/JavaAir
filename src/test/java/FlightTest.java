import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Pilot pilot;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    @Before
    public void before(){
        pilot = new Pilot("Bowser", Rank.CAPTAIN, "N64-39");
        plane1 = new Plane(PlaneType.BOEING777);
        plane2 = new Plane(PlaneType.BOEINGTEST);
        flight1 = new Flight(pilot, plane1, "JA01", "LAS", "EDI", "0600hrs");
        flight2 = new Flight(pilot, plane2, "JA02", "GLA", "EDI", "0900hrs");
        cabinCrewMember1 = new CabinCrewMember("Mario", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Toad", Rank.FLIGHTATTENDENT);
        cabinCrewMember3 = new CabinCrewMember("Luigi", Rank.FLIGHTATTENDENT);
        flight1.addCabinCrew(cabinCrewMember1);
        flight1.addCabinCrew(cabinCrewMember2);
        flight1.addCabinCrew(cabinCrewMember3);
        passenger1 = new Passenger("Peach", 2);
        passenger2 = new Passenger("Yoshi", 1);
    }


    @Test
    public void getFlightPilotsName(){
        assertEquals("Bowser", flight1.getPilotsName());
    }

    @Test
    public void getFlightPilotsRank(){
        assertEquals(Rank.CAPTAIN, flight1.getPilotsRank());
    }

    @Test
    public void getFlightsPlaneType(){
        assertEquals(PlaneType.BOEING777, flight1.getPlaneType());
    }

    @Test
    public void flightHasEmptyPassengerList(){
        assertEquals(0, flight1.getNumberOfPassengersOnFlight());
    }

    @Test
    public void canAddCabinCrewToFlight(){
        assertEquals(3, flight1.getNumberOfCabinCrewOnFlight());
    }

    @Test
    public void flightHas3CabinCrew(){
        assertEquals(3, flight1.getNumberOfCabinCrewOnFlight());
    }

    @Test
    public void flightHasAFlightNumber(){
        assertEquals("JA01", flight1.getFlightNumber());
    }

    @Test
    public void flightHasADestination(){
        assertEquals("LAS", flight1.getDestination());
    }

    @Test
    public void flightHasDepartureAirport(){
        assertEquals("EDI", flight1.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("0600hrs", flight1.getDepartureTime());
    }

    @Test
    public void canCheckNumberOfAvailableSeats(){
        assertEquals(550, flight1.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookAPassengerOntoFlight(){
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getNumberOfPassengersOnFlight());
    }

    @Test
    public void flightWillConfirmAPassengerBooking(){
        assertEquals("You're all booked", flight1.bookPassenger(passenger1));
    }

    @Test
    public void cannotBookPassengerOntoFlightIfNotEnoughSeats(){
        flight2.bookPassenger(passenger1);
        assertEquals("ERROR***FULLY BOOKED", flight2.bookPassenger(passenger2));

    }







}
