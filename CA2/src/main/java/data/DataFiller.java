/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entity.Address;
import entity.Company;
import entity.Hobby;
import entity.Person;
import entity.Phone;
import java.util.ArrayList;
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
        dbf.save(new Person("fn1","ln1",new Hobby("hb1","dsc1"),"em1",new Address("vej1","ad1",dbf.getCity(2800)),new ArrayList<Phone>(Arrays.asList(new Phone(11,"desc1")))));
        dbf.save(new Person("fn2","ln2",new Hobby("hb2","dsc2"),"em2",new Address("vej2","ad2",dbf.getCity(3045)),new ArrayList<Phone>(Arrays.asList(new Phone(22,"desc2")))));
        dbf.save(new Person("fn3","ln3",new Hobby("hb3","dsc3"),"em3",new Address("vej3","ad3",dbf.getCity(800)),new ArrayList<Phone>(Arrays.asList(new Phone(33,"desc3")))));
        dbf.save(new Person("fn4","ln4",new Hobby("hb4","dsc4"),"em4",new Address("vej4","ad4",dbf.getCity(4394)),new ArrayList<Phone>(Arrays.asList(new Phone(44,"desc4")))));
        dbf.save(new Person("fn5","ln5",new Hobby("hb5","dsc5"),"em5",new Address("vej5","ad5",dbf.getCity(8008)),new ArrayList<Phone>(Arrays.asList(new Phone(55,"desc5")))));
        dbf.save(new Person("fn6","ln6",new Hobby("hb6","dsc6"),"em6",new Address("vej6","ad6",dbf.getCity(2830)),new ArrayList<Phone>(Arrays.asList(new Phone(66,"desc6")))));
        dbf.save(new Person("fn7","ln7",new Hobby("hb7","dsc7"),"em7",new Address("vej7","ad7",dbf.getCity(2800)),new ArrayList<Phone>(Arrays.asList(new Phone(77,"desc7")))));
        dbf.save(new Person("fn8","ln8",new Hobby("hb8","dsc8"),"em8",new Address("vej8","ad8",dbf.getCity(2800)),new ArrayList<Phone>(Arrays.asList(new Phone(88,"desc8")))));
        dbf.save(new Person("fn9","ln9",new Hobby("hb9","dsc9"),"em9",new Address("vej9","ad9",dbf.getCity(2800)),new ArrayList<Phone>(Arrays.asList(new Phone(99,"desc9")))));
        dbf.save(new Person("fn10","ln10",new Hobby("hb10","dsc10"),"em10",new Address("vej10","ad10",dbf.getCity(2800)),new ArrayList<Phone>(Arrays.asList(new Phone(1010,"desc10")))));

    }

}
