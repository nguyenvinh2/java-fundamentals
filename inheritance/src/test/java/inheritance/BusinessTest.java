package inheritance;

import org.junit.Test;

import java.nio.BufferOverflowException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BusinessTest {

    @Test
    public void constructTest() {
        String name = "Test";
        Business test = new Business(name);
        assertEquals(name, test.name);
    }

    @Test
    public void getterSetterPriceTest() {
        String name = "Test";
        Business test = new Business(name);
        test.setPrice(4);
        assertEquals("$$$$", test.getPrice().toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void priceTestFailUpper() {
        String name = "Test";
        Business test = new Business(name);
        test.setPrice(7);
    }

    @Test(expected = IllegalArgumentException.class)
    public void priceTestFailLower() {
        String name = "Test";
        Business test = new Business(name);
        test.setPrice(0);
    }

    @Test
    public void addReview() {
        Business test = new Business("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void addReviewDuplicateTest() {
        Business test = new Business("Test");
        Review reviewTest = new Review("heyoo");
        test.addReview(reviewTest);
        test.addReview(reviewTest);
        List expected = new ArrayList<>();
        expected.add(reviewTest);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void averageTest() {
        Business test = new Business("Test");
        Review reviewTest = new Review("heyoo",5);
        Review reviewTestTwo = new Review("heyoo",1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        assertEquals(rating, test.getRating(), 0);
    }

    @Test
    public void averageTestDuplicate() {
        Business test = new Business("Test");
        Review reviewTest = new Review("heyoo",5);
        Review reviewTestTwo = new Review("heyoo",1);
        double rating = (reviewTest.getStars() + reviewTestTwo.getStars())/2;
        test.addReview(reviewTest);
        test.addReview(reviewTestTwo);
        test.addReview(reviewTest);
        assertEquals(rating, test.getRating(), 0);
    }

}