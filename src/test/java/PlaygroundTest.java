import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before() {
        playground = new Playground("The Play-Around-Play-Ground", 0.00);
    }

    @Test
    public void isAllowedToTest(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
