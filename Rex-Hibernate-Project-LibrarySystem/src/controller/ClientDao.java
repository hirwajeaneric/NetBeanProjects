package controller;

import java.util.List;
import model.Client;
import org.hibernate.Session;

/**
 * @author hirwa
 */
public class ClientDao {
    private Session session;
    public void save(Client cl){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.save(cl);
       session.getTransaction().commit();
       session.close();
    }
    public void update(Client cl){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.update(cl);
       session.getTransaction().commit();
       session.close();
    }
    public void delete(Client cl){
       session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.delete(cl);
       session.getTransaction().commit();
       session.close();
    }
    public List<Client> findAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Client> clients = session.createQuery("from Client").list();
        session.close();
        return clients;
    }
    public Client findById(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Client cl = (Client) session.get(Client.class, id);
        session.close();
        return cl;
    }
}
