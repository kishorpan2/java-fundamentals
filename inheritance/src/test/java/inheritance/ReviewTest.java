package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testToString(){
        Review obj = new Review("Not bad","XXYYYZZZ",5);
        assertEquals("checking output",
                "A review XXYYYZZZ5", obj.toString());
    }
    @Test
    public void updatedTestToString(){
        Restaurant obj = new Restaurant("Hxx",4,"5");
        Review obj1 = new Review("Not bad","XXYYYZZZ",obj,5);
        assertEquals("Hxx",
         obj1.name);
    }
}