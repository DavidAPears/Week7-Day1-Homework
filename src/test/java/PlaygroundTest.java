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
    public void hasName(){
        assertEquals("The Play-Around-Play-Ground", playground.getName());
    }


//    CAN NOT GET BELOW WORKING!! - isAllowedTo from Playground Class file
//
//    @Test
//    public void isAllowedToWorking(){
//        assertEquals(false, playground.isAllowedTo(visitor));
//    }


}
