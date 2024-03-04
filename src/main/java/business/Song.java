package business;

import java.util.Objects;

/**
 *
 * @author michelle
 */
//LINK FOR GITHUB
//https://github.com/Chealy-13/part2_linkedLists.git
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
    /**
     * Returns the artist of song
     * @return The name of the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Returns the title of song
     * @return The name of the title
     */
    public String getTitle() {
        return title;
    }

    //setters
    /**
     * Sets the artist of the song to the name of the artist
     * @param artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Sets the title of the song to the title name
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

//4. An equals() method and a hashCode() method – these should base their
// calculation on the artist and title fields.
public int hashCode(){
        int hash = 7;
        hash = 41 * hash * Objects.hashCode(this.artist);
        hash = 41 * hash * Objects.hashCode(this.title);
        return hash;
}
//5. A toString() method that returns the artist and title information in
// a well-formatted manner
    /**
     * returns string format of a song object using an artist and a title
     * @return string of song object
     */
    @Override
    public String toString() {
        return "Song{" + "artist=" + artist + ", title=" + title + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)){
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)){
            return false;
        }
        return true;
    }
}

