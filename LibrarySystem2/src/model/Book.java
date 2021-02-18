package model;

/**
 *
 * @author hirwa
 */
public class Book {
    private String bookId;
    private String title;
    private String publishingHouse;
    private String dateOfPublication;
    private String author;
    private String pages;
    private String bookCategory;

    public Book() {
    }

    public Book(String bookId, String title, String publishingHouse, String dateOfPublication, String author, String pages, String bookCategory) {
        this.bookId = bookId;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
        this.pages = pages;
        this.bookCategory = bookCategory;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    
    
}
