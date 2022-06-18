import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        passenger1 = new Passenger("Taylor Swift", 3);
        passenger2 = new Passenger("Ed Sheeran", 2);
        passenger3 = new Passenger("Harry Styles", 1);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Taylor Swift", passenger1.getName());
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
