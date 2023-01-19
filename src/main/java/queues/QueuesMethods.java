package queues;

import lists.BookModel;

public interface QueuesMethods {
    
    boolean isEmpty();
    void glue(BookModel book);
    void deleteHead();
    BookModel top();
    BookModel dispatch();
    BookModel obtain(int bookPosition);
    void deleteInSpecificPosition(int bookPositionToDelete);
}
