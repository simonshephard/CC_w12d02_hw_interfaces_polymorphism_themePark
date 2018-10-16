import park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(20, 1.76, 33.67);
    }

    @Test
    public void getAge() {
        assertEquals(20, visitor.getAge());
    }
    @Test
    public void getHeight() {
        assertEquals(1.76, visitor.getHeight(), 0.01);
    }
    @Test
    public void getMoney() {
        assertEquals(33.67, visitor.getMoney(), 0.01);
    }
}
