package in.devanshu.code.Seperate_odd_even;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class OddEvenSplitterApproch2 {
    public static Node add(Node head , int data){
        Node newNode = new Node(data);

        if (head == null){
            return newNode;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node[] splitEvenOdd(Node head){
        Node evenHead = null;
        Node oddHead = null;

        Node current = head;

        while(current != null){
            if (current.data % 2 == 0){
                evenHead = add(evenHead , current.data);
            }else {
                oddHead = add(oddHead , current.data);
            }

            current = current.next;
        }

        return new Node[]{oddHead , evenHead};
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node[] result = splitEvenOdd(a);
        System.out.print("Odd Values : ");
        display(result[0]);

        System.out.print("Even Values : ");
        display(result[1]);
    }



}
