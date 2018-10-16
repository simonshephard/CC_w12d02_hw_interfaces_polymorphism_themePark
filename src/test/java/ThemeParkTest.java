import attractions.Dogems;
import interfaces.IReviewed;
import org.junit.Before;
import org.junit.Test;
import park.ThemePark;
import park.Visitor;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private TobaccoStall tobaccoStall;
    private Dogems dogems;
    private Visitor visitor;
    private Visitor visitorYoung;

    @Before
    public void before() {
        themePark = new ThemePark();
        dogems = new Dogems("Dogems");
        tobaccoStall = new TobaccoStall("TobaccoStall", "Owner1", 1);
        visitor = new Visitor(20, 1.76, 33.67);
        visitorYoung = new Visitor(10, 2.12, 33.67);
    }

    @Test
    public void countAttractions() {
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void countStalls() {
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void addAttraction() {
        themePark.addAttraction(dogems);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void addStall() {
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void getAllReviewed() {
        themePark.addAttraction(dogems);
        themePark.addStall(tobaccoStall);
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void getAllAllowedFor() {
        themePark.addAttraction(dogems);
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.getAllAllowedFor(visitor).size());
    }

}
