import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import park.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {

    private Playground playground;
    private Visitor visitor;
    private Visitor visitorTooOld;

    @Before
    public void before() {
        playground = new Playground("Playground");
        visitor = new Visitor(10, 1.76, 33.67);
        visitorTooOld = new Visitor(20, 1.76, 33.67);
    }

    @Test
    public void getName() {
        assertEquals("Playground", playground.getName());
    }
    @Test
    public void getRating() {
        assertEquals(0, playground.getRating());
    }


    @Test
    public void isAllowedTo() {
        assertTrue(playground.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToTooOld() {
        assertFalse(playground.isAllowedTo(visitorTooOld));
    }


}
