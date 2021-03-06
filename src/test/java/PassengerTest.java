import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Flight flight;
    Pilot pilot;
    Plane plane;

    @Before
    public void before(){
        pilot = new Pilot("Bowser", Rank.CAPTAIN, "N64-39");
        plane = new Plane(PlaneType.BOEING777);
        flight = new Flight(pilot, plane, "JA01", "LAS", "EDI", "0600hrs");
        passenger1 = new Passenger("Toad", 3);
        passenger2 = new Passenger("Mario", 2);
        passenger3 = new Passenger("Yoshi", 1);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Toad", passenger1.getName());
    }

    @Test
    public void passengerHasANumberOfBags(){
        assertEquals(2, passenger2.getNoOfBags());
    }

    @Test
    public void passengersNumberOfBagsCanChange(){
        passenger3.setNumberOfBags(2);
        assertEquals(2, passenger3.getNoOfBags());
    }



}
