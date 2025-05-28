package LinkedList.LL_SwapNodesinPairs;

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
        while (current  != null) {
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

    public void swapPairs() {
        
        if (head == null || head.next == null) return;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev to next pair
            prev = first;
        }

        head = dummy.next;
    }

}

public class Main {
       public static void main(String[] args) {

        System.out.println("Test 1: Even number of nodes");
        LinkedList ll1 = new LinkedList(1);
        ll1.append(2);
        ll1.append(3);
        ll1.append(4);
        System.out.print("BEFORE: ");
        ll1.printList();
        ll1.swapPairs();
        System.out.print("AFTER:  ");
        ll1.printList();

        System.out.println("\nTest 2: Odd number of nodes");
        LinkedList ll2 = new LinkedList(1);
        ll2.append(2);
        ll2.append(3);
        ll2.append(4);
        ll2.append(5);
        System.out.print("BEFORE: ");
        ll2.printList();
        ll2.swapPairs();
        System.out.print("AFTER:  ");
        ll2.printList();

        System.out.println("\nTest 3: Single node");
        LinkedList ll3 = new LinkedList(1);
        System.out.print("BEFORE: ");
        ll3.printList();
        ll3.swapPairs();
        System.out.print("AFTER:  ");
        ll3.printList();

        System.out.println("\nTest 4: Empty list");
        LinkedList ll4 = new LinkedList(1);
        ll4.makeEmpty();
        System.out.print("BEFORE: ");
        ll4.printList();
        ll4.swapPairs();
        System.out.print("AFTER:  ");
        ll4.printList();

        System.out.println("\nTest 5: Two nodes");
        LinkedList ll5 = new LinkedList(1);
        ll5.append(2);
        System.out.print("BEFORE: ");
        ll5.printList();
        ll5.swapPairs();
        System.out.print("AFTER:  ");
        ll5.printList();
    }
    
}