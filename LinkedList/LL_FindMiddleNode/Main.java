package LinkedList.LL_FindMiddleNode;

class LinkedList{
    private Node head;
    private Node tail;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    } 

    public void append(int value){
        Node newNode = new Node(value);
        if (head==null) {
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
     
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public void printLL(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Main{
    public static void main(String[] args) {
        LinkedList LL = new LinkedList();

        LL.append(2);
        LL.append(4);
        LL.append(6);
        LL.append(8);
        LL.append(10);
        LL.append(12);

        LL.printLL();

        System.out.println("Middle element of LinkedList : " + LL.findMiddleNode().value);;
    }
}