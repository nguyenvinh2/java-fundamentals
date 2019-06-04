package inheritance;

public class Review extends Restaurant {
    public String author;
    public String body;
    private int stars;

    public Review(String restaurantName) {
        super(restaurantName);
    }

    public Review(String restaurantName, String author, int rating) {
        super(restaurantName);
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
        return "Review for: " + super.name + " - Author: " + author + " - Review Rating: " + stars;
    }
}
