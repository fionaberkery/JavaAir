import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Mario", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Yoshi", Rank.FLIGHTATTENDENT);
        cabinCrewMember3 = new CabinCrewMember("Peach", Rank.FLIGHTATTENDENT);
    }

    @Test
    public void cabinCrewMemberHasAName(){
        assertEquals("Mario", cabinCrewMember1.getName());
    }

    @Test
    public void cabinCrewMemberHasARank(){
        assertEquals(Rank.FLIGHTATTENDENT, cabinCrewMember2.getRank());
    }

    @Test
    public void cabinCrewCanTellPassengersToFastenTheirSeatbelts(){
        assertEquals("The pilot has turned on the fasten seatbelt sign", cabinCrewMember1.tellPassengersToPutSeatbeltsOn());
    }

    @Test
    public void cabinCrewCanOfferADrink(){
        assertEquals("Would you like a drink?", cabinCrewMember2.offerPassengerADrink());
    }
}
