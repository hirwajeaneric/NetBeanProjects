package controller;

import model.Client;
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author hirwa
 */
public class ClientDao {
    public void SaveClientData(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(cl);
        tx.commit();
        session.close();
    }
    public void DeleteClientData(Client cl){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(cl);
        tx.commit();
        session.close();
    }
}

