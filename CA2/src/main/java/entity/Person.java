/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Janus
 */
@Entity
public class Person extends InfoEntity implements Serializable {

    public Person() {
    }



    public Person(String firstName, String lastName, Hobby hobby, String email, Address address, List<Phone> phones) {
        super(email, address, phones);
     // if(hobbies==null){ hobbies = new ArrayList<Hobby>();}
        
        this.firstName = firstName;
        this.lastName = lastName;
      //  this.hobbies.add(hobby);
//        hobby.addPerson(this);
    }
    
    

    private static final long serialVersionUID = 1L;
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
    //[{"firstName":"fn3","lastName":"ln3","email":"em3","address":{"street":"vej3","additionalInfo":"ad3","cityInfo":{"zipCode":555,"city":"Scanning"}},"phones":[]}]
   @Expose private  String firstName;
    
    @Expose private String lastName;

    
    
    @ManyToMany(cascade = CascadeType.PERSIST)

    private  List<Hobby> hobbies;

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void addHobby(Hobby h){
    this.hobbies.add(h);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Person[ id=" + id + firstName+lastName+" ]";
    }
    
}
