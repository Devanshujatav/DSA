package in.devanshu.code.cyclic_linkedlist_II;

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
        int count=0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class CyclicLinkedListII {


    private static Node cyclicNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                break;
            }
        }

        Node temp = head;

        while (temp != slow){
            slow = slow.next;
            temp = temp.next;
        }

        return slow;


    }

    private static int cyclicNodeIndex(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                break;
            }
        }

        Node temp = head;

        int count=0;

        while (temp != slow) {
            count++;
            slow = slow.next;
            temp = temp.next;
        }

        return count;
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
        f.next = c;

        Node ans = cyclicNode(a);

        int nodeIndex = cyclicNodeIndex(a);

        System.out.println("The node of node at which it starts cycle rotation is " + ans.data + " at index " + nodeIndex);
    }
}
