/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hirwa
 */
@Entity
public class Book implements Serializable {
    @Id
    private String bookid;
    @Column(unique = true)
    private String tittle;
    private String author;
    private String publishingHouse;
    private LocalDate publicationDate;
    private int pages;
    @ManyToOne
    private BookCategory category;
    private boolean available;

    public Book() {
    }

    public Book(String bookid, String tittle, String author, String publishingHouse, LocalDate publicationDate, int pages, BookCategory category, boolean available) {
        this.bookid = bookid;
        this.tittle = tittle;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.category = category;
        this.available = available;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    
}
