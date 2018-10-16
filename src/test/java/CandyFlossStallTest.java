import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("CandyFlossStall", "Owner1", 1);
    }

    @Test
    public void getName() {
        assertEquals("CandyFlossStall", candyFlossStall.getName());
    }
    @Test
    public void getOwnerName() {
        assertEquals("Owner1", candyFlossStall.getOwnerName());
    }
    @Test
    public void getParkingSpot() {
        assertEquals(1, candyFlossStall.getParkingSpot());
    }
    @Test
    public void getRating() {
        assertEquals(0, candyFlossStall.getRating());
    }


}
