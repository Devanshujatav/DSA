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
            temp1 = temp1.next;
        }

        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // Alternate Connections
        Node temp = new Node(-1);
        while(temp!=null){
            temp.next = temp1;
            if(temp1 == null){
                break;
            }
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        temp2 = head2;
        temp1 = head;

        // Alloting Random
        while (temp1 != null){
            if (temp1.random == null){
                temp2.random = null;
            }else {
                temp2.random = temp1.random.next;
            }

            temp1 = temp2.next;
            if (temp1!=null){
                temp2 = temp1.next;
            }
        }

        temp2 = head2;
        temp1 = head;

        // Seperating the list
        while(temp1!=temp){
            if(temp2 == null){
                break;
            }
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp1 == null){
                break;
            }
            temp2.next = temp1.next;

            if (temp2.next == null){
                break;
            }
            temp2 = temp2.next;
        }

        return head2;
    }
}
