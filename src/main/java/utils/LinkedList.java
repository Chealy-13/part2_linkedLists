package utils;

import business.Song;

/**
 *
 * @author michelle
 */
public class LinkedList {
private Node head;
private Node tail;
private int numElements;

protected static class Node{
    //do i need this class and getters and setters, are we not already doing this in the song class?
    private Song data;
    private Node next;

    public Node(Song data){
        this.data = data;
        next = null;
    }
    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public void setData(Song data){
        this.data = data;
    }

    public Song getData(){
        return this.data;
    }
}
//1. A method called size() that takes no parameters & returns the number of Songs currently stored in your list.
    /**
     * Returns the num of songs currently in the list
     * @return size of the list
     */
public int size(){
    return numElements;
}
//2. A method called get() that takes one parameter, an int representing the position from which data should be
//    retrieved. The position should be validated and invalid positions handled accordingly.
//    If the position is valid, the method should return the data (a Song) in the position specified.
    /**
     * Returns song at specific position in list
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

}
