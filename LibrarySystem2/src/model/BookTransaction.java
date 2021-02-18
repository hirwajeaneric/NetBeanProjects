package model;

/**
 * @author hirwa
 */
public class BookTransaction {
    private String transactionType;
    private String clientNames;
    private String bookTitle;
    private String transactionDate;

    public BookTransaction() {
    }

    public BookTransaction(String transactionType, String clientNames, String bookTitle, String transactionDate) {
        this.transactionType = transactionType;
        this.clientNames = clientNames;
        this.bookTitle = bookTitle;
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getClientNames() {
        return clientNames;
    }

    public void setClientNames(String clientNames) {
        this.clientNames = clientNames;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    
    
}
