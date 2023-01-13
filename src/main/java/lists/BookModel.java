package lists;

import lombok.Data;

@Data
public class BookModel {
    
    private String title;
    private String author;
    private String isbn;
    
    public BookModel(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
}
