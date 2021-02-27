package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author hirwa
 */
@Entity
public class BookCategory {
    @Id
    private String bookCategoryId;
    private String bookCategoryName;
    @OneToMany(mappedBy = "bookCategory")
    private List<Book> books = new ArrayList<>();

    public BookCategory() {
    }

    public BookCategory(String bookCategoryId, String bookCategoryName) {
        this.bookCategoryId = bookCategoryId;
        this.bookCategoryName = bookCategoryName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    
    public String getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(String bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookCategoryName() {
        return bookCategoryName;
    }

    public void setBookCategoryName(String bookCategoryName) {
        this.bookCategoryName = bookCategoryName;
    }
}
