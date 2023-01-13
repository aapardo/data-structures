package queues;

import lombok.Data;

@Data
public class BookModel {
    private String title;
    private String author;
    private boolean printed;
    
    public BookModel(String title, String author) {
        this.title = title;
        this.author = author;
        this.printed = false;
    }
    
}
