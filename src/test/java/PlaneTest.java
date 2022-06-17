import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING737);
        plane2 = new Plane(PlaneType.BOEING777);
        plane3 = new Plane(PlaneType.BOEING767);
    }

    @Test
    public void planeHasAType(){
        assertEquals(PlaneType.BOEING737, plane1.getPlaneType());
    }

    @Test
    public void planeHasACapacity(){
        assertEquals(550, plane2.getCapacity());
    }

    @Test
    public void planeHasATotalWeight(){
        assertEquals(22500, plane3.getTotalWeight());
    }

}
