package DoublyLinkedList.DLL_Reverse_Between;

class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }
    
    public void makeEmpty() {
        head = null;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
 
     public void reverseBetween(int startIndex, int endIndex) {
        if(head==null) return;
        Node dummy = new Node(-1);
        dummy.next = head;
        head.prev = dummy;
        Node prev = dummy;
        
        for(int i=0; i<startIndex; i++){
            prev = prev.next;
        }
        
        Node cur = prev.next;
        
        for(int i=0; i<endIndex-startIndex; i++){
            Node nodeToMove = cur.next;
            cur.next = nodeToMove.next;
            if (nodeToMove.next != null) {
                nodeToMove.next.prev = cur;
            }
            nodeToMove.next = prev.next;
            prev.next.prev = nodeToMove;
            nodeToMove.prev = prev;
            prev.next = nodeToMove;
        }
        
        head = dummy.next;
        head.prev = null;
        
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Test 1: Middle segment reversal");
        DoublyLinkedList dll1 = new DoublyLinkedList(3);
        dll1.append(8);
        dll1.append(5);
        dll1.append(10);
        dll1.append(2);
        dll1.append(1);
        System.out.print("BEFORE: ");
        dll1.printList();
        dll1.reverseBetween(1, 4);
        System.out.print("AFTER:  ");
        dll1.printList();

        System.out.println("\nTest 2: Full list reversal");
        DoublyLinkedList dll2 = new DoublyLinkedList(1);
        dll2.append(2);
        dll2.append(3);
        dll2.append(4);
        dll2.append(5);
        System.out.print("BEFORE: ");
        dll2.printList();
        dll2.reverseBetween(0, 4);
        System.out.print("AFTER:  ");
        dll2.printList();

        System.out.println("\nTest 3: No-op on single node");
        DoublyLinkedList dll3 = new DoublyLinkedList(9);
        System.out.print("BEFORE: ");
        dll3.printList();
        dll3.reverseBetween(0, 0);
        System.out.print("AFTER:  ");
        dll3.printList();

        System.out.println("\nTest 4: Head included in reversal");
        DoublyLinkedList dll4 = new DoublyLinkedList(7);
        dll4.append(8);
        dll4.append(9);
        System.out.print("BEFORE: ");
        dll4.printList();
        dll4.reverseBetween(0, 2);
        System.out.print("AFTER:  ");
        dll4.printList();
        
    }
    
}