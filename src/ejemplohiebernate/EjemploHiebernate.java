/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohiebernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Luis Alberto
 */
public class EjemploHiebernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        System.out.println("Se conecto");
        Transaction transaction = session.beginTransaction();
        System.out.println("Inicio la transaccion");
        
        Persona p = new Persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("Av 1");
        p.setTelefono("5555");
        session.save(p);
        
        transaction.commit();
        
        System.out.println("Fin transaccion");
        session.close();
        
    }
    
}
