package controller;

import java.util.List;
import model.BookCategory;
import org.hibernate.Session;

/**
 * @author hirwa
 */
public class BookCategoryDao{
    private Session session;
    public void save(BookCategory bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(bc);
       session.getTransaction().commit();
       session.close();
    }
    public void update(BookCategory bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.update(bc);
       session.getTransaction().commit();
       session.close();
    }
    public void delete(BookCategory bc){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.delete(bc);
       session.getTransaction().commit();
       session.close();
    }
    public List<BookCategory> findAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<BookCategory> bookCategories = session.createQuery("from BookCategory").list();
        session.close();
        return bookCategories;
    }
    public BookCategory findById(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        BookCategory bc = (BookCategory) session.get(BookCategory.class, id);
        session.close();
        return bc;
    }
}
