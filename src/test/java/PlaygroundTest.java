import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("The Play-Around-Play-Ground", 0.00, 3);
    }

    @Test
    public void hasName(){
        assertEquals("The Play-Around-Play-Ground", playground.getName());
    }

    @Test
    public void mustBeUnderFifteen(){
        visitor = new Visitor("Henry", 11, 100.00, 5.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
