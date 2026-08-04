import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

package Implementation;

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
}