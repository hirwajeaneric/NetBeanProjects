package controller;

import model.BookCategory;
import util.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 * @author hirwa
 */
public class BookCategoryDao {
    public void SaveBookCategoryData(BookCategory bkc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(bkc);
        tx.commit();
        session.close();
    }
    public void DeleteBookCategoryData(BookCategory bkc){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(bkc);
        tx.commit();
        session.close();
    }
 }

