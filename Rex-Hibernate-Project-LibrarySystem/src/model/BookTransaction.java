package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author hirwa
 */
@Entity
public class BookTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Book book;
    @Temporal(TemporalType.DATE)
    private Date transactionDate;
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    @Enumerated(EnumType.STRING)
    private TransactionType type;

    public BookTransaction() {
    }

    public BookTransaction(int id, Client client, Book book, Date transactionDate, Date returnDate, TransactionType type) {
        this.id = id;
        this.client = client;
        this.book = book;
        this.transactionDate = transactionDate;
        this.returnDate = returnDate;
        this.type = type;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    
}
