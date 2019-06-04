package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testToString(){
        Restaurant obj = new Restaurant("Hxx",4,"5");
        assertEquals("checking output",
        "A restaurant named with stars Hxx4", obj.toString());
    }

}