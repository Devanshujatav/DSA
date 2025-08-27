package in.devanshu.code.Seperate_odd_even;

import in.devanshu.code.linkedlist.LinkedList;

class ListNode{
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListMain{
    private ListNode head;

    public LinkedListMain(){
        this.head = null;
    }

    // ADD ELEMENT TO THE END OF THE LIST
    public void add(int data){
        ListNode newNode = new ListNode(data);
        if (head == null){
            head = newNode;
            return;
        }

        ListNode current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    // Display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Split the list into odd and even lists
    public LinkedListMain[] splitOddEven(){
        LinkedListMain oddList = new LinkedListMain();
        LinkedListMain evenList = new LinkedListMain();

        ListNode current = head;

        while(current != null){
            if (current.data % 2 == 0){
                evenList.add(current.data);
            }else {
                oddList.add(current.data);
            }
            current = current.next;
        }


        return new LinkedListMain[]{oddList , evenList};
    }
}



public class LinkedListOddEvenSplitter {

    public static void main(String[] args) {
        LinkedListMain origionalList = new LinkedListMain();

        int[] sampleData = {1,2,3,4,5,6,7,8};

        for (int data : sampleData){
            origionalList.add(data);
        }

        LinkedListMain[] splitList = origionalList.splitOddEven();
        LinkedListMain oddList = splitList[0];
        LinkedListMain evenList = splitList[1];

        System.out.print("Odd List : ");
        oddList.display();
        System.out.print("Even List : ");
        evenList.display();
    }
}
