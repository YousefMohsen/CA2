/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janus
 */
public class DBFacadeTest {
    
    public DBFacadeTest() {
       // DBFacade dbf = new DBFacade("put");
    }
    
    @Before
    public void setUp() {
       // new DataFiller();
       // DBFacade dbf = new DBFacade("put");
        
    }

    /**
     * Test of save method, of class DBFacade.
     */
    @org.junit.Test
    public void testSave() {
//        DBFacade dbf = new DBFacade("put");
//        dbf.save(new Person("tester","efternavn",new Hobby("hb2","dsc2"),"em2",new Address("vej2","ad2",dbf.getCity(3045)),new ArrayList<Phone>(Arrays.asList(new Phone(22,"desc2")))));
//        assertEquals("tester",dbf.getPersonName("tester").getFirstName());
    }

    /**
     * Test of getPerson method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPerson() {
//        DBFacade dbf = new DBFacade("put");
//        assertEquals("fn1",dbf.getPerson(1).getFirstName());
    }

    /**
     * Test of getPersons method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPersons_0args() {
//        DBFacade dbf = new DBFacade("put");
//        assertEquals(10,dbf.getPersons().size());
    }

    /**
     * Test of getPersons method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPersons_int() {
//        DBFacade dbf = new DBFacade("put");
//        assertEquals("fn3",dbf.getPersons(800).get(0).getFirstName());
    }
}
