package inheritance;

public class Review {
    private String body;
    private String author;
    public Integer stars;
    public String name;


    public Review(String body, String author, Integer stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return String.format("A review " + this.author + this.stars);
    }
public Review(String body, String author, Restaurant restaurant, int stars){
        this.body =body;
        this.author = author;
        this.name = restaurant.getName();
        this.stars = stars;
    }
    public String reviewToString() {
        return String.format("A restaurant named with stars " + this.name + this.stars);

    }
}
