package Stack_Queue.SortStackUsingStack;

import java.util.ArrayList;

class Stack<T> {
    
    private ArrayList<T> stackList = new ArrayList<>();  
    
    public ArrayList<T> getStackList() {
        return stackList;
    }
    
    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }
    
    public boolean isEmpty() {
        return stackList.size() == 0;
    }
    
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }
    
    public int size() {
        return stackList.size();
    }
    
    public void push(T value) {
        stackList.add(value);
    }
    
    public T pop() {
        if (isEmpty()) return null;
        return stackList.remove(stackList.size() - 1);
    }
    
}

public class Main{
    
    // WRITE THE SORTSTACK METHOD HERE //
public static void sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            // Step 1: Pop the top element from inputStack
            int temp = inputStack.pop();

            // Step 2: Transfer elements from tempStack back to inputStack
            // until we find the right position for 'temp'
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                inputStack.push(tempStack.pop());
            }

            // Step 3: Place 'temp' in the correct location in tempStack
            tempStack.push(temp);
        }

        // Step 4: Transfer the sorted elements back to the inputStack
        while (!tempStack.isEmpty()) {
            inputStack.push(tempStack.pop());
        }
    }
    /////////////////////////////////////


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }
    
}

