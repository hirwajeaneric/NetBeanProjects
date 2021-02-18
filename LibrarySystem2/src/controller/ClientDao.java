package controller;

import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.ConnectionToDb;
import model.Client;

/**
 * @author hirwa
 */
public class ClientDao extends ConnectionToDb {
    public void SaveClientData(Client cl){
        try {
            getConnection();
            ps=con.prepareStatement("INSERT INTO client VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, cl.getRegNo());
            ps.setString(2, cl.getFirstName());
            ps.setString(3, cl.getLastName());
            ps.setString(4, cl.getPhoneNUmber());
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
