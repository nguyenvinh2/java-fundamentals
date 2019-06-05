package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void toStringTest() {
        Theater test = new Theater("AMC", 5);
        test.movies.add("The Big Red One");
        assertEquals("Theater Name: " + "AMC" + ", Average Rating: " + test.getRating() + " stars, Price: " + test.getPrice() + ", Movies: " + "[The Big Red One]" + ", Reviews: " + test.reviews, test.toString());
    }

    @Test
    public void AddTheaterMovieReviewTest() {
        Theater test = new Theater("AMC", 5);
        MovieReview sample = new MovieReview("free","me", 5);
        List<MovieReview> expected = new ArrayList<>();
        expected.add(sample);
        test.addReview(sample);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void AddTheaterNormalReviewTest() {
        Theater test = new Theater("AMC", 5);
        Review sample = new Review("me", 5);
        List<Review> expected = new ArrayList<>();
        expected.add(sample);
        test.addReview(sample);
        assertEquals(expected, test.reviews);
    }

    @Test
    public void addMovieTest() {
        Theater test = new Theater("AMC", 5);
        List<String> expected = new ArrayList<>();
        expected.add("The big one");
        test.addMovie("The big one");
        assertEquals(expected, test.movies);
    }


    @Test
    public void addMovieDuplicateTest() {
        Theater test = new Theater("AMC", 5);
        List<String> expected = new ArrayList<>();
        expected.add("The big one");
        test.addMovie("The big one");
        test.addMovie("The big one");
        assertEquals(expected, test.movies);
    }

    @Test
    public void removeMovieTest() {
        Theater test = new Theater("AMC", 5);
        List<String> expected = new ArrayList<>();
        expected.add("The big one");
        expected.remove("The big one");
        test.addMovie("The big one");
        test.removeMovie("The big one");
        assertEquals(expected, test.movies);
    }

    @Test
    public void removeMovieDuplicateTest() {
        Theater test = new Theater("AMC", 5);
        List<String> expected = new ArrayList<>();
        expected.add("The big one");
        expected.remove("The big one");
        test.addMovie("The big one");
        test.removeMovie("The big one");
        test.removeMovie("The big one");
        assertEquals(expected, test.movies);
    }
}