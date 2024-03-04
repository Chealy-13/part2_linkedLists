package utils;

import business.Song;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class LinkedListExtraTests {
    @Test
    public void testAddWhenListFull() {
        // Create LinkedList
        LinkedList playlist = new LinkedList();
        // Adding songs until the list is full
        assertTrue(playlist.add(new Song("artist A","Song 1")));
        assertTrue(playlist.add(new Song("artist B","Song 2")));
        assertTrue(playlist.add(new Song("artist C","Song 3")));
        assertTrue(playlist.add(new Song("artist D","Song 4")));
        assertTrue(playlist.add(new Song("artist E","Song 5")));
        assertTrue(playlist.add(new Song("artist F","Song 6")));
        assertTrue(playlist.add(new Song("artist G","Song 7")));
        assertTrue(playlist.add(new Song("artist H","Song 8")));
        assertTrue(playlist.add(new Song("artist I","Song 9")));
        assertTrue(playlist.add(new Song("artist J","Song 10")));

        // add one more song when the list is full
        assertFalse(playlist.add(new Song("artist K","Song 11")));
    }

    @Test
    public void testAddEmptyList() {
        LinkedList mySongs = new LinkedList();
        // Adding a song to an empty list
        assertTrue(mySongs.add(new Song("artist A","Song 1")));
        assertEquals(1, mySongs.size());
    }


    public LinkedListExtraTests() {


    }
}
