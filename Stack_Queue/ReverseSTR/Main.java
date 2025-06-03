package Stack_Queue.ReverseSTR;
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

public class Main {

    // WRITE THE REVERSESTRING METHOD HERE //
    static String reverseString (String str){
        Stack<Character> myStack = new Stack<>();
        StringBuilder revSTR = new StringBuilder("");
        
        for(int i=0; i<str.length(); i++){
            myStack.push(str.charAt(i));
        }
        
        while(!myStack.isEmpty()){
            revSTR.append(myStack.pop());
        }
        
        return revSTR.toString(); 
    }
    /////////////////////////////////////////
    
    
    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}

