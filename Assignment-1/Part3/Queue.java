import java.util.ArrayList;

/**
 * My implementation of an array based Queue.
 *
 * @author Maniya Dahiya
 * @version 1.0
 */


public class Queue {

    ArrayList<Integer> queueArray;

    public Queue() {
       queueArray = new ArrayList<Integer>();
    }

    public void enqueue(int data){
        queueArray.add(0, data);
    }

    public int dequeue(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        
        int dequeueVal = queueArray.get(size() - 1);
        queueArray.remove(size() - 1);
        return dequeueVal;
    }

    public int size() {
        return queueArray.size();
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int rear(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray.get(0);
    }
    
    public int front(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queueArray.get(size() - 1);
    }
    
}
