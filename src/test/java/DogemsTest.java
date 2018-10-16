import attractions.Dogems;
import interfaces.IReviewed;
import org.junit.Before;
import org.junit.Test;
import park.Visitor;

import static org.junit.Assert.*;

public class DogemsTest {

    private Dogems dogems;
    private Visitor visitor;
    private Visitor visitorYoung;

    @Before
    public void before() {
        dogems = new Dogems("Dogems");
        visitor = new Visitor(20, 1.76, 33.67);
        visitorYoung = new Visitor(10, 2.12, 33.67);
    }

    @Test
    public void getName() {
        assertEquals("Dogems", dogems.getName());
    }

    @Test
    public void getRating() {
        assertEquals(0, dogems.getRating());
    }


    @Test
    public void defaultPrice() {
        assertEquals(2.80, dogems.defaultPrice(), 0.01);
    }

    @Test
    public void priceFor() {
        assertEquals(2.80, dogems.priceFor(visitor), 0.01);
    }

    @Test
    public void priceForYoung() {
        assertEquals(1.40, dogems.priceFor(visitorYoung), 0.01);
    }

    @Test
    public void isReviewed() {
        assertTrue(dogems instanceof IReviewed);
    }

}
