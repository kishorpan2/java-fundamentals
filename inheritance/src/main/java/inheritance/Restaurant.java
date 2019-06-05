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

    public int getStars() {
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
    public List<Review> getReviewList(){
        return this.reviewList;
    }
    private void setReview(Review review){
        updateStar(review.getStars());
        this.reviewList.add(review);
    }
    public void addReview(Review review){
        this.setReview(review);
    }
    private void updateStar(int rateStar){
        this.setStar((int)(rateStar + this.getStars())/2);
    }

    public String toString() {

    StringBuilder results = new StringBuilder();
    results.append("Restaurant: " + this.getName() + "\n Star: " + this.getStars() + "\n Price: " + this.getPrice());
    results.append(getReviews(this.getReviewList()));
    return results.toString();
    }

    private String getReviews(List<Review> list){
        if(list.size() > 0){
            StringBuilder review = new StringBuilder();
            review.append("\n Reviews:\n");
            for(Review item:list){
                review.append("Author: " + item.getAuthor() +"\n Comments: " + item.getBody() + "\n Rating: " + item.getStars());
            }
            return review.toString();
        }
        else{
            return "";
        }
    }
}
