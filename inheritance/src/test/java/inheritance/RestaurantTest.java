package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void constructTest() {
        String name = "Test";
        Restaurant test = new Restaurant(name);
        assertEquals(name, test.name);
    }

    @Test
    public void getterSetterPriceTest() {
        String name = "Test";
        Restaurant test = new Restaurant(name);
        test.setPrice(4);
        assertEquals("$$$$", test.getPrice().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void priceTestFailUpper() {
        String name = "Test";
        Restaurant test = new Restaurant(name);
        test.setPrice(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void priceTestFailLower() {
        String name = "Test";
        Restaurant test = new Restaurant(name);
        test.setPrice(0);
    }

    @Test
    public void addReview() {
        Restaurant test = new Restaurant("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void addReviewDuplicateTest() {
        Restaurant test = new Restaurant("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void averageTest() {
        Restaurant test = new Restaurant("Test");
        Review reviewTest = new Review("heyoo",null,5);
        Review reviewTestTwo = new Review("heyoo",null,1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        assertEquals(rating, test.getRating(), 0);
    }

    @Test
    public void averageTestDuplicate() {
        Restaurant test = new Restaurant("Test");
        Review reviewTest = new Review("heyoo",null,5);
        Review reviewTestTwo = new Review("heyoo",null,1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        test.addReview(reviewTest);
        assertEquals(rating, test.getRating(), 0);
    }

    @Test
    public void toStringTest() {
        String name = "Test";
        Restaurant test = new Restaurant(name);
        assertEquals("Name: " + name + ", Average Rating: " + test.getRating() + " stars, Price: " + test.getPrice() + ", Reviews: " + test.reviews, test.toString());
    }
}