package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testToString(){
        Shop input = new Shop("workShop ","this shop does nothing ","$5");
        String output= "workShop has reviews this shop does nothing $5";
        assertEquals(input.toString(),output);
    }


}