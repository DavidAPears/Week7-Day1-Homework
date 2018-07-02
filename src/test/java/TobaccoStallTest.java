import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Mr Fags", "George McDuff", 18, false, 1);
    }

    @Test
    public void mustBeOverEighteen() {
        visitor = new Visitor("Sharon", 19, 120.00, 55.00);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

}
