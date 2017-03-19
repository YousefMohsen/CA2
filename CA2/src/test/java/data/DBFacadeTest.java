/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janus
 */
public class DBFacadeTest {
    
    public DBFacadeTest() {
        DBFacade dbf = new DBFacade("put");
    }
    
    @Before
    public void setUp() {
        new DataFiller();
       // DBFacade dbf = new DBFacade("put");
        
    }

    /**
     * Test of save method, of class DBFacade.
     */
    @org.junit.Test
    public void testSave() {
        //dbf.
    }

    /**
     * Test of getPerson method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPerson() {
    }

    /**
     * Test of getPersons method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPersons_0args() {
    }

    /**
     * Test of getPersons method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetPersons_int() {
    }

    /**
     * Test of getCompany method, of class DBFacade.
     */
    @org.junit.Test
    public void testGetCompany() {
    }
    
}
