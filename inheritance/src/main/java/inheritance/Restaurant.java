package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    private double stars;
    private int price;
    public List<Review> reviews = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, int price) {
        this.name = name;
        setPrice(price);
    }

    private void calculateStars() {
        double sum = 0;
        for(int i = 0; i < reviews.toArray().length; i++) {
            sum += ((Review)reviews.toArray()[i]).getStars();
        }
        stars = (sum/reviews.toArray().length * 100) / 100;
    }

    public double getRating() {
        return stars;
    }

    public void setPrice(int price) {
        if(price < 6 && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("The price must be between 1-5");
        }
    }

    public StringBuilder getPrice() {
        StringBuilder money = new StringBuilder();
        for(int i = 0; i < price; i++) {
            money.append("$");
        }
        return money;
    }

    public void addReview(Review review) {
        if(!reviews.contains(review)) {
            reviews.add(review);
            calculateStars();
        }
    }

    public String toString() {
        String restaurantInfo = "Name: " + name + ", Average Rating: " + stars + " stars, Price: " + getPrice() + ", Reviews: " + reviews;
        return restaurantInfo;
    }

}
