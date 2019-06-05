package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void getterSetterTest() {
        Shop test = new Shop("onbody",4, "its a me");
        assertEquals("onbody", test.name);
    }

    @Test
    public void toStringTest() {
        Shop test = new Shop("onbody",4, "its a me");
        assertEquals("Shop Name: " + "onbody" + ", Average Rating: " + test.getRating() + " stars, Price: " + test.getPrice() + ", Description: " + "its a me" +  ", Reviews: " + test.reviews, test.toString());
    }

    @Test
    public void addReviewTest() {
        Shop test = new Shop("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void addReviewDuplicateTest() {
        Shop test = new Shop("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void averageTest() {
        Shop test = new Shop("Test");
        Review reviewTest = new Review("heyoo",5);
        Review reviewTestTwo = new Review("heyoo",1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        assertEquals(rating, test.getRating(), 0);
    }

    @Test
    public void averageTestDuplicate() {
        Shop test = new Shop("Test");
        Review reviewTest = new Review("heyoo",5);
        Review reviewTestTwo = new Review("heyoo",1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        test.addReview(reviewTest);
        assertEquals(rating, test.getRating(), 0);
    }

}