package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class MovieReviewTest {
    @Test
    public void getterSetterTest() {
        MovieReview test = new MovieReview("nie", "Dandelion", 5);
        assertEquals("nie", test.movie);
    }
    @Test
    public void toStringTest() {
        MovieReview test = new MovieReview("nie", "Dandelion", 5);
        assertEquals("Review for: " + null + " - Movie: " + "nie" + " - Author: " + "Dandelion" + " - Review Rating: " + 5 + " - Body: " + test.body, test.toString());
    }

    @Test
    public void movieReviewFail() {
        Shop test = new Shop();
        MovieReview sample = new MovieReview();
        test.addReview(sample);
        assertEquals(0, test.reviews.size());
    }

    @Test
    public void movieReviewPass() {
        Theater test = new Theater();
        MovieReview sample = new MovieReview();
        test.addReview(sample);
        assertEquals(1, test.reviews.size());
    }

}