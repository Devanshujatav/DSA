import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public package Implementation;

public class ThreadSafeLInkedList {

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

    
}