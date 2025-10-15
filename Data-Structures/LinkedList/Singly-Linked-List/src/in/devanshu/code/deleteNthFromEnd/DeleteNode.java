package in.devanshu.code.deleteNthFromEnd;

class Node{
    int data;
    Node next;

    public Node(){
        // default constructor
    }

    public Node(int data){
        this.data = data;
    }

    public static void show(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}



public class DeleteNode {

    public static Node delete(Node head , int n){
        Node slow = head;
        Node fast = head;

        for (int i=1 ; i<=n ; i++){
            fast = fast.next;
        }

        if(fast == null){
            head = head.next;
            return head;
        }

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
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

        Node node = new Node();
        System.out.print("Before Deletion : ");
        node.show(a);
        a = delete(a , 2);
        System.out.println();

        System.out.print("After Deletion : ");
        node.show(a);

//        System.out.println("Value of the Node : "+q.data);
    }
}
