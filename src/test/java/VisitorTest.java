import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor;


    @Before
    public void before(){
        visitor = new Visitor("Charlie", 13, 110.00, 20.00);
    }

    @Test
    public void visitorHasName(){
        assertEquals("Charlie", visitor.getName());
    }

    @Test
    public void visitorHasAge(){
        assertEquals(13, visitor.getAge());
    }

    @Test
    public void visitorHasHeight(){
        assertEquals(110.00, visitor.getHeight(), 0.01);
    }

    @Test
    public void visitorHasMoney(){
        assertEquals(20.00, visitor.getMoney(), 0.01);
    }


}






