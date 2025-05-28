package LinkedList.LL_ReverseBetween;

class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        Node current = head;
        StringBuilder output = new StringBuilder();
        while (current != null) {
            output.append(current.value).append(" -> ");
            current = current.next;
        }
        // Remove the last " -> " and print the result
        if (output.length() > 0) {
            output.setLength(output.length() - 4);
            System.out.println(output.toString());
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE REVERSEBETWEEN METHOD HERE //
    public void reverseBetween(int m, int n) {
        if (head == null) return;
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        for (int i=0; i<m; i++){
            prev = prev.next;
        } 
        
        Node current = prev.next;
        
        for(int i=0; i<n-m; i++){
            Node newToMove = current.next;
            current.next = newToMove.next;
            newToMove.next = prev.next;
            prev.next = newToMove;
        }
        
        head = dummy.next;
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Create a linked list with values 1, 2, 3, 4, and 5
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("Original linked list: ");
        myLinkedList.printList();

        // Reverse a sublist within the linked list
        myLinkedList.reverseBetween(1, 3);
        System.out.println("\nReversed sublist (1, 3): ");
        myLinkedList.printList();

        // Reverse another sublist within the linked list
        myLinkedList.reverseBetween(0, 4);
        System.out.println("\nReversed entire linked list: ");
        myLinkedList.printList();

        // Reverse a sublist of length 1 within the linked list
        myLinkedList.reverseBetween(2, 2);
        System.out.println("\nReversed sublist of length 1 (2, 2): ");
        myLinkedList.printList();

        // Reverse an empty linked list
        LinkedList emptyList = new LinkedList(0);
        emptyList.makeEmpty();
        emptyList.reverseBetween(0, 0);
        System.out.println("\nReversed empty linked list: ");
        emptyList.printList();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            Original linked list: 
            1 -> 2 -> 3 -> 4 -> 5
            
            Reversed sublist (1, 3): 
            1 -> 4 -> 3 -> 2 -> 5
            
            Reversed entire linked list: 
            5 -> 2 -> 3 -> 4 -> 1
            
            Reversed sublist of length 1 (2, 2): 
            5 -> 2 -> 3 -> 4 -> 1
            
            Reversed empty linked list: 
            List is empty
        
        */

    }
    
}