package controller;

import util.ConnectionToDB;
import model.department;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DepartmentDao extends ConnectionToDB {
    public void insertingDepartment(department d) {
        try {
            getConnection();
            ps=con.prepareStatement("insert into department values(?,?);");
            ps.setString(1, d.getDepartmentId());
            ps.setString(2, d.getDepartmentName());
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }    
}
