/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.CityInfo;
import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Janus
 */
public class DBFacade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1", null);
    EntityManager em = getManager();

    public DBFacade() {
        Persistence.generateSchema("pu1", null);
    }

    public void save(Object o){
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Person getPerson(int id){
        Query q = em.createQuery("SELECT p FROM Person p WHERE p.id = :id");
        q.setParameter("id", id);
        Person p = (Person) q.getSingleResult();
        return p;
    }
    
    public List<Person> getPersons(){
        Query q = em.createQuery("SELECT p FROM Person p");
        List<Person> p = q.getResultList();
        return p;
    }
    
    public List<Person> getPersons(int zipCode){
        Query q = em.createQuery("SELECT a FROM Address a JOIN a.cityInfo c WHERE c.zipCode = :zipCode");
        q.setParameter("zipCode", zipCode);
        Address a = (Address) q.getResultList();
        return null;
    }
    
    public Person getCompany(String cvr){
        Query q = em.createQuery("SELECT c FROM Company c WHERE c.cvr = :cvr");
        q.setParameter("cvr", cvr);
        Person p = (Person) q.getSingleResult();
        return p;
    }
    
    private EntityManager getManager() {
        return emf.createEntityManager();
    }

}
