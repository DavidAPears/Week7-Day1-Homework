import org.junit.Test;

import java.lang.reflect.Type;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

    Attraction attraction;
    Playground playground;
    Visitor visitor;
    CandyFlossStall candyFlossStall;

    @Test
    public void rollercoasterAsAttraction() {
        attraction = new Rollercoaster("The Corkscrew", 8.40, 9);
        assertEquals("The Corkscrew", attraction.getName());
    }

    @Test
    public void dodgemsAsAttraction() {
        attraction = new Dodgems("The Dodge Derby", 4.50, 7);
        assertEquals("The Dodge Derby", attraction.getName());
    }

    @Test
    public void parkAsAttraction() {
        attraction = new Park("The Water Park", 0.00, 5);
        assertEquals("The Water Park", attraction.getName());
    }

    @Test
    public void playgroundAsAttraction() {
        attraction = new Playground("The Play-Around-Play-Ground", 0.00, 3);
        assertEquals("The Play-Around-Play-Ground", attraction.getName());
    }


}




