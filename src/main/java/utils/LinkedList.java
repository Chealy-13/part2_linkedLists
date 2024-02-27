package utils;

import business.Song;

/**
 *
 * @author michelle
 */
public class LinkedList {
private Node head;
private Node tail;

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


}
