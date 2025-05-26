package LinkedList.RemoveDuplicateFromLL;

import java.util.HashSet;
import java.util.Set;


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
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
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
        }
        length++;
    }
    
    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    // public void removeDuplicates() {
    //    Node current = head;

    //     while (current != null) {
    //         Node runner = current;
    //         while (runner.next != null) {
    //             if (runner.next.value == current.value) {
    //                 runner.next = runner.next.next;
    //                 length -= 1; 
    //             } else {
    //                 runner = runner.next;
    //             }
    //         }
    //         current = current.next;
    //     }      
    // }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    
}

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(1);
        myLinkedList.append(4);
        myLinkedList.append(2);
        myLinkedList.append(5);


        myLinkedList.removeDuplicates();

        myLinkedList.printList();
        
    }
    
}

