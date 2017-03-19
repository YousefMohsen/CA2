/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

//    public Person(String firstName, String lastName, List<Hobby> hobbies) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.hobbies = hobbies;
//    }

    public Person(String firstName, String lastName, List<Hobby> hobbies, String email, Address address, List<Phone> phones) {
        super(email, address, phones);
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies = hobbies;
    }
    
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String firstName;
    
    private String lastName;

    
    
    @ManyToMany
    private List<Hobby> hobbies;

    public Person(String firstName, String lastName, Hobby hobby,Address address,String email) {
   super(email,address);

        hobbies = new ArrayList<Hobby>();  
        this.firstName = firstName;
        this.lastName = lastName;
        this.hobbies.add(hobby);
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void addHobby(Hobby h){
    this.hobbies.add(h);
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
        return "entity.Person[ id=" + id + " ]";
    }
    
}
