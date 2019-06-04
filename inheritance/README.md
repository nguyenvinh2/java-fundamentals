# inheritance

## Summary

This Java Library consists of two classes: Restaurant and Review

Review inherits from Restaurant but this contributes to little functionality

It has the follow properties and methods:

            public String author;
            public String body;
            private int stars;
       
            public Review(String restaurantName)
            public Review(String restaurantName, String author, int rating)   
            public void setStars(int rating)   
            public int getStars()
            public String toString()
            
Restaurant contains a List of associated Review objects

            public String name;
            private double stars;
            private int price;
            public List<Review> reviews = new ArrayList<>();
        
            public Restaurant(String name)
            public Restaurant(String name, int price)
            private void calculateStars()
            public double getRating()
            public void setPrice(int price)
            public StringBuilder getPrice()
            public void addReview(Review review)
            public String toString()


Use addReview to add a review to the restaurant. This adds a review object to the reviews list and  automatically updates the average rating of
the restaurant. Private properties must use the associated Get/Set methods to alter the properties.
getRating is used to change the stars property for Restaurant.

Run prebuilt tests w/ ./gradlew test or run each Test script in the test folder individually.

