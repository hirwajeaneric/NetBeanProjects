package model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hirwa
 */
@Entity
public class BookCategory {
    @Id
    private String bookCategoryId;
    private String bookCategoryName;

    public BookCategory() {
    }

    public BookCategory(String bookCategoryId, String bookCategoryName) {
        this.bookCategoryId = bookCategoryId;
        this.bookCategoryName = bookCategoryName;
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
