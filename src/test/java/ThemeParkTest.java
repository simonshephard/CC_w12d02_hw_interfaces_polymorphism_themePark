import attractions.Dogems;
import attractions.Playground;
import attractions.Rollercoaster;
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
    private Playground playground;
    private Rollercoaster rollercoaster;
    private Visitor visitor;
    private Visitor visitorYoung;

    @Before
    public void before() {
        themePark = new ThemePark();
        dogems = new Dogems("Dogems");
        tobaccoStall = new TobaccoStall("TobaccoStall", "Owner1", 1);
        playground = new Playground("Playground");
        rollercoaster = new Rollercoaster("Rollercoaster");
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
        themePark.addAttraction(playground);
        themePark.addAttraction(rollercoaster);
        assertEquals(4, themePark.getAllReviewed().size());
    }

    @Test
    public void getAllAllowedFor() {
        themePark.addAttraction(dogems);
        themePark.addStall(tobaccoStall);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollercoaster);
        assertEquals(2, themePark.getAllAllowedFor(visitor).size());
    }

    @Test
    public void getAllAllowedForYoung() {
        themePark.addAttraction(dogems);
        themePark.addStall(tobaccoStall);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.getAllAllowedFor(visitorYoung).size());
//        test is excluding dogems because it does not implement ISecurity
//        ideally would include rides that do not implement ISecurity??
    }

    @Test
    public void reviewString() {
        themePark.addAttraction(dogems);
        themePark.addStall(tobaccoStall);
        assertEquals("Dogems: 0 TobaccoStall: 0 ", themePark.reviewString());
    }

}
