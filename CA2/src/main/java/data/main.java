/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Address;
import entity.CityInfo;
import entity.Hobby;
import entity.Person;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Janus
 */
public class main {
    
    
    public static void main(String[] args) {
  Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//        Persistence.generateSchema("pu1", null);
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1", null);
//        EntityManager em = emf.createEntityManager();
  //new DataFiller();

//
DBFacade dbf = new DBFacade();
        System.out.println(gson.toJson(dbf.getPersonPhone(33)));
  
    }
}
