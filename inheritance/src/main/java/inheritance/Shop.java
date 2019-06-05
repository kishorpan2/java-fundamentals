package inheritance;

import java.util.List;

public class Shop {
    protected String name;
    protected String description;
    protected String price;
    protected List<Review> reviews;

    public Shop(String name, String description,String price){

        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = null;
    }
public String toString(){
return this.name + "has reviews "  + this.description + this.price;
}
}