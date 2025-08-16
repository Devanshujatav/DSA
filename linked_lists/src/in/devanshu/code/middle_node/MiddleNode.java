package in.devanshu.code.middle_node;

class Node{
    int data;
    Node next;

    public Node(){
        // Default Constructor
    }

    public Node(int data){
        this.data = data;
    }

    public int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

}



public class MiddleNode {

    // Approch one
    private static Node middleNode(Node head){
        Node n = new Node();
        int length = n.size(head);
        int middleElement = length/2;
        Node temp = head;
        for (int i=1 ; i<=middleElement ; i++){
            temp = temp.next;
        }

        return temp;
    }


    // Approch two
    private static Node middleNodeOptimized(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
//        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
//        e.next = f;

        Node n = new Node();
        int size = n.size(a);
        System.out.println("Length of the Linked List : "+size);
        System.out.println("Middle Element of the Linked List : "+ middleNode(a).data);
    }
}
