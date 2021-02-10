package controller;

import util.ConnectionToDB;
import model.staff;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffDao extends ConnectionToDB {
    public void insertingStaff (staff st){
        try {//Note that here we were able to use ps (The prepared statement) this class was extended to te ConnectionToDB class.
            getConnection();
            ps=con.prepareStatement("insert into staff values(?,?,?,?,?,?,?,?)");
            ps.setString(1, st.getId());
            ps.setString(2, st.getName());
            ps.setString(3, st.getDateOfBirth());
            ps.setString(4, st.getNationalId());
            ps.setString(5, st.getPhoneNumber());
            ps.setString(6, st.getEmail());
            ps.setString(7, st.getGender());
            ps.setString(8, st.getDepartmentName());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StaffDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
        
    }
}
