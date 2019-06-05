package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
 @Test
 public void testRestConstructor(){
     Restaurant res = new Restaurant("TT",4,"5");
     String output = "5";
     assertEquals(res.getPrice(),output);
 }

    @Test
    public void testAddReview(){
        Restaurant qq = new Restaurant("QQ",2, "5");
        Restaurant JJ = new Restaurant("JJ", 4, "6");

        Review r1 = new Review("Not bad", "Abadam",2);
        Review r2 = new Review("Not too bad", "Bbadam",3);
        qq.addReview(r1);
        JJ.addReview(r2);

        String output = "Abadam";
        assertEquals(qq.getReviewList().get(0).getAuthor(), output);
    }
    @Test
    public void testReviews(){
        Restaurant cc = new Restaurant ("cc",2,"5");
        Restaurant dd = new Restaurant("dd", 4, "3");

        Review r1 = new Review("They have great food", "Hans", 4);
        Review r2 = new Review("I feel ripped off","Gullivers",1 );
            cc.addReview(r1);
            dd.addReview(r2);
            int output = 3;
            assertEquals(cc.getStars(),output);
    }


}