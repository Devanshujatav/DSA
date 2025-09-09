package in.devanshu.code.CopyList_Random;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListRandom {
    public Node copyRandomList(Node head){

        // Deep Copy List 
        Node head2 = new Node(0);
        // Origional List iterator : temp1
        Node temp1 = head;

        // Copied List Iterator : temp2
        Node temp2 = head2;

        while (temp1!=null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
        }

        head2 = head2.next;
        temp2 = head2;
        temp1 = head;
    }
}
