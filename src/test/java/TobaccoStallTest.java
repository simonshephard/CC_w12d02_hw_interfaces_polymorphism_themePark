import org.junit.Before;
import org.junit.Test;
import park.Visitor;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TobaccoStallTest {

    private TobaccoStall tobaccoStall;
    private Visitor visitor;
    private Visitor visitorTooYoung;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("TobaccoStall", "Owner1", 1);
        visitor = new Visitor(20, 1.76, 33.67);
        visitorTooYoung = new Visitor(10, 2.12, 33.67);
    }

    @Test
    public void getName() {
        assertEquals("TobaccoStall", tobaccoStall.getName());
    }
    @Test
    public void getOwnerName() {
        assertEquals("Owner1", tobaccoStall.getOwnerName());
    }
    @Test
    public void getParkingSpot() {
        assertEquals(1, tobaccoStall.getParkingSpot());
    }
    @Test
    public void getRating() {
        assertEquals(0, tobaccoStall.getRating());
    }

    @Test
    public void isAllowedTo() {
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToTooYoung() {
        assertFalse(tobaccoStall.isAllowedTo(visitorTooYoung));
    }

    @Test
    public void defaultPrice() {
        assertEquals(6.60, tobaccoStall.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(6.60, tobaccoStall.priceFor(visitor), 0.01);
    }






}
