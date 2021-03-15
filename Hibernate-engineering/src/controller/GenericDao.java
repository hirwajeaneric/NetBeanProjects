/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Book;
import model.BookCategory;
import model.BookTransaction;
import model.Client;
import model.TransactionType;
import org.hibernate.SessionFactory;
import org.hibernate.*;


/**
 *
 * @author hirwa
 */
public class GenericDao<O> {
    
    O obj;
    
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session ss = null;
    Transaction tx = null;
    
    public void create(O object){
        try{
            ss = sf.openSession();
            tx = ss.beginTransaction();
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
            ss = sf.openSession();
            tx = ss.beginTransaction();
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
            ss = sf.openSession();
            tx = ss.beginTransaction();
            ss.delete(object);
            tx.commit();
        }catch(HibernateException ex){
            throw new RuntimeException(ex.getMessage());
        }finally{
            ss.close();
        }
    }
    
    public O searchOhject(Class object, String id){
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
    
    public O searchOhject(Class object, int id){
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
            String hql = "from BookTransaction where regid='"+regId+"' and status = '"+TransactionType.BORROW+"'";
            Query query = ss.createQuery(hql);
            return (BookTransaction)query.uniqueResult();
        }catch(HibernateException ex){
            throw new RuntimeException(ex.getMessage());
        }finally{
            ss.close();
        }
    }
    
    public BookCategory findBookCategory(String categoryname){
        try{
            ss=sf.openSession();
            String hql = "from BookCategory where name='"+categoryname+"'";
            Query query = ss.createQuery(hql);
            return (BookCategory)query.uniqueResult();
        }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
      }finally{
        ss.close();
      }
    }
    
    public Book findBookByName(String bookName){
        try{
            ss=sf.openSession();
            String hql = "from Book where title='"+bookName+"'";
            Query query = ss.createQuery(hql);
            return (Book) query.uniqueResult();
    }catch(HibernateException ex){
        throw new RuntimeException(ex.getMessage());
    }finally{
        ss.close();
        }
    }    
    //To find clients by name
    public Client findClientByName(String names){
        String[] nms = names.split("\\s+");
        ss=sf.openSession();
        String hql = "from Client where firstname='"+nms[1]+"' and lastname'"+nms[0]+"'";
        Query query = ss.createQuery(hql);
        return (Client) query.uniqueResult(); 
    }
    //To find all those who borrowed books
    public List<BookTransaction> findAllBorrow(){
        ss=sf.openSession();
        String hql = "from BookTransaction where status='"+TransactionType.BORROW+"'";
        Query query = ss.createQuery(hql);
        return (List<BookTransaction>) query.list();
    }
    
    public List<BookTransaction> findAllReturn(){
        ss = sf.openSession();
        String hql = "from BookTransaction where status='"+TransactionType.RETURN+"'";
        Query query=ss.createQuery(hql);
        return (List<BookTransaction>) query.list();
    }   
}
    