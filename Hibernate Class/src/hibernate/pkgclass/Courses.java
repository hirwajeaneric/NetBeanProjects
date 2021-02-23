/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pkgclass;

import controller.CoursesDao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javassist.bytecode.stackmap.BasicBlock;
import org.hibernate.jpa.boot.internal.FileInputStreamAccess;

/**
 *
 * @author hirwa
 */
public class Courses {
    public void upload(){
        try {
            FileInputStream inputStream = null;
            inputStream = new FileInputStream("/home/hirwa/Documents/STUDIES/6._AUCA_Semester_6/JAVA PROGRAMMING");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            //Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }
    /*    
        try {
            List<Courses> cr = readFile(inputStream);
            CoursesDao crd = new CoursesDao();
            for(Courses c: cr){
                crd.SaveCourses(c);
        } catch (SQLException ex){
            Logger.getLogger(Courses.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    /*
    public List<Courses> readFile(InputStream input){
        return null;
    }*/
}
