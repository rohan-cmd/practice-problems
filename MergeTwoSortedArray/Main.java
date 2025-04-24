package MergeTwoSortedArray;

class LinkedList {
    Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node mergeLL(Node list1, Node list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node dummy = new Node(-1);
        Node current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node getHead() {
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList LL1 = new LinkedList();
        LL1.append(1);
        LL1.append(3);
        LL1.append(5);

        LinkedList LL2 = new LinkedList();
        LL2.append(2);
        LL2.append(4);
        LL2.append(6);

        LinkedList merged = new LinkedList();
        LinkedList.Node mergedHead = merged.mergeLL(LL1.getHead(), LL2.getHead());

        merged.printLL(mergedHead);
    }
}
