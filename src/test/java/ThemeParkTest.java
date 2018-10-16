import org.junit.Before;
import org.junit.Test;
import park.ThemePark;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;

    @Before
    public void before() {
        themePark = new ThemePark();
    }

    @Test
    public void countAttractions() {
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void countStalls() {
        assertEquals(0, themePark.countStalls());
    }


}
