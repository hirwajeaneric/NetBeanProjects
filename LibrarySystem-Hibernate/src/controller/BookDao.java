package controller;

import model.Book;
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author hirwa
 */
public class BookDao {
    public void SaveBookData(Book bk){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(bk);
        tx.commit();
        session.close();
    }
    public void DeleteBook(Book bk){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(bk);
        //session.update(bk);
        //session.createSQLQuery("SELECT * FROM Book");
        tx.commit();
        session.close();
    }
}
