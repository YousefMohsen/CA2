/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import data.DBFacade;
import entity.Person;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Yousinho
 */
@Path("person")
public class PersonResource {
       Gson gson = new Gson();
//DBFacade dbf = new DBFacade();
  

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PersonResource
     */
    public PersonResource() {
    }

    /**
     * Retrieves representation of an instance of rest.PersonResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("complete")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {//return all persons, with all details
        //TODO return proper representation object
        System.out.println("hejee");
        
          // List  p =  dbf.getPersons();
       
      
        System.out.println(gson.toJson("p"));
        return "hej";//
    }

    @GET
    @Path("complete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerson(@PathParam("id") int id) {//returns a person with given id
        //TODO return proper representation object
    String r =  "{\"firstname\": \"Leo\","
                + "\"lastName\": \"Messi\","
                + "\"email\": \"kongen@live.dk\","
                + "\"phone\": \"287106102\","
                + "\"street\": \"Klampenborgvej 10\","
                + "\"zipcode\": \"2800\","
                + "\"city\": \"Lyngby\"}";
   
    return  gson.toJson(r);
    }
    
    
    @GET
    @Path("contactinfo")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllContactInfo() {//returns contact info for all persons
        //TODO return proper representation object
        return "getAllContactInfo";
    }
    
       @GET
    @Path("contactinfo/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPersonContactInfo(@PathParam("id") int id) {//returns only contact info for a given person
        //TODO return proper representation object
        return "getPersonContactInfo"+id;
    } 
    
    
    /**
     * PUT method for updating or creating an instance of PersonResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    //Person newPerson = gson.fromJson(content, Person.class);
    // dbf.updatePerson(newPerson);
   //     System.out.println("update"+newPerson.toString());
    }
    
    
}
