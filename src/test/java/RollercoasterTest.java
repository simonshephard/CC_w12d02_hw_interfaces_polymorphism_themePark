import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import park.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor;
    private Visitor visitorTall;
    private Visitor visitorTooYoung;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Rollercoaster");
        visitor = new Visitor(20, 1.76, 33.67);
        visitorTall = new Visitor(20, 2.12, 33.67);
        visitorTooYoung = new Visitor(10, 2.12, 33.67);
    }

    @Test
    public void getName() {
        assertEquals("Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void getRating() {
        assertEquals(0, rollercoaster.getRating());
    }

    @Test
    public void isAllowedTo() {
        assertTrue(rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToTooYoung() {
        assertFalse(rollercoaster.isAllowedTo(visitorTooYoung));
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(8.40, rollercoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void priceForTall() {
        assertEquals(16.80, rollercoaster.priceFor(visitorTall), 0.01);
    }


}
