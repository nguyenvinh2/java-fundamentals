package inheritance;

public class Review {
    public String author;
    public String body;
    private int stars;
    public String businessName;

    public Review() {
    }

    public Review(String author, int rating) {
        setStars(rating);
        this.author = author;
    }

    public void setStars(int rating) {
        if(rating < 6 && rating >= 0) {
            stars = rating;
        } else {
            throw new IllegalArgumentException("The star rating must be between 0-5");
        }
    }

    public int getStars() {
        return stars;
    }

    public String toString() {
        return "Review for: " + businessName + " - Author: " + author + " - Review Rating: " + stars + " - Body: " + body;
    }
}
