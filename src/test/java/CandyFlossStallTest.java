import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before() {
        candyFlossStall = new CandyFlossStall("Pink N Fluffy", "Jessica Jackson", 35,true, 7 );
    }

    @Test
    public void getRating() {
        assertEquals(7, candyFlossStall.getRating());
    }
}
