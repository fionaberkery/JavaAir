import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;
    Pilot pilot3;

    @Before
    public void before(){
        pilot1 = new Pilot("Bowser", Rank.CAPTAIN, "N64-29");
        pilot2 = new Pilot("Wario", Rank.FIRSTOFFICER, "N64-56");
        pilot3 = new Pilot("Toad", Rank.SECONDOFFICER, "N64-37");
    }

    @Test
    public void pilotHasAName(){
        assertEquals("Bowser", pilot1.getName());
    }

    @Test
    public void pilotHasARank(){
        assertEquals(Rank.FIRSTOFFICER, pilot2.getRank());
    }

    @Test
    public void pilotHasALicenseNumber(){
        assertEquals("N64-37", pilot3.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyThePlane(){
        assertEquals("Look at me I'm flying a plane" , pilot1.flyPlane());
    }

}
