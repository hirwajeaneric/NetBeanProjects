package controller;

import util.ConnectionToDB; //Here we import the package util with its class.
import model.identity; //Here we import the package model with its class.
import java.sql.SQLException; //Here we import the sql exception
import java.util.logging.Level; 
import java.util.logging.Logger;

public class IdentityDao extends ConnectionToDB {
    public void enteringidentity(identity ide){//This is a method that executes the above activity
        try{
            getConnection(); //The first thing is to get connected
            ps=con.prepareStatement("insert into identity values(?,?)");//Inputing data in the database
            ps.setInt(1, ide.getId());
            ps.setString(2, ide.getName());
            ps.executeUpdate();
            
        }catch(SQLException ex){
            Logger.getLogger(IdentityDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();//And lastly we disconnect
        }
    }
}
