/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Identity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author hirwa
 */
public class identityDao {
    public void SaveIdentity(Identity id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(id);
        tx.commit();
        session.close();
    }
    //If you want to delete
    public void DeleteIdentity(Identity id){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(id);
        tx.commit();
        session.close();
    }
}
