
/**
 * My tests for the SinglyLinkedList.
 * @author Maniya Dahiya
 * @version 1.0
 */

 public class SinglyLinkedListTest {

    /**
    testPushBackAddsOneNode
    testPopBackRemovesCorrectNode
    testEraseRemovesCorrectNode
    testEraseDoesNothingIfNoNode
    testElementAtReturnNode
    testElementAtReturnsNoNodeIfIndexDoesNotExist
    testSizeReturnsCorrectSize
    */

    public boolean testPushBackAddsOneNode(){
        SinglyLinkedList list = new SinglyLinkedList()<Integer>;
        list.push(5);
        if (list.size() == 1) {
            return True;
        }
        return False;
    }

    public boolean testPopBackRemovesCorrectNode(){
        SinglyLinkedList list = new SinglyLinkedList()<Integer>;
        int removed = list.pop();
        if (list.size() == 1 && removed == 5) {
            return True;
        }
        return False;
    }

    public boolean testSizeReturnsCorrectSize() {
        SinglyLinkedList list = new SinglyLinkedList()<Integer>;
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        if (size() == 4) {
            return True;
        }
        return False;
    }

    
}
