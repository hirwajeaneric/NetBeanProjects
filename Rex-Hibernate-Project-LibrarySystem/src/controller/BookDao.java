package controller;

import java.util.List;
import model.Book;
import model.BookCategory;
import org.hibernate.Session;

/**
 * @author hirwa
 */
public class BookDao {
    private Session session;
    public void save(Book bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(bc);
       session.getTransaction().commit();
       session.close();
    }
    public void update(Book bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.update(bc);
       session.getTransaction().commit();
       session.close();
    }
    public void delete(Book bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.delete(bc);
       session.getTransaction().commit();
       session.close();
    }
    public List<Book> findAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Book> books = session.createQuery("from Book").list();
        session.close();
        return books;
    }
    public Book findById(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Book bc = (Book) session.get(Book.class, id);
        session.close();
        return bc;
    }
}
