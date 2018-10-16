import org.junit.Before;
import org.junit.Test;
import park.Visitor;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;
    private Visitor visitor;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("CandyFlossStall", "Owner1", 1);
        visitor = new Visitor(20, 1.76, 33.67);
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

    @Test
    public void defaultPrice() {
        assertEquals(4.20, candyFlossStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }


}
