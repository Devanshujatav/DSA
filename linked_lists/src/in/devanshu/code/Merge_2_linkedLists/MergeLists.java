package in.devanshu.code.Merge_2_linkedLists;

import in.devanshu.code.traversal_in_a_linkedlist.TraversalLinkedList;

class Node{
    int data;
    Node next;

    public Node(){
        // Default Constructor
    }

    public Node(int data){
        this.data = data;
    }

    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
//            System.out.print(o.data + " ");
            count++;
            head = head.next;
        }
        return count;
    }


}


public class MergeLists {

    // Approch 1
    private static Node merge(Node list1 , Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100);
        Node temp = head;

        while (temp1!=null && temp2!=null){
            if (temp1.data<temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }else{
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null){
            temp.next = temp2;
        }else {
            temp.next = temp1;
        }

        return head.next;
    }

    // Approch 2
    private static Node mergeOptimized(Node list1 , Node list2){
        Node temp1 = list1;
        Node temp2 = list2;

        Node head = new Node(100);

        Node temp = head;

        while (temp1 != null && temp2 != null){
            if (temp1.data < temp2.data){
                temp.next = temp1;
                temp =  temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null){
            temp.next = temp2;
        }else {
            temp.next = temp1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        // Linked List 1
        Node a = new Node(10);
        Node b = new Node(15);
        Node c = new Node(24);
        Node d = new Node(25);
        Node e = new Node(42);
        Node f = new Node(50);


        // LinkedList 2
        Node g = new Node(11);
        Node h = new Node(21);
        Node i = new Node(31);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        g.next = h;
        h.next = i;

        Node ans = mergeOptimized(a , g);

        Node ll = new Node();
        ll.display(ans);
    }
}
    