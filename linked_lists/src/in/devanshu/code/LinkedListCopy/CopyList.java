package in.devanshu.code.LinkedListCopy;

import java.util.LinkedList;
import java.util.Iterator;


// Custom Node class
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Custom LinkedList implementation
class CustomLinkedList<T> {
    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Add element to the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Get element at specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Get size
    public int size() {
        return size;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node<T> current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }

    // Get head node (for copying purposes)
    public Node<T> getHead() {
        return head;
    }

    // Set head node (for copying purposes)
    public void setHead(Node<T> head) {
        this.head = head;
        // Recalculate size
        this.size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
    }
}


public class CopyList {

//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(){
//            // Default Constructor
//        }
//
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }

    // Method 1: Copy using iteration through nodes
    public static <T> CustomLinkedList<T> copyLinkedListIterative(CustomLinkedList<T> original) {
        CustomLinkedList<T> copy = new CustomLinkedList<>();

        if (original.isEmpty()) {
            return copy;
        }

        Node<T> current = original.getHead();
        while (current != null) {
            copy.add(current.data);
            current = current.next;
        }

        return copy;
    }

    // Method 2: Copy using recursion
    public static <T> CustomLinkedList<T> copyLinkedListRecursive(CustomLinkedList<T> original) {
        CustomLinkedList<T> copy = new CustomLinkedList<>();

        if (!original.isEmpty()) {
            Node<T> copiedHead = copyNodesRecursive(original.getHead());
            copy.setHead(copiedHead);
        }

        return copy;
    }

    // Helper method for recursive copying
    private static <T> Node<T> copyNodesRecursive(Node<T> original) {
        if (original == null) {
            return null;
        }

        Node<T> newNode = new Node<>(original.data);
        newNode.next = copyNodesRecursive(original.next);
        return newNode;
    }

    // Method 3: Copy using array as intermediate storage
    public static <T> CustomLinkedList<T> copyLinkedListViaArray(CustomLinkedList<T> original) {
        CustomLinkedList<T> copy = new CustomLinkedList<>();

        if (original.isEmpty()) {
            return copy;
        }

        // Step 1: Store all elements in array
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Object[original.size()];

        Node<T> current = original.getHead();
        int index = 0;
        while (current != null) {
            tempArray[index++] = current.data;
            current = current.next;
        }

        // Step 2: Create new list from array
        for (int i = 0; i < tempArray.length; i++) {
            copy.add(tempArray[i]);
        }

        return copy;
    }

    // Method 4: Copy by creating nodes manually
    public static <T> CustomLinkedList<T> copyLinkedListManual(CustomLinkedList<T> original) {
        CustomLinkedList<T> copy = new CustomLinkedList<>();

        if (original.isEmpty()) {
            return copy;
        }

        Node<T> originalCurrent = original.getHead();

        // Create first node
        Node<T> copyHead = new Node<>(originalCurrent.data);
        copy.setHead(copyHead);

        Node<T> copyCurrent = copyHead;
        originalCurrent = originalCurrent.next;

        // Create remaining nodes
        while (originalCurrent != null) {
            Node<T> newNode = new Node<>(originalCurrent.data);
            copyCurrent.next = newNode;
            copyCurrent = newNode;
            originalCurrent = originalCurrent.next;
        }

        return copy;
    }

    // Method 5: Reverse and reverse again (creative approach)
    public static <T> CustomLinkedList<T> copyLinkedListReverseMethod(CustomLinkedList<T> original) {
        if (original.isEmpty()) {
            return new CustomLinkedList<>();
        }

        // First pass: reverse copy
        CustomLinkedList<T> reverseCopy = new CustomLinkedList<>();
        Node<T> current = original.getHead();

        // Build reverse copy
        while (current != null) {
            Node<T> newNode = new Node<>(current.data);
            newNode.next = reverseCopy.getHead();
            reverseCopy.setHead(newNode);
            current = current.next;
        }

        // Second pass: reverse the reverse to get original order
        CustomLinkedList<T> finalCopy = new CustomLinkedList<>();
        current = reverseCopy.getHead();

        while (current != null) {
            Node<T> newNode = new Node<>(current.data);
            newNode.next = finalCopy.getHead();
            finalCopy.setHead(newNode);
            current = current.next;
        }

        return finalCopy;
    }

    // Utility method to compare two linked lists
    public static <T> boolean areEqual(CustomLinkedList<T> list1, CustomLinkedList<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        Node<T> current1 = list1.getHead();
        Node<T> current2 = list2.getHead();

        while (current1 != null && current2 != null) {
            if (!current1.data.equals(current2.data)) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return current1 == null && current2 == null;
    }
    // Generic method to copy any LinkedList
    public static <T> LinkedList<T> copyLinkedList(LinkedList<T> source) {
        return new LinkedList<>(source);
    }

    public static Node copyList(Node head){

        // Edge Case
        if (head == null){
            return null;
        }

        Node newHead = new Node(head.data);
        Node copyTemp = newHead;
        Node temp = head.next;

        while (temp != null){
            copyTemp.next = new Node(temp.data);
            copyTemp = copyTemp.next;
            temp = temp.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        // Create and populate the original LinkedList
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Elderberry");

        System.out.println("Original LinkedList: " + originalList);
        System.out.println("Size: " + originalList.size());
        System.out.println();

        // Method 1: Using copy constructor (shallow copy)
        LinkedList<String> copiedList1 = new LinkedList<>(originalList);
        System.out.println("Method 1 - Copy Constructor:");
        System.out.println("Copied List: " + copiedList1);
        System.out.println("Are they equal? " + originalList.equals(copiedList1));
        System.out.println("Are they the same object? " + (originalList == copiedList1));
        System.out.println();

        // Method 2: Using clone() method
        LinkedList<String> copiedList2 = (LinkedList<String>) originalList.clone();
        System.out.println("Method 2 - Clone Method:");
        System.out.println("Copied List: " + copiedList2);
        System.out.println("Are they equal? " + originalList.equals(copiedList2));
        System.out.println("Are they the same object? " + (originalList == copiedList2));
        System.out.println();

        // Method 3: Using addAll() method
        LinkedList<String> copiedList3 = new LinkedList<>();
        copiedList3.addAll(originalList);
        System.out.println("Method 3 - addAll() Method:");
        System.out.println("Copied List: " + copiedList3);
        System.out.println("Are they equal? " + originalList.equals(copiedList3));
        System.out.println();

        // Method 4: Manual copying using enhanced for loop
        LinkedList<String> copiedList4 = new LinkedList<>();
        for (String item : originalList) {
            copiedList4.add(item);
        }
        System.out.println("Method 4 - Enhanced For Loop:");
        System.out.println("Copied List: " + copiedList4);
        System.out.println("Are they equal? " + originalList.equals(copiedList4));
        System.out.println();

        // Method 5: Using Iterator
        LinkedList<String> copiedList5 = new LinkedList<>();
        Iterator<String> iterator = originalList.iterator();
        while (iterator.hasNext()) {
            copiedList5.add(iterator.next());
        }
        System.out.println("Method 5 - Iterator:");
        System.out.println("Copied List: " + copiedList5);
        System.out.println("Are they equal? " + originalList.equals(copiedList5));
        System.out.println();

        // Demonstrating that copies are independent
        System.out.println("=== Testing Independence ===");
        System.out.println("Original before modification: " + originalList);
        System.out.println("Copy before modification: " + copiedList1);

        // Modify original list
        originalList.add("Fig");
        copiedList1.add("Grape");

        System.out.println("Original after adding 'Fig': " + originalList);
        System.out.println("Copy after adding 'Grape': " + copiedList1);
        System.out.println("Lists are independent!");
    }
}
