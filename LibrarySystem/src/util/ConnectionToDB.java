package util;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionToDB {
    public Connection con = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    public Statement s = null;
    
    public void getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            System.out.println("Connected to database...");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDisconnection(){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(s!=null){
            try {
                s.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         System.out.println("Database Disconnected...");
    }
}
