/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.google.gson.annotations.Expose;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Janus
 */
@Entity
public class Company extends InfoEntity implements Serializable {

    public Company() {
    }

    public Company(String name, String description, String cvr, int numEmployees, int marketValue, String email, Address address, List<Phone> phones) {
        super(email, address, phones);
        this.name = name;
        this.description = description;
        this.cvr = cvr;
        this.numEmployees = numEmployees;
        this.marketValue = marketValue;
    }


    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
   @Expose  private String name;
    
   @Expose  private String description;
    
  @Expose   private String cvr;
    
   @Expose  private int numEmployees;
    
   @Expose  private int marketValue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Company[ id=" + id + " ]";
    }
    
}
