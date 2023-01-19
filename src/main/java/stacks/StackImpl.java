package stacks;

public class StackImpl implements Stack{
    
    private class Node{
        public String element;
        public Node next = null;
        public Node(String element){
            this.element = element;
        }
    }
    
    private int size;
    private Node head = null;
    private String listOfValues = "";
    
    @Override
    public void push(String element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
        size++;
    }
    
    @Override
    public void unstack() {
        if(head != null){
            Node nodeToDelete = head;
            head = head.next;
            nodeToDelete.next = null;
            size--;
        }
    }
    
    @Override
    public String obtain() {
        if (head == null){
            return null;
        } else{
            return String.valueOf(head.next);
        }
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public void toEmptyTheStack() {
        while (!isEmpty()){
            unstack();
        }
    }
    
    public String showValuesInStack(){
        Node valuesInStack = head;
        while(valuesInStack != null){
            listOfValues += valuesInStack.element + "\n";
            valuesInStack = valuesInStack.next;
        }
        return listOfValues;
    }
}
