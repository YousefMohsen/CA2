/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.CityInfo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Janus
 */
public class main {
    
    
    public static void main(String[] args) {
        Persistence.generateSchema("pu", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu", null);
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
//        em.persist(new CityInfo(2800,"Lyngby"));
        em.persist(new Address("Klampenborgvej18","Sej By",em.find(CityInfo.class, 1)));
        em.getTransaction().commit();
        em.close();
        
//        
//        DBFacade db = new DBFacade();
//        db.getPersons(2800);
    }
}
