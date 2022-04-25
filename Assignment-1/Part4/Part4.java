import java.util.NoSuchElementException;

public class Part4 {
/**
 * Node class used for implementing the SinglyLinkedList.
 * @author Maniya Dahiya
 * @version 1.0
 */

public class Node {

    public int data;
    public  Node next;

    public  Node(int data) {
        this.data = data ;
        this.next = null ;
    }
}


/**
 * My implementation of the SinglyLinkedList.
 * @author Maniya Dahiya
 * @version 1.0
 */


public class SinglyLinkedList {



    private  Node head;
    int size;

    public SinglyLinkedList() {
        size = 0;
    }

    public void push(Node node) {
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

    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException("Data cannot be removed from an empty list.");
        }
        Node current = head;
        int temp;
        if(current.next.next != null) {
            current = current.next;
        }
        temp = current.next.data;
        current.next = null;
        size--;
        return temp;
    }

    public void insert(int index, Node node) {
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

    public Node elementAt(int index) {
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
        while (fast != null && fast.next !=null) {
            fast = fast.next.next ;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}



public static void main(String args[]){
    SinglyLinkedList dummyNode = new SinglyLinkedList();
    System.out.println("Size: " + dummyNode.size());
    dummyNode.printList();
    dummyNode.push(new Node(1));
    System.out.println("Size: " + dummyNode.size());
    System.out.println(dummyNode.pop());
    dummyNode.push(new Node(2));
    dummyNode.printList();
    System.out.println("Size: " + dummyNode.size());
    dummyNode.push(new Node(3));
    dummyNode.push(new Node(4));

    dummyNode.remove(2);
    System.out.println("Removed index 1: ");
    dummyNode.printList();
    System.out.println("Size: " + dummyNode.size());
    dummyNode.remove(3);
    
    System.out.println("Insert 20 at index 3");
    dummyNode.insert(2, new Node(20));

    System.out.println("Check element at index 3: ");
    System.out.println(dummyNode.elementAt(3));

    dummyNode.printList();
    System.out.println("Size: " + dummyNode.size());
    System.out.println(dummyNode.hasCycle());

}

}



