package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionToDb;
import model.BookCategory;
/**
 * @author hirwa
 */
public class BookCategoryDao extends ConnectionToDb {
   public void SaveBookCategoryData(BookCategory bkc){
       try {
           getConnection();
           ps=con.prepareStatement("INSERT INTO bookcategory VALUES (?,?)");
           ps.setString(1, bkc.getBookCategoryId());
           ps.setString(2, bkc.getBookCategoryName());
           ps.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(BookCategoryDao.class.getName()).log(Level.SEVERE, null, ex);
       } finally{
           getDisconnection();
       }
   }
}
