package queues;

import lists.BookModel;
import lists.LinkedListsMethods;

public class QueuesMethodsImpl implements QueuesMethods{
    
    private int size = 0;
    private class ProcessNode{
        public BookModel book;
        public ProcessNode next;
        public ProcessNode (BookModel book){
            this.book = book;
        }
    }
    
    private ProcessNode head, last;
    
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    @Override
    public void glue(BookModel book) {
        ProcessNode newNode = new ProcessNode(book);
        if (head == null){
            head = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }
    
    @Override
    public void deleteHead() {
        if (head != null){
            ProcessNode delete = head;
            head = head.next;
            delete.next = null;
            if (head == null){
                last = null;
            }
        }
        size--;
    }
    
    @Override
    public void delete(int bookPosition) {
    
    }
    //TODO adaptar este método para que nos sirva en delete y en dispatcher
    public BookModel obtain(int n){
        if(head == null){
            return null;
        } else {
            ProcessNode pointer = head;
            int counter = 0;
            while (counter < n && pointer.next != null){
                pointer = pointer.next;
                counter++;
            }
            if (counter != n){
                return null;
            } else {
                return pointer.book;
            }
        }
    }
    
    @Override
    public BookModel obtain() {
        if (head == null){
            return null;
        } else {
            return head.book;
        }
    }
    
    @Override
    public BookModel dispatch() {
        return null;
    }
}
