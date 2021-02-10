package controller;

import java.sql.SQLException;
import util.ConnectionToDB;
import java.util.logging.Logger;
import java.util.logging.Level;
import model.CheckIn;

public class CheckInDao extends ConnectionToDB {
    public void SavingCheckIn(CheckIn  ci){
        try {
            getConnection();
            ps=con.prepareStatement("INSERT INTO checkin VALUES (?,?,?,?)");
            ps.setString(1, ci.getClientName());
            ps.setString(2, ci.getTitle());
            ps.setString(3, ci.getDateIn());
            ps.setString(4, ci.getStatus());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BookCategoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }
}
