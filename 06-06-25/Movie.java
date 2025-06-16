public class Movie {
    // Members
    private String name;
    private double rating;
    private String duration; // e.g., "120 min"

    // Constructor
    public Movie(String name, double rating, String duration) {
        this.name = name;
        this.rating = rating;
        this.duration = duration;
    }

    // Determine if the movie is a "hit"
    public boolean is_Hit() {
        return rating >= 7;
    }

    // Get full details of the movie
    public String details() {
        return String.format(
            "Name     : %s%n" +
            "Rating   : %.1f%n" +
            "Duration : %s%n" +
            "Is Hit?  : %s",
            name,
            rating,
            duration,
            is_Hit() ? "Yes" : "No"
        );
    }

    // Demo usage
    public static void main(String[] args) {
        Movie m1 = new Movie("Dragon", 8.8, "148 min");
        

        System.out.println("Movie  Details:\n" + m1.details());
        
    }
}