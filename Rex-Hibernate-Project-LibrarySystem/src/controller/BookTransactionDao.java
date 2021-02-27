package controller;

import java.util.List;
import model.BookTransaction;
import model.Client;
import org.hibernate.Session;


/**
 * @author hirwa
 */
public class BookTransactionDao {
    private Session session;
    public void save(BookTransaction bt){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(bt);
       session.getTransaction().commit();
       session.close();
    }
    public void update(BookTransaction bt){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.update(bt);
       session.getTransaction().commit();
       session.close();
    }
    public void delete(BookTransaction bt){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.delete(bt);
       session.getTransaction().commit();
       session.close();
    }
    public List<BookTransaction> findAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<BookTransaction> transactions = session.createQuery("from BookTransaction").list();
        session.close();
        return transactions;
    }
    public BookTransaction findById(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        BookTransaction bt = (BookTransaction) session.get(BookTransaction.class, id);
        session.close();
        return bt;
    }
}
