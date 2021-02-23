/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.pkgclass;

import controller.BookDao;
import controller.identityDao;
import model.Book;
import model.Identity;

/**
 *
 * @author hirwa
 */
public class HibernateClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Identity id = new Identity(21089, "Liliane");
        identityDao idsd = new identityDao();
        idsd.SaveIdentity(id);*/
        
        Book bk = new Book(1, "The Davinci Code", "Dan Brown");
        BookDao bkd = new BookDao();
        bkd.SaveBook(bk);
        
        
    }
    
}
