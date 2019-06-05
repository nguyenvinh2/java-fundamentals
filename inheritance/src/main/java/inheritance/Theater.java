package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Business {

    public List<String> movies = new ArrayList<>();

    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
    }

    public Theater(String name, int price) {
        super(name, price);
    }

    public String toString() {
        String shopInfo = "Theater Name: " + name + ", Average Rating: " + getRating() + " stars, Price: " + getPrice() + ", Movies: " + movies + ", Reviews: " + reviews;
        return shopInfo;
    }

    public void addMovie(String movie) {
        if(!movies.contains(movie)) {
            movies.add(movie);
        } else {
            System.out.println("This movie already exists");
        }
    }

    public void removeMovie(String movie) {
        if(movies.contains(movie)) {
            movies.remove(movie);
        } else {
            System.out.println("This movie does not exist");
        }
    }
}
