import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StallTest {

    Stall stall;

    @Test
    public void iceCreamStallAsStall() {
        stall = new IceCreamStall("Mr Whippy", "Simon Jones", 78, true);
        assertEquals("Mr Whippy", stall.getName());
    }
}
