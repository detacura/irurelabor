public class Movie {
    private String title;
    private float rating = 8.2f; // Private field with initial value

    // Constructor to initialize the title of the movie
    public Movie(String title) {
        this.title = title;
    }

    // Getter method for rating
    public float getRating() {
        return rating;
    }

    // Setter method for rating
    public void setRating(float rating) {
        this.rating = rating;
    }

    // Method to display details of the movie
    public void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Rating: " + rating);
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating an instance of Movie
        Movie movie = new Movie("Inception");

        // Displaying initial details
        movie.displayDetails();

        // Changing the rating using setter method
        movie.setRating(8.8f);

        // Displaying updated details
        movie.displayDetails();
    }
}
