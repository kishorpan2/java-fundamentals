package inheritance;

import org.junit.Test;
import java.util.List;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testToString(){
        Shop input = new Shop("workShop ","this shop does nothing ","$5");
        String output= "workShop has reviews this shop does nothing $5";
        assertEquals(input.toString(),output);
    }
    @Test
    public void testReview(){
        Review testRev = new Review("They have bear food only", "Bottay", 4);
        Shop input = new Shop("HungryBear", "They have bear food only", "$5");
        String outPut="They have bear food only";
        input.addReviews(testRev);
        List<Review> testReviewlist = input.reviews;
        assertEquals(testReviewlist.get(0).getBody(), outPut);
    }

}