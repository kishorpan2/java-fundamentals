package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private Integer stars;
    private String price;

    // This will bring reviews into the restaurant so so can create multiple reviews for a restaurant

    private List<Review> reviewList;

    public Restaurant(String name, Integer stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviewList = new ArrayList<Review>();
    }

    public String getName() {
        return this.name;
    }

    public Integer getStars() {
        return this.stars;
    }

    private void setStar(int stars) {

        if (stars > 5 || stars < 0) {
            System.out.println("stars only between 0 to 5");
        } else {
            this.stars = stars;
        }

    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;

    }

    public String toString() {
        return String.format("A restaurant named with stars " + this.name + this.stars);

    }

}