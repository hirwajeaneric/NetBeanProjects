
package dao;

import domains.Book;
import domains.BookTransaction;
import domains.Client;
import domains.TransactionType;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;



public class BookTransactionInterfaceImplementation implements BookTransactionInterface{
  
  GenericDao<BookTransaction> btDao=new GenericDao<>();
  GenericDao<Book> bkDao=new GenericDao<>();
  GenericDao<Client> clDao=new GenericDao<>();
  
  BookTransaction bookTransaction=new BookTransaction();

  @Override
  public void returnBook(String booktittle, String clientnames,LocalDate transactionDate,LocalDate returnDate) {
    Book bo=bkDao.findBookByName(booktittle);
    Client cli=clDao.findClientByNames(clientnames);
  
    btDao.create(new BookTransaction(bo, cli,transactionDate, returnDate, TransactionType.RETURN));
    
    bo.setAvailable(true);
    bkDao.update(bo);}

  @Override
  public void borrowBookz(String clientnames, String booktittle, LocalDate transactionDate, LocalDate returnDate) {
    Book bo=bkDao.findBookByName(booktittle);
    Client cli=clDao.findClientByNames(clientnames);
  
    if(bo == null){
      throw new RuntimeException("Book id doesn't exist");
    }
    if(cli == null){
      throw new RuntimeException("client id doesn't exist");
    }
    if(bo.isAvailable()==Boolean.FALSE){
      throw new RuntimeException("book is not available");
    }
    if(returnDate.isBefore(LocalDate.now()) || returnDate.equals(LocalDate.now())){
      throw new RuntimeException("Return date can't be today or before date");
    }
    btDao.create(new BookTransaction(bo, cli,transactionDate, returnDate, TransactionType.BORROW));
    
    bo.setAvailable(false);
    bkDao.update(bo);
  }

  @Override
  public void printExcelSheet() {
    try{
    
    HSSFWorkbook workbook=new HSSFWorkbook();
    HSSFSheet sheet=workbook.createSheet("Sample");
    
    //Heading
    
    Row heading=sheet.createRow(0);
    heading.createCell(0).setCellValue("ID");
    heading.createCell(1).setCellValue("CLIENT NAME");
    heading.createCell(2).setCellValue("BOOK TITTLE");
    heading.createCell(3).setCellValue("TRANSACTION DATE");
    heading.createCell(4).setCellValue("RETURN DATE TITTLE");
    heading.createCell(5).setCellValue("TRANSACTIONTYPE");
    
    for(int i=0;i<=5;i++){
      CellStyle style=workbook.createCellStyle();
      Font font=workbook.createFont();
      font.setBold(true);
      font.setFontName(HSSFFont.FONT_ARIAL);
      
      style.setFont(font);
      style.setVerticalAlignment(VerticalAlignment.CENTER);
      heading.getCell(i).setCellStyle(style);
      }
    
      int r=1;
      for(BookTransaction but:btDao.findAll(bookTransaction)){
        Row row=sheet.createRow(r);
        
        Cell cellid=row.createCell(0);
        cellid.setCellValue(but.getId());
        Cell cellname=row.createCell(1);
        cellname.setCellValue(but.getClient().getLastName()+" "+but.getClient().getFirstName());
        Cell cellbook=row.createCell(2);
        cellbook.setCellValue(but.getBook().getTittle());
        Cell celltd=row.createCell(3);
        celltd.setCellValue(but.getTransactionDate().toString());
        Cell cellrd=row.createCell(4);
        cellrd.setCellValue(but.getReturnDate().toString());
        Cell cellstatus=row.createCell(5);
        cellstatus.setCellValue(but.getStatus().toString());
   
        r++;
      }
      for(int i=0;i<=2;i++){
        sheet.autoSizeColumn(i);
        }
        FileOutputStream out=new FileOutputStream(new File("C:\\Users\\sudo\\Desktop\\booktransctions.xls"));
        workbook.write(out);
        out.close();
        workbook.close();
        System.out.println("Well Done");
    
    }catch(Exception ex){
      
    }
  }
  
}
