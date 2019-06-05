package inheritance;

import java.util.LinkedList;
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
     // to create reviews for the shop

    public void addReviews(Review newReview){
        if (this.reviews == null){
            List<Review> reviewList = new LinkedList<>();
            reviewList.add(newReview);
            this.reviews = reviewList;


        } else{
            this.reviews.add(newReview);
        }

    }
}