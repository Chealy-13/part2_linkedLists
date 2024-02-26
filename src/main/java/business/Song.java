package business;

/**
 *
 * @author michelle
 */
public class Song {
//Implement a class named Song. A Song is made up of two String fields:
//an artist and a title.
private String artist;
private String title;

// Your Song class should provide the following functionality:
//1. A default constructor that sets the artist to “Joe Bloggs” and title to “Mmmbop”.
    /**
     * default constructor for song class
     * sets artist to "Joe Bloggs" and title to "Mmmbop"
     */
    public Song() {
        this.artist = "Joe Bloggs";
        this.title = "Mmmbop";
    }

//2. A constructor that takes in two parameters – the artist and the title.
    /**
     * Constructor for song class with parameters
     * @param artist
     * @param title
     */
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }
//3. Getter and setter methods for the artist and title.

//4. An equals() method and a hashCode() method – these should base their
// calculation on the artist and title fields.

//5. A toString() method that returns the artist and title information in
// a well-formatted manner

}
