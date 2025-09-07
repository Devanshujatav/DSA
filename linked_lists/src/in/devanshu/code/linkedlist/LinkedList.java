package in.devanshu.code.linkedlist;

/**
 * Node class to represent individual elements in the linked list
 */
class Node<T>{
    T data;
    Node<T> next;

    public Node(){
        // Default Constructor
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    /**
     * Initialize an empty linked list
     */
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    /**
     * Check if the linked list is empty
     */
    public boolean isEmpty(){
        return head == null;
    }


    /**
     * Return the number of elements in the linked list
     */
    public int size(){
        return size;
    }


    /**
     * Add an element to the end of the linked list
     */
    public void append(T data){
        Node<T> newNode = new Node<>(data);

        if (isEmpty()){
            head = newNode;
        }else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * Add an element to the beginning of the linked list
     */
    public void prepend(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }


    /**
     * Insert an element at a specific index
     */
    public void insertAt(int index , T data){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        if (index == 0) {
            prepend(data);
            return;
        }

        if (index == size) {
            append(data);
            return;
        }

        Node<T> newNode = new Node<>(data);

        Node<T> current = head;

        for (int i=0 ; i<index-1 ; i++){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }



    /**
     * Remove and return the first element
     */
    public T deleteFirst(){
        if (isEmpty()){
            throw new RuntimeException("Cannot delete from empty list");
        }

        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    /**
     * Remove and return the last element
     */
    public T deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot delete from empty list");
        }

        if (head.next == null) { // Only one element
            T data = head.data;
            head = null;
            size--;
            return data;
        }

        Node<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        T data = current.next.data;
        current.next = null;
        size--;
        return data;
    }

    /**
     * Remove and return element at specific index
     */
    public T deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        if (index == 0) {
            return deleteFirst();
        }

        Node<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        T data = current.next.data;
        current.next = current.next.next;
        size--;
        return data;
    }

    /**
     * Remove the first occurrence of a value
     */
    public boolean deleteValue(T value) {
        if (isEmpty()) {
            return false;
        }

        if (head.data.equals(value)) {
            deleteFirst();
            return true;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(value)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false; // Value not found
    }

    /**
     * Find the index of the first occurrence of a value
     */
    public int indexOf(T value){
        Node<T> current = head;
        int index = 0;

        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1; // Value not found
    }

    /**
     * Get the element at a specific index
     */
    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        Node<T> current = head;

        for (int i=0 ; i<index ; i++){
            current = current.next;
        }

        return current.data;
    }


    /**
     * Set the element at a specific index
     */
    public void set(int index , T data){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range: " + index);
        }

        Node<T> current = head;

        for (int i=0 ; i<index ; i++){
            current = current.next;
        }

        current.data = data;
    }

    /**
     * Check if a value exists in the linked list
     */
    public boolean contains(T data){
        return indexOf(data) != -1;
    }

    /**
     * Reverse the linked list in place
     */
    public void reverse(){
        Node<T> current = head;
        Node<T> prev = null;
        Node<T> nxt = null;

        while(current!=null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        head = prev;
    }

    /**
     * Remove all elements from the linked list
     */
    public void clear(){
        head = null;
        size = 0;
    }

    /**
     * Get the first element without removing it
     */
    public T getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }

