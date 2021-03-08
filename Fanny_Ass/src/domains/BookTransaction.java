
package domains;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;


@Entity
public class BookTransaction implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "regId")
    private Client client;
    private LocalDate transactionDate;
    private LocalDate returnDate;
    @Enumerated(EnumType.STRING)
    private TransactionType status;

  public BookTransaction(int id, Book book, Client client, LocalDate transactionDate, LocalDate returnDate, TransactionType status) {
    this.id = id;
    this.book = book;
    this.client = client;
    this.transactionDate = transactionDate;
    this.returnDate = returnDate;
    this.status = status;
  }

  public BookTransaction(Book book, Client client, LocalDate transactionDate,LocalDate returnDate, TransactionType status) {
    this.book = book;
    this.client = client;
    this.transactionDate = transactionDate;
    this.returnDate = returnDate;
    this.status = status;
  }
  
  

  public BookTransaction() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Book getBook() {
    return book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDate getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }

  public LocalDate getReturnDate() {
    return returnDate;
  }

  public void setReturnDate(LocalDate returnDate) {
    this.returnDate = returnDate;
  }

  public TransactionType getStatus() {
    return status;
  }

  public void setStatus(TransactionType status) {
    this.status = status;
  }

    
}
