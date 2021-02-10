package controller;

import java.sql.SQLException;
import util.ConnectionToDB;
import model.BookCategory;
import java.util.logging.Logger;
import java.util.logging.Level;

public class BookCategoryDao extends ConnectionToDB{
    public void SavingBookCategory(BookCategory bc){
        try {
            getConnection();
            ps=con.prepareStatement("INSERT INTO bookcategory VALUES (?,?)");
            ps.setString(1, bc.getCategoryId());
            ps.setString(2, bc.getCategoryName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookCategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }
       
}
