package controller;

import java.sql.SQLException;
import util.ConnectionToDB;
import model.CheckOut;
import java.util.logging.Logger;
import java.util.logging.Level;

public class CheckOutDao extends ConnectionToDB{
    public void SavinCheckOut(CheckOut co){
        try {
            getConnection();
            ps=con.prepareStatement("INSERT INTO checkOut VALUES (?,?,?,?)");
            ps.setString(1, co.getClientName());
            ps.setString(2, co.getTitle());
            ps.setString(3, co.getDateOut());
            ps.setString(4, co.getStatus());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookCategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }       
    }
}
