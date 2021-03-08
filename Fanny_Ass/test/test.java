
import dao.BookTransactionInterface;
import dao.BookTransactionInterfaceImplementation;
import java.time.LocalDate;
import org.testng.annotations.Test;


public class test {
  BookTransactionInterface bti=new BookTransactionInterfaceImplementation();
  
  @Test
  public void returnbooktest(){
    bti.returnBook("HITLER", "MIHIGO YVES", LocalDate.now(), LocalDate.now());  }
}
