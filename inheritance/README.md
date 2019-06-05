# inheritance

## Summary

This Java Library consists of several classes: Review, MovieReview, Business, Restaurant, Shop, Theater

MovieReview inherits from Review

Review has the follow properties and methods:

            public String author;
            public String body;
            private int stars;
       
            public Review(String restaurantName)
            public Review(String restaurantName, String author, int rating)   
            public void setStars(int rating)   
            public int getStars()
            public String toString()

MovieReview has one extra property:

              public String movie;
              public MovieReview()
              public MovieReview(String movie)
              public MovieReview(String movie, String author)
              public MovieReview(String movie, String author, int rating)
              
              @Override
              public String toString()          

Business contains a List of associated Review objects

            public String name;
            private double stars;
            private int price;
            public List<Review> reviews = new ArrayList<>();
        
            public Business(String name)
            public Business(String name, int price)
            private void calculateStars()
            public double getRating()
            public void setPrice(int price)
            public StringBuilder getPrice()
            public void addReview(Review review)

Restaurant inherits from Business and contains the following:

            public Restaurant(String name)
            public Restaurant(String name, int price)
            public String toString()

Shop inherits from Business and has the following:

            public String description;
            public Shop()
            public Shop(String name)
            public Shop(String name, int price)
            public Shop(String name, int price, String description)
            public String toString()

Theater is similar:

            public List<String> movies = new ArrayList<>();      
            public Theater()
            public Theater(String name)      
            public Theater(String name, int price)        
            public String toString()        
            public void addMovie(String movie)        
            public void removeMovie(String movie)

Use addReview to add a review to the restaurant or other businesses. This adds a review object to the reviews list and  automatically updates the average rating of
the restaurant. Private properties must use the associated Get/Set methods to alter the properties.
getRating is used to change the stars property for Restaurant.

Run prebuilt tests w/ ./gradlew test or run each Test script in the test folder individually.

