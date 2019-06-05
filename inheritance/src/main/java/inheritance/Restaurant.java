package inheritance;

public class Restaurant extends Business {

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(String name, int price) {
        this.name = name;
        setPrice(price);
    }

    public String toString() {
        String restaurantInfo = "Restaurant Name: " + name + ", Average Rating: " + getRating() + " stars, Price: " + getPrice() + ", Reviews: " + reviews;
        return restaurantInfo;
    }

}
