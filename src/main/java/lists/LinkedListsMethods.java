package lists;

public class LinkedListsMethods {
    
    private Node head = null;
    private int size = 0;
    private class Node{
        public BookModel book;
        public Node nextNode = null;
        
        public Node(BookModel book){
            this.book = book;
        }
    }
    
    public void insertAtBeginning(BookModel book){
        Node node = new Node(book);
        node.nextNode = head;
        head = node;
        size++;
    }
    
    public void insertAtEnd(BookModel book){
        Node node = new Node(book);
        Node pointer = head;
        while (pointer.nextNode != null){
            pointer = pointer.nextNode;
        }
        pointer.nextNode = node;
        size++;
    }
    
    public void insertInTheMiddle(int n, BookModel book){
        Node node = new Node(book);
        if (head == null){
            head = node;
        } else {
            Node pointer = head;
            int counter = 0;
            while (counter < n && pointer.nextNode != null){
                pointer = pointer.nextNode;
                counter++;
            }
            node.nextNode = pointer.nextNode;
            pointer.nextNode = node;
        }
        size++;
    }
    
    public BookModel obtain(int n){
        if(head == null){
            return null;
        } else {
            Node pointer = head;
            int counter = 0;
            while (counter < n && pointer.nextNode != null){
                pointer = pointer.nextNode;
                counter++;
            }
            if (counter != n){
                return null;
            } else {
                return pointer.book;
            }
        }
    }
    
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public void deleteFirstElement (){
        if (head != null) {
            Node first = head;
            head = head.nextNode;
            first.nextNode = null;
            size--;
        }
    }
    
    public void deleteLastElement() {
        if (head != null) {
            if (head.nextNode == null) {
                head = null;
            } else {
    
                Node pointer = head;
                while (pointer.nextNode.nextNode != null) {
                    pointer = pointer.nextNode;
                }
                pointer.nextNode = null;
            }
            size--;
        }
        
    }
    
    public void deleteInTheMiddle(int n){
        if (head != null){
            if (n == 0){
                deleteFirstElement();
            } else if (n < size) {
                Node pointer = head;
                int counter = 0;
                while (counter < (n - 1)) {
                    pointer = pointer.nextNode;
                    counter++;
                }
                Node temporary = pointer.nextNode;
                pointer.nextNode = temporary.nextNode;
                temporary.nextNode = null;
                size--;
            }
        }
    }
    
    
    
    
    
}
