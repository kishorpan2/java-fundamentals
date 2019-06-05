package inheritance;

public class Review {
    private String body;
    private String author;
    public Integer stars;
    public String name;



    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getStars(){
        return this.stars;
    }
    private void setBody(String body){
        this.body = body;
    }
    private void setAuthor(String author){
        this.author = author;
    }
    private void setStars(int stars){
        this.stars = stars;
    }


    public Review(String body, String author, int stars){
        this.setBody(body);
        this.setAuthor(author);;
        this.setStars(stars);
    }
    public String toString() {
        StringBuilder review = new StringBuilder();
        review.append("Author: " + this.getAuthor() + "\n Comments: " + this.getBody() + "\n Rating: " + this.getStars());
        return review.toString();
    }


}
