package controller;

import model.BookTransaction;
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author hirwa
 */
public class BookTransactionDao {
    public void SaveBookTransaction(BookTransaction bt){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(bt);
        tx.commit();
        session.close();
    }
    public void DeleteBookTransaction(BookTransaction bt){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(bt);
        tx.commit();
        session.close();
    }
}
