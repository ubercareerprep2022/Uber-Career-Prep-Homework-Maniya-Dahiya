import java.util.NoSuchElementException;

/**
 * My implementation of the SinglyLinkedList.
 * @author Maniya Dahiya
 * @version 1.0
 */


public class SinglyLinkedList {

    private  Node<T> head;
    int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public void push(Node<T> node) {
        if (head == null) {
            head = node;
            return;
        }
        Node current = head ;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        size++;
    }

    public Node<T> pop() {
        if (size == 0) {
            throw new NoSuchElementException("Data cannot be removed from an empty list.");
        }
        Node<T> current = head;
        Node<T> temp = null;
        if(current.next.next != null) {
            current = current.next;
        }
        temp = current.next.data;
        current.next = null;
        size--;
        return temp;
    }

    public void insert(int index,Node<T> node) {
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node cur = head;
            for (int i = 0; i < index - 1; i++)
                cur = cur.next;
            cur.next = node;
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            if (size == 0) {
                throw new NoSuchElementException("Data cannot be removed from an empty list.");
            } else {
                head = head.next;
        }
        } else {
            Node cur = head;
            for (int i = 0; i < index - 1; i++)
                cur = cur.next;
            cur.next = cur.next.next;
        }
        size--;
    }

    public Node<T> elementAt(int index) {
        if (size == 0) {
            return null;
        }
        Node cur = head;
        for (int i = 0; i < index - 1; i++)
            cur = cur.next;
        return cur;
    }

    public int size() {
        return size;
    }

    /**
     * Prints a string representation of the linked list
     */
    public void printList() {
        String result = "";
        Node current = head;
        while(current.next != null){
            result += current.data;
            if(current.next != null){
                    result += ", ";
            }
            current = current.next;
        }
        System.out.println("List: " + result);
    }

    public boolean hasCycle(){
        Node fast = head ;
        Node slow = head ;
        while (!fast && !fast.next) {
            fast = fast.next.next ;
            slow = slo.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

}