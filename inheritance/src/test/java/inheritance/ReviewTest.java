package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
        public void testReviewParameter(){
        Review input = new Review("Bad service but good food", "Hess", 2);
        int output=2;
        assertEquals(input.getStars(),output);
    }
    @Test
    public void testBodyParameter(){
        Review input = new Review("Bad service but good food", "Hess", 2);
        String output= "Bad service but good food";
        assertEquals(input.getBody(),output);
    }
    @Test
    public void testToString(){
        Review input = new Review("Bad service but good food", "Hess", 2);
        String output= "Author: Hess\n Comments: Bad service but good food\n Rating: 2";
        assertEquals(input.toString(),output);
    }


}