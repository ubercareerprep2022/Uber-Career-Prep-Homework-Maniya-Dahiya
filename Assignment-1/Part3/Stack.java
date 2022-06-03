import java.util.ArrayList;

/**
 * My implementation of an array based Stack.
 *
 * @author Maniya Dahiya
 * @version 1.0
 */

 public class Stack {
    ArrayList<Integer> stackArray;

    public Stack() {
        stackArray = new ArrayList<Integer>();
    }

    public void push(int data) {
        stackArray.add(size() - 1, data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedValue = top();
        stackArray.remove(size() - 1);
        return poppedValue;
    }

    public int size() {
        return stackArray.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray.get(size() - 1);
    }
    
 }