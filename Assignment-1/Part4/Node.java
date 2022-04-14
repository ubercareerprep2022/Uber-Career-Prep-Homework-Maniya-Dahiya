/**
 * Node class used for implementing the SinglyLinkedList.
 * @author Maniya Dahiya
 * @version 1.0
 */

 public class Node<T> {
    
    private T data;
    private  Node<T> next;

    public  Node(T data) {

        this.data = data ;
        this.next = null ;
    }
}
