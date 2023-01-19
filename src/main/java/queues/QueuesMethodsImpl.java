package queues;

import lists.BookModel;

import java.util.NoSuchElementException;

public class QueuesMethodsImpl implements QueuesMethods {
    
    private class ProcessNode {
        public BookModel book;
        public ProcessNode next;
    
        public ProcessNode(BookModel book) {
            this.book = book;
        }
    }
    
    private ProcessNode head, last;
    
    public QueuesMethodsImpl() {
        head = null;
        last = null;
    }
    
    private int size = 0;
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public void glue(BookModel book) {
        ProcessNode newNode = new ProcessNode(book);
        if (head == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }
    
    @Override
    public void deleteHead() {
        if (head != null) {
            ProcessNode delete = head;
            head = head.next;
            delete.next = null;
            if (head == null) {
                last = null;
            }
        }
        size--;
    }
    
    
    @Override
    public BookModel top() {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            return head.book;
        }
    }
    
    @Override
    public BookModel dispatch() {
        if (head != null) {
            BookModel temporalBook = head.book;
            if (head == last) {
                head = null;
                last = null;
            } else {
                head = head.next;
            }
            size--;
            return temporalBook;
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public BookModel obtain(int bookPosition) {
        if (head != null) {
            ProcessNode temporalNode = head;
            int counter = 0;
            while (temporalNode.next != null) {
                if (counter == bookPosition) {
                    return temporalNode.book;
                } else{
                    temporalNode = temporalNode.next;
                }
                counter++;
            }
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public void deleteInSpecificPosition (int bookPositionToDelete){
        if (head != null) {
            ProcessNode temporalNode = head;
            int counter = 0;
            while (temporalNode.next != null) {
                if (counter == (bookPositionToDelete - 1)) {
                    temporalNode.next = null;
                    size--;
                } else{
                    temporalNode = temporalNode.next;
                }
                counter++;
            }
        }
        throw new NoSuchElementException();
    }
    
}

