package inheritance;

public class MovieReview extends Review {
    public String movie;

    public MovieReview() {
    }

    public MovieReview(String movie) {
        this.movie = movie;
    }

    public MovieReview(String movie, String author) {
        this.movie = movie;
        this.author = author;
    }

    public MovieReview(String movie, String author, int rating) {
        this.movie = movie;
        setStars(rating);
        this.author = author;
    }
    @Override
    public String toString() {
        return "Review for: " + businessName + " - Movie: " + movie + " - Author: " + author + " - Review Rating: " + getStars() + " - Body: " + body;
    }

}
