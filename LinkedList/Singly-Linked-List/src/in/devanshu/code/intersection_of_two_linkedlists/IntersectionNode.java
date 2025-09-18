package in.devanshu.code.intersection_of_two_linkedlists;

class Node{
    int data;
    Node next;

    public Node(){
        // Default constructor
    }

    public Node(int data){
        this.data = data;
    }
}

public class IntersectionNode {

    public static Node getIntersectionNode(Node headA , Node headB){

        Node tempA = headA;
        Node tempB = headB;

        int lengthA=0;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        tempA = headA;

        int lengthB=0;
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;
        }
        tempB = headB;

        if(lengthA>lengthB){
            int steps = lengthA-lengthB;
            for(int i=1 ; i<=steps ; i++){
                tempA = tempA.next;
            }
        }else{
            int steps = lengthB-lengthA;
            for(int i=1 ; i<=steps ; i++){
                tempB = tempB.next;
            }
        }

        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return tempA;
    }

    public static void main(String[] args) {

        // Linked List 1
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);


        // LinkedList 2
        Node g = new Node(50);
        Node h = new Node(44);
        Node i = new Node(11);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        g.next = h;
        h.next = i;
        i.next = d;

        Node ans = getIntersectionNode(a , g);
        System.out.println("Intersection Node : "+ans.data);
    }
}
