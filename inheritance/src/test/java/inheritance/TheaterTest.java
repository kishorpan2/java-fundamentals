package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void testToString(){

        Theater input = new Theater("YourMovies");


        String outPut="YourMovies is not playing any movies right now";

       assertEquals(input.toString(),outPut);
    }

}