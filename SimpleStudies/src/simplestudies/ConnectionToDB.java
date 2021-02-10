package simplestudies;

import java.sql.*;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.Debug.id;

public class ConnectionToDB {
    
    public Connection con = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    public Statement s = null;
    
    public void getConnection(){
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simple?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            System.out.println("Connected...");
            s = con.createStatement();
            //Simple Batch processing.
            /*
            s.addBatch("INSERT INTO simple VALUES (1,'Hirwa')");
            s.addBatch("INSERT INTO simple VALUES (10,'Eric')");
            s.executeBatch();
            */
            //Complicated One
            /*
            String[] id = new String[]{"1","2","3","4","5"};
            String[] name = new String[]{"Zuck","Mike","Larry","Musk","Steve"};
            String[] designation = new String[]{"CFO","CSO","CTO","CEO","CMO"};
 
            String insertEmployeeSQL = "INSERT INTO employees (id, name, designation) VALUES (?,?,?)";
            ps = con.prepareStatement(insertEmployeeSQL);
            for(int i = 0; i < name.length; i++){
                String employeeId = UUID.randomUUID().toString();
                ps.setString(1,id[i]);
                ps.setString(2,name[i]);
                ps.setString(3,designation[i]);
                ps.addBatch();
            }*/
            
            //Simplification and understaning the code.
            
            
            ps = con.prepareStatement("INSERT INTO employees (id, name, designation) VALUES (?,?,?);");
                    
                   
            
            /*
            ps = con.prepared
            */
            ps.executeBatch();
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
    System.out.println("Disconnected...");
    }
}
