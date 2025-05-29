package DoublyLinkedList.DLL_SwapNodesInPairs;

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

    public void swapPairs(){
        if(head==null || head.next==null) return;
        
        Node dummy = new Node(-1);
        dummy.next = head;
        head.prev = dummy;
        Node prev = dummy;
        
        while(prev.next != null && prev.next.next != null){
            Node first = prev.next;
            Node second = first.next;
            
            first.next = second.next;
            if (second.next != null) {
                second.next.prev = first;
            }
            first.prev = second;
            second.prev = prev;
            second.next = first;
            prev.next = second;
            
            prev = first;
        }
        
        head = dummy.next;
        head.prev = null;
        
    }
    
}


public class Main {
    public static void main(String[] args) {
        
        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            myDll before swapPairs:
            1 <-> 2 <-> 3 <-> 4
            
            myDll after swapPairs:
            2 <-> 1 <-> 4 <-> 3

        */

    }

}