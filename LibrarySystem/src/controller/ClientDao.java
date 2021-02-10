package controller;

import java.sql.SQLException;
import util.ConnectionToDB;
import model.Client;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ClientDao extends ConnectionToDB {
    public void SaveClientData (Client cl){
        try {
            getConnection();
            ps=con.prepareStatement("insert into client values (?,?,?,?,?,?,?);");
            ps.setString(1, cl.getRegNo());
            ps.setString(2, cl.getFirstName());
            ps.setString(3, cl.getLastName());
            ps.setString(4, cl.getPhoneNumber());
            ps.setString(5, cl.getEmailAddress());
            ps.setString(6, cl.getPhoto());
            ps.setString(7, cl.getClientCategory());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }
}
