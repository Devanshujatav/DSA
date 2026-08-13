import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ThreadSafeLinkedList<T> implements Iterable<T> {

    // Custom Exceptions
    
    /** Thrown when an operation requires a non-empty list but the list is empty. */
    public static class EmptyListException extends RuntimeException{
        public EmptyListException(String message){
            super(message);
        }
    }

    /** Thrown when an index passed to the list is out of valid bounds. */
    public static class InvalidIndexException extends RuntimeException {
        public InvalidIndexException(String message){
            super(message);
        }        
    }

    /** Thrown when a value-based operation (remove/search) cannot find the target value. */
    public static class NodeNotFoundException extends RuntimeException{
        public NodeNotFoundException(String message){
            super(message);
        }
    }

    // Node Definition
    public static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data){
            this.data = data;
        }
    }

    // Fields
    private Node<T> head;
    private Node<T> tail;
    private int size;

    // Read-write lock: multiple concurrent readers OR one exclusive writer.
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    // ------------------------------------------------------------------
    // Insertion operations
    // ------------------------------------------------------------------

    /** Adds an element to the front of the list. O(1). */
    public void addFirst(T value){
        lock.writeLock().lock();

        try{
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            head = newNode;
            
            if (tail == null){
                tail = newNode;
            }

            size++;
        }finally{
            lock.writeLock().unlock();
        }
    }

    /** Adds an element to the end of the list. O(1) (tail pointer maintained). */
    public void addLast(T value){
        lock.writeLock().lock();
        try{
            Node<T> newNode = new Node<>(value);
            if (tail == null) {
                head = newNode;
                tail = newNode;                
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }finally{
            lock.writeLock().unlock();
        }
    }

    /** Alias for addLast — mirrors java.util.List#add(E). */
    public void add(T value){
        addLast(value);
    }


    /** Inserts an element at a specific index. O(n). */
    public void addAt(int index , T value){
        lock.writeLock().lock();

        try{
            if (index < 0 || index > size) {
                throw new InvalidIndexException("Index " + index + "out of bounds for size " + size);
            }

            if (index == 0) {
                addFirstInternal(value);
                return;
            }

            if (index == size) {
                addLastInternal(value);
                return;
            }

            Node<T> prev = head;

            for(int i=0 ; i<index-1 ; i++){
                prev = prev.next;
            }

            Node<T> newNode = new Node<>(value);

            newNode.next = prev.next;

            prev.next = newNode;

            size++;
        }finally{
            lock.writeLock().unlock();
        }
    }


    private void addFirstInternal(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        } 

        size++;
    }

    private void addLastInternal(T value){
        Node<T> newNode = new Node<T>(value);
        if (tail == null) {
            head = newNode;
            tail = newNode; 
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T removeFirst(){
        lock.writeLock().lock();
        try{
            if (head == null) {
                throw new EmptyListException("Cannot removeFirst() : List is Empty.");
            }

            T data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }

            size--;

            return data;
        }finally{
            lock.writeLock().unlock();
        }
    }

    public T removeLast(){
        lock.writeLock().lock();

        try{
            if (head == null) {
                throw new EmptyListException("Cannot removeList() : list is empty.");
            }

            T data;

            if (head == tail) {
                data = head.data;
                head = null;
                tail = null;
            }else{
                Node<T> current = head;
                while (current.next != tail) {
                    current = current.next;
                }

                data = tail.data;
                current.next = null;
                tail = current;
            }

            size--;
            return data;
        }finally{
            lock.writeLock().unlock();
        }
    }

    public T removeAt(int index){
        lock.writeLock().lock();
        try{
            if (index < 0 || index >= size) {
                throw new InvalidIndexException("Index " + index + " out of bounds for size " + size); 
            }

            if (index == 0) {
                return removeFirst();
            }

            Node<T> prev = head;

            for(int i=0 ; i<index ; i++){
                prev = prev.next;
            }

            Node<T> target = prev.next;

            prev.next = target.next;

            if (target == tail) {
                tail = prev;
            }

            size--;

            return target.data;
        }finally{
            lock.writeLock().unlock();
        }
    }
}

