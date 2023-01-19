package stacks;

public interface Stack {
    
    void push(String element);
    void unstack();
    String obtain();
    int size();
    boolean isEmpty();
    void toEmptyTheStack();
    String showValuesInStack();
}
