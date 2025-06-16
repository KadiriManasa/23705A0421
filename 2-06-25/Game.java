public class Game {
    // Members
    private String title;
    private String journal;
    private int playCount;
    private double rating; // rating out of 5.0
    private boolean familyFriendly;

    // Constructor
    public Game(String title, String journal, double rating, boolean familyFriendly) {
        this.title = title;
        this.journal = journal;
        this.rating = rating;
        this.familyFriendly = familyFriendly;
        this.playCount = 0;
    }

    // Method: play()
    public void play() {
        // Simulate playing the game
        System.out.println("You played \"" + title + "\"!");
        playCount++;
    }

    // Method: isFamilyFriendly()
    public boolean isFamilyFriendly() {
        return familyFriendly;
    }

    // Method: getSummary()
    public String getSummary() {
        String friendlyText = isFamilyFriendly() ? "Yes" : "No";
        return String.format(
            "Title            : %s%n" +
            "Journal          : %s%n" +
            "Play Count       : %d%n" +
            "Rating           : %.1f/5%n" +
            "Family Friendly? : %s",
            title, journal, playCount, rating, friendlyText
        );
    }

    // For demonstration
    public static void main(String[] args) {
        Game g = new Game(
            "Super Fun Adventure",
            "Exploring mysterious islands and colorful caves.",
            4.7,
            true
        );

        g.play(); // play once
        g.play(); // play again

        System.out.println("\nGame Summary:");
        System.out.println("-------------");
        System.out.println(g.getSummary());
    }
}