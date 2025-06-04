package Stack_Queue.EnqueueUsingStack;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // WRITE THE ENQUEUE METHOD HERE //
    public void enqueue(int value){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(value);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    ///////////////////////////////////
    
    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
public class Main {

    public static void main(String[] args) {

        // Create a new queue
        MyQueue q = new MyQueue();

        // Enqueue some values
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        // Output the front of the queue
        System.out.println("Front of the queue: " + q.peek());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());


        /*
            EXPECTED OUTPUT:
            ----------------
            Front of the queue: 1
            Is the queue empty? false

        */

    }

}