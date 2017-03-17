/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.Hobby;
import entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Yousinho
 */
public class DBFacadeNoDatabase {

    List<Person> persons = new ArrayList<Person>();
    
    public DBFacadeNoDatabase() {
       
        initData();
        
    }
    
    
    private void initData(){
    persons.add(new Person(1,"Leo","Messi",new Hobby(1,"god og football","Destrying big football teams")));
    persons.add(new Person(2,"Xavi","Hernandez",new Hobby(2,"Giving assist","blablablabla giving assists to Leo Messi")));

    }
    
    public Person getPerson(int id){
  
        return persons.get(id-1);
     //   return new Person;
    }
    
    public List<Person> getPersons(){
       
        return persons;
    }
    
}
