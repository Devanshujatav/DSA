package in.devanshu.code.EvenOddList;

public class EvenOddList {

    public static class Node{
        int data;
        Node next;

        public Node(){
            // Default Constructor
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node evenOddList(Node head){
        Node even = new Node(0);
        Node odd = new Node(0);
        Node tempOdd = odd;
        Node tempEven = even;
        Node temp = head;

        while (temp!=null){
            tempOdd.next = temp;
            temp = temp.next;
            tempOdd = tempOdd.next;

            tempEven.next = temp;
            if (temp == null){
                break;
            }
            temp = temp.next;
            tempEven = tempEven.next;
        }

        odd = odd.next;
        even = even.next;
        tempOdd.next = even;
        return odd;
    }
}
