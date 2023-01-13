package queues;

import lists.BookModel;

public interface QueuesMethods {
    
    boolean isEmpty();
    void glue(BookModel book);
    void deleteHead();
    void delete(int bookPostion);
    BookModel obtain();
    BookModel dispatch();
}
