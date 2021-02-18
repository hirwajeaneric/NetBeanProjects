package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.BookTransaction;
import util.ConnectionToDb;

/**
 * @author hirwa
 */
public class BookTransactionDao extends ConnectionToDb {
    public void SaveBookTransaction(BookTransaction bt){
        try {
            getConnection();
            ps = con.prepareStatement("INSERT INTO bookTransaction VALUES (?,?,?,?)");
            ps.setString(1, bt.getTransactionType());
            ps.setString(2, bt.getClientNames());
            ps.setString(3, bt.getBookTitle());
            ps.setString(4, bt.getTransactionDate());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookTransactionDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            getDisconnection();
        }
    }
}
