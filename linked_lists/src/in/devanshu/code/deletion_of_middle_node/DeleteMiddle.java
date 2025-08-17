package in.devanshu.code.deletion_of_middle_node;

class Node{
    int data;
    Node next;

    public Node(){
        // Default Constructor
    }

    public Node(int data){
        this.data = data;
    }

    public void show(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}

public class DeleteMiddle {

    private static Node deleteMiddleNode(Node head){

        if(head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next.next!=null && fast.next.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
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

        Node ll = new Node();
        System.out.print("Origional LinkedList : ");
        ll.show(a);

        System.out.println();

        deleteMiddleNode(a);
        System.out.print("After Deletion : ");
        ll.show(a);
    }

}
