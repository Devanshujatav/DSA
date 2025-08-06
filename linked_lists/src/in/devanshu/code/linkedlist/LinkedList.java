package in.devanshu.code.linkedlist;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
        }else {
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
    }

    void insert(int index , int val){
        Node t = new Node(val);
        Node temp = head;

        if (index == 0){
            insertAtHead(val);
            return;
        } else if (index == length()) {
            insertAtTail(val);
            return;
        } else if (index < 0 || index > length()) {
            System.out.println("INVALID INDEXING....PLEASE ENTER A VALID INDEX");
        }else {
            for (int i=1 ; i<=index-1 ; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    int getAt(int index){
        Node temp = head;

        if (index==0 || index<0){
            System.out.println("INVALID INDEX....PLEASE ENTER A VALID INDEX");
            return -1;
        }

        for (int i=1 ; i<=index ; i++){
            temp = temp.next;
        }

        return temp.data;
    }

    void deleteAt(int index){
        if (index == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i=1 ; i<=index-1 ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int length(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void displayThroughRecursion(Node head){

        Node temp = head;

        // Base Case
        if (temp == null){
            return;
        }

        // Seif Work
        System.out.print(temp.data + " ");

        // Recursive Work
        displayThroughRecursion(temp.next);
    }

    void reverseDisplayInRecursion(Node head){

        Node temp = head;

        // Base Case
        if (temp == null){
            return;
        }

        // Recursive Work
        reverseDisplayInRecursion(temp.next);

        // Self Work
        System.out.println(temp.data + " ");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Inserting at beginning of the linked list
        ll.insertAtHead(10);



        // Inserting at end of the linked list
        ll.insertAtTail(1);
        ll.insertAtTail(2);
        ll.insertAtTail(3);





//        System.out.print("The elements of the linked list : ");
//        ll.display();
//        System.out.println();
//        ll.insertAtTail(5);
//        System.out.println("Length of the linked list after adding an element : " + ll.length());
//        ll.insert(2 , 20);

        ll.deleteAt(0);
        System.out.println("Number of elements of the linked list : " + ll.length());
        System.out.print("The elements of the linked list : ");
        ll.display();
//        int a = ll.getAt(-1);
//        System.out.println(a);








    }
}
