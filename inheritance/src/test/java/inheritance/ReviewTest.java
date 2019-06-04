package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void constructTest() {
        String name = "Test";
        Review test = new Review(name);
        assertEquals(name, test.name);
    }

    @Test
    public void toStringTest() {
        String name = "Test";
        Review test = new Review(name);
        assertEquals("Review for: " + name + " - Author: " + test.author + " - Review Rating: " + test.getStars(), test.toString());
    }

    @Test
    public void getterSetterStarsTest() {
        String name = "Test";

        Review test = new Review(name);

        test.setStars(5);
        assertEquals(5, test.getStars());
    }

    @Test (expected = IllegalArgumentException.class)
    public void getterSetterStarsFailTest() {
        String name = "Test";
        Review test = new Review(name);
        test.setStars(7);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getterSetterStarsFailTestLower() {
        String name = "Test";
        Review test = new Review(name);
        test.setStars(-7);
    }

}