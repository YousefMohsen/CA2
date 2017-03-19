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
        Persistence.generateSchema("pu1", null);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1", null);
        EntityManager em = emf.createEntityManager();
        new DataFiller();
        
    }
}
