/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static com.oracle.jrockit.jfr.ContentType.Address;
import entity.Address;
import entity.Company;
import entity.Hobby;
import entity.Person;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Janus
 */
public class DataFiller {

    public DataFiller() {
        DBFacade dbf = new DBFacade();
        //persons
        dbf.save(new Person("fn1","ln1", Arrays.asList(new Hobby("hb1","dsc1"),"em1",new Address("vej1","ad1",))));
        //companies
        dbf.save(new Company());
    }

}
