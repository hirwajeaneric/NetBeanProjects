
package dao;

import domains.Book;
import domains.BookCategory;
import domains.BookTransaction;
import domains.Client;
import domains.TransactionType;
import java.util.List;
import org.hibernate.*;




public class GenericDao<O> {

  O obj;
  
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public void create(O object){
      try{
      ss=sf.openSession();
      tx=ss.beginTransaction();
      ss.save(object);
      tx.commit();
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public void update(O object){
      try{
        ss=sf.openSession();
        tx=ss.beginTransaction();
        ss.update(object);
        tx.commit();
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public void delete(O object){
      try{
        ss=sf.openSession();
        tx=ss.beginTransaction();
        ss.delete(object);
        tx.commit();
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public O searchObject(Class object,String id){
      try{
        ss=sf.openSession();
        O ob=(O) ss.get(object, id);
        return ob;
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    public O searchObject(Class object,int id){
      try{
        ss=sf.openSession();
        O ob=(O) ss.get(object, id);
        return ob;
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public List<O> findAll(O object){
      try{
        ss = sf.openSession();
        List<O> li=(List<O>) ss.createCriteria(object.getClass()).list();
        return li;
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    public BookTransaction checkIfClientHasBook(String regId){
      try{
        ss=sf.openSession();
        String hql="from BookTransaction where regid='"+regId+"' and status ='"+TransactionType.BORROW+"'";
        Query query=ss.createQuery(hql);
        return(BookTransaction) query.uniqueResult();
        
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public BookCategory findBookCategory(String categoryname){
      try{
        ss=sf.openSession();
        String hql="from BookCategory where name='"+categoryname+"'";
        Query query=ss.createQuery(hql);
        return (BookCategory)query.uniqueResult();
      }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public Book findBookByName(String bookName){
      ss=sf.openSession();
      String hql="from Book where tittle='"+bookName+"'";
      Query query=ss.createQuery(hql);
      return (Book) query.uniqueResult();
    }
    
    public Client findClientByNames(String names){
      String[] nms=names.split("\\s+");
      ss=sf.openSession();
      String hql="from Client where firstname='"+nms[1]+"' and lastname='"+nms[0]+"'";
      Query query=ss.createQuery(hql);
      return (Client) query.uniqueResult();
    }
    
    public List<BookTransaction> findAllBorrow(){
      ss=sf.openSession();
      String hql="from BookTransaction where status='"+TransactionType.BORROW+"'";
      Query query=ss.createQuery(hql);
      return (List<BookTransaction>) query.list();
    }
    
    public List<BookTransaction> findAllReturn(){
      ss=sf.openSession();
      String hql="from BookTransaction where status='"+TransactionType.RETURN+"'";
      Query query=ss.createQuery(hql);
      return (List<BookTransaction>) query.list();
    }
}
