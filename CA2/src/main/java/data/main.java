/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.CityInfo;
import entity.Hobby;
import entity.Person;
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
       CityInfo cinfo =   new CityInfo(2800,"Lyngby");
        Address address = new Address("Klampenborgvej18","Sej By",cinfo);
        Hobby hobby = new Hobby("Goalmachine","Destrying other teams");
        Person newPerson = new Person("Leo","Messi",  hobby,address,"leo@Messo.dk") ;
        
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
        
        
        DBFacade db = new DBFacade();
       


        //System.out.println(dbf.getPersons().size() );
    }
}
