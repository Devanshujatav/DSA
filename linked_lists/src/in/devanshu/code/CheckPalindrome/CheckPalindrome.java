package in.devanshu.code.CheckPalindrome;

public class CheckPalindrome {

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

    public static Node copyList(Node head){
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp = temp.next;
        }

        return newNode;
    }

    // Method 1
    public static boolean isPalindrome(Node head){

    }
}
