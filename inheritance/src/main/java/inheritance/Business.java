package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Business {
    public String name;
    private int price;
    public List<Review> reviews = new ArrayList<>();
    private double stars;

    public Business() {

    }

    public Business(String name) {
        this.name = name;

    }

    public Business(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void setPrice(int price) {
        if(price < 6 && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("The price must be between 1-5");
        }
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
            reviews.get(reviews.size() -1).businessName = this.name;
        }
    }
}
