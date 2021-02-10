package controller;

import java.sql.SQLException;
import util.ConnectionToDB;
import model.Book;
import java.util.logging.Logger;
import java.util.logging.Level;

public class BookDao extends ConnectionToDB{
    public void SaveBookData(Book b){
        try {
            getConnection();
            ps=con.prepareStatement("INSERT INTO book VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, b.getBookId());
            ps.setString(2, b.getTitle());
            ps.setString(3, b.getPublishingHouse());
            ps.setString(4, b.getDateOfPublication());
            ps.setString(5, b.getAuthor());
            ps.setInt(6, b.getPages());
            ps.setString(7, b.getBookCategory());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }
}
