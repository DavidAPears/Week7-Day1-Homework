import org.junit.Test;

import java.lang.reflect.Type;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

    Attraction attraction;

    @Test
    public void rollercoasterAsAttraction() {
        attraction = new Rollercoaster("The Corkscrew", 8.40);
        assertEquals("The Corkscrew", attraction.getName());
    }

    @Test
    public void dodgemsAsAttraction() {
        attraction = new Dodgems("The Dodge Derby", 4.50);
        assertEquals("The Dodge Derby", attraction.getName());
    }

}




