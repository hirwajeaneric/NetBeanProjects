/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import hibernate.pkgclass.Courses;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author hirwa
 */
public class CoursesDao {
    public void SaveCourses(Courses cr){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(cr);
        tx.commit();
        session.close();
    }
    //If you want to delete
    public void DeleteCourses(Courses cr){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cr);
        tx.commit();
        session.close();
    }
}
