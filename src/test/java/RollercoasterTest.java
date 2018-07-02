import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Corkscrew", 8.40, 9);
    }

    @Test
    public void mustBeOverTwelveAndLessThanOneHundredAndFortyFiveCM() {
        visitor = new Visitor("Ronnie", 15, 150.00, 28.00);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }




}