        return head.data;
    }

    /**
     * Get the last element without removing it
     */
    public T getLast(){
        if (isEmpty()){
            throw new RuntimeException("List is empty");
        }

        Node<T> current = head;
        while(current!=null){
            current = current.next;
        }

        return current.data;
    }

    /**
     * Convert linked list to array
     */
    @SuppressWarnings("unchecked")
    public T[] toArray(){
        T[] array = (T[]) new Object[size];
        Node<T> current = head;
        int index = 0;
        while(current!=null){
            array[index++] = current.data;
            current = current.next;
        }
        return array;
    }

    /**
     * Display the linked list
     */
    public void display(){
        if (isEmpty()){
            System.out.println("LinkedList : []");
            return;
        }

        System.out.println("LinkedList : [");
        Node<T> current = head;

        while (current!=null){
            System.out.print(current.data);
            if (current.next!=null){
                System.out.println("-->");
            }
            current = current.next;
        }

        System.out.println("]");
    }

    /**
     * String representation of the linked list
     */
    @Override
    public String toString(){
        if (isEmpty()){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> current = head;
        while (current!=null){
            sb.append(current.data);
            if (current.next!=null){
                System.out.println(", ");
            }
            current = current.next;
        }
        sb.append("]");

        return sb.toString();
    }


    /**
     * Main method for testing the LinkedList implementation
     */
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("=== LinkedList Demo ===");
        System.out.println("Is empty: " + ll.isEmpty());
        System.out.println("Size: " + ll.size());

        // Add elements
        System.out.println("\n--- Adding elements ---");
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.prepend(0);
        ll.display();
        System.out.println("Size: " + ll.size());

        // Insert at specific positions
        System.out.println("\n--- Inserting elements ---");
        ll.insertAt(2, 15);
        ll.display();

        // Access elements
        System.out.println("\nElement at index 0: " + ll.get(0));
        System.out.println("Element at index 2: " + ll.get(2));
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());

        // Search for elements
        System.out.println("\nIndex of value 2: " + ll.indexOf(2));
        System.out.println("Contains value 5: " + ll.contains(5));
        System.out.println("Contains value 15: " + ll.contains(15));

        // Modify elements
        System.out.println("\n--- Modifying elements ---");
        ll.set(1, 5);
        ll.display();

        // Delete elements
        System.out.println("\n--- Deleting elements ---");
        System.out.println("Deleted first: " + ll.deleteFirst());
        System.out.println("Deleted last: " + ll.deleteLast());
        ll.display();

        System.out.println("Deleted value 15: " + ll.deleteValue(15));
        ll.display();

        System.out.println("Deleted at index 1: " + ll.deleteAt(1));
        ll.display();

        // Add more elements for reverse test
        ll.append(10);
        ll.append(20);
        ll.append(30);
        System.out.println("\nBefore reverse:");
        ll.display();

        // Reverse the list
        System.out.println("\n--- Reversing list ---");
        ll.reverse();
        ll.display();

        // Convert to array
        System.out.println("\nAs array: " + java.util.Arrays.toString(ll.toArray()));
        System.out.println("String representation: " + ll.toString());

        // Test with different data type
        System.out.println("\n--- Testing with String type ---");
        LinkedList<String> stringList = new LinkedList<>();
        stringList.append("Hello");
        stringList.append("World");
        stringList.prepend("Hi");
        stringList.display();

        // Clear the list
        System.out.println("\n--- Clearing list ---");
        ll.clear();
        ll.display();
        System.out.println("Is empty: " + ll.isEmpty());
        System.out.println("Size: " + ll.size());
    }
}














































//
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data = data;
//        }
//    }
//
//    Node head = null;
//    Node tail = null;
//
//    void insertAtTail(int val){
//        Node temp = new Node(val);
//        if (head == null){
//            head = temp;
//        }else {
//            tail.next = temp;
//        }
//        tail = temp;
//    }
//
//    void insertAtHead(int val){
//        Node temp = new Node(val);
//        if (head == null){
//            head = tail = temp;
//        }else{
//            temp.next = head;
//            head = temp;
//        }
//    }
//
//    void insert(int index , int val){
//        Node t = new Node(val);
//        Node temp = head;
//
//        if (index == 0){
//            insertAtHead(val);
//            return;
//        } else if (index == length()) {
//            insertAtTail(val);
//            return;
//        } else if (index < 0 || index > length()) {
//            System.out.println("INVALID INDEXING....PLEASE ENTER A VALID INDEX");
//        }else {
//            for (int i=1 ; i<=index-1 ; i++){
//                temp = temp.next;
//            }
//            t.next = temp.next;
//            temp.next = t;
//        }
//    }
//
//    int getAt(int index){
//        Node temp = head;
//
//        if (index==0 || index<0){
//            System.out.println("INVALID INDEX....PLEASE ENTER A VALID INDEX");
//            return -1;
//        }
//
//        for (int i=1 ; i<=index ; i++){
//            temp = temp.next;
//        }
//
//        return temp.data;
//    }
//
//    void deleteAt(int index){
//        if (index == 0){
//            head = head.next;
//            return;
//        }
//
//        Node temp = head;
//        for (int i=1 ; i<=index-1 ; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        tail = temp;
//    }
//
//    void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    int length(){
//        Node temp = head;
//        int count = 0;
//        while(temp!=null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//
//    void displayThroughRecursion(Node head){
//
//        Node temp = head;
//
//        // Base Case
//        if (temp == null){
//            return;
//        }
//
//        // Seif Work
//        System.out.print(temp.data + " ");
//
//        // Recursive Work
//        displayThroughRecursion(temp.next);
//    }
//
//    void reverseDisplayInRecursion(Node head){
//
//        Node temp = head;
//
//        // Base Case
//        if (temp == null){
//            return;
//        }
//
//        // Recursive Work
//        reverseDisplayInRecursion(temp.next);
//
//        // Self Work
//        System.out.println(temp.data + " ");
//    }
//
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//
//        // Inserting at beginning of the linked list
//        ll.insertAtHead(10);
//
//
//
//        // Inserting at end of the linked list
//        ll.insertAtTail(1);
//        ll.insertAtTail(2);
//        ll.insertAtTail(3);
//
//
//
//
//
////        System.out.print("The elements of the linked list : ");
////        ll.display();
////        System.out.println();
////        ll.insertAtTail(5);
////        System.out.println("Length of the linked list after adding an element : " + ll.length());
////        ll.insert(2 , 20);
//
//        ll.deleteAt(0);
//        System.out.println("Number of elements of the linked list : " + ll.length());
//        System.out.print("The elements of the linked list : ");
//        ll.display();
////        int a = ll.getAt(-1);
////        System.out.println(a);
//
//
//
//
//
//
//
//
//    }
//}
