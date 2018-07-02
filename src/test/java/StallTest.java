import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StallTest {

    Stall stall;

    @Test
    public void iceCreamStallAsStall() {
        stall = new IceCreamStall("Mr Whippy", "Simon Jones", 78, true);
        assertEquals("Mr Whippy", stall.getName());
    }

    @Test
    public void candyFlossStallAsStall() {
        stall = new CandyFlossStall("Pink N Fluffy", "Jessica Jackson", 35, true);
        assertEquals("Pink N Fluffy", stall.getName());
    }

    @Test
    public  void tobaccoStallAsStall() {
        stall = new TobaccoStall ("Mr Fags", "George McDuff", 18, false);
        assertEquals("Mr Fags", stall.getName());
    }
}
