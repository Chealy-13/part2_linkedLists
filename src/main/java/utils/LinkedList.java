package utils;

import business.Song;

/**
 * @author michelle
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int numElements;


//1. A method called size() that takes no parameters & returns the number of Songs currently stored in your list.

    /**
     * Returns the num of songs currently in the list
     *
     * @return size of the list
     */
    public int size() {
        return numElements;
    }

//2. A method called get() that takes one parameter, an int representing the position from which data should be
//    retrieved. The position should be validated and invalid positions handled accordingly.
//    If the position is valid, the method should return the data (a Song) in the position specified.

    /**
     * Returns song at specific position in list
     *
     * @param pos of song to returned
     * @return song/element at position
     * @throws IndexOutOfBoundsException if the index is out of range i.e below 0 or too big for list size
     */
    public Song get(int pos) {
        if (pos < 0 || pos >= numElements) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + pos);
        } else {
            Node current = head;
            for (int i = 0; i < pos; i++) {
                current = current.next;
            }
            return current.data;
        }
    }

//3.A method called indexOf() that takes one parameter, a Song to be found in the list. The method should
//return an int indicating the position at which the Song could be found. If the Song could not be found, an
//appropriate value should be returned to indicate this
    /**
     * Returns the position in list of song/element
     * @param song
     * @return index of song or -1 if song not found
     */
    public int indexOf(Song song) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(song)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

//4. A method called add() that takes a single parameter,
// a Song to be added to the end of the list.
    /**
     * Adds new song to end of the list
     * @param song to be added
     * @return true if song added
     */
    public boolean add(Song song) {
        Node newNode = new Node(song);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        numElements++;
        return true;
    }

//5.A method called isEmpty() that takes no parameters.
//This should return a boolean indicating if there is data
//currently stored in the list
    /**
     * returns true or false depending on if list is empty or not
     * @return true if list empty, false otherwise
     */
    public boolean isEmpty() {
        return numElements == 0;
    }


    protected static class Node {
        //do i need this class and getters and setters, are we not already doing this in the song class?
        private Song data;
        private Node next;

        public Node(Song data) {
            this.data = data;
            next = null;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public void setData(Song data) {
            this.data = data;
        }

        public Song getData() {
            return this.data;
        }
    }
}
