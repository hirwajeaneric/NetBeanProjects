
package dao;

import domains.*;
import java.time.LocalDate;


public interface BookTransactionInterface {
  public void printExcelSheet();
  public void returnBook(String bookId,String clientId,LocalDate transactionDate,LocalDate returnDate);
  public void borrowBookz(String clientnames,String booktittle,LocalDate transactionDate,LocalDate returnDate);
}
