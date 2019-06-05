package inheritance;

public class Shop extends Business {
    public String description;

    public Shop() {
    }

    public Shop(String name) {
        this.name = name;
    }

    public Shop(String name, int price) {
        super(name, price);
    }

    public Shop(String name, int price, String description) {
        super(name, price);
        this.description = description;

    }

    public String toString() {
        String shopInfo = "Shop Name: " + name + ", Average Rating: " + getRating() + " stars, Price: " + getPrice() + ", Reviews: " + reviews;
        return shopInfo;
    }
}
