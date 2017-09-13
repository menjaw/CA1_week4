/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import entity.Person;
import facade.FacadePerson;
import facade.IPersonFacade;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Persistence;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Menja
 */
@Path("person")
public class PersonResource {

    //Variables to facade and gson library
    private IPersonFacade personFacade = new FacadePerson();
    private Gson gson = new com.google.gson.Gson();

    //DUMMY DATA to test the methods
    //we make the map static, so it only belong to this class and not as an instance of the class
    private static Map<Integer, String> persons = new HashMap() {
        {
            put(1, "This should be person 1");
            put(2, "This should be person 2");
            put(3, "This should be person 3");
        }
    };

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiResource.
     *
     * Creates an EntityManagerFactory
     */
    public PersonResource() {
        //personFacade.addEntityManagerFactory(Persistence.createEntityManagerFactory("PU"));
    }

    /**
     * Retrieves representation of an instance of eu.websen.ca1.PersonResource
     *
     * @return a list with every objects in Json format
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/complete")
    public String getPersons() {
        //return "Det virker hvis du kan se dette";
        //List<Person> persons = personFacade.getPersons();
        return gson.toJson(new HashMap(persons));
    }

    /**
     * Retrieves representation of an instance of eu.websen.ca1.PersonResource
     *
     * @param id
     * @return a Json object with the given id
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/complete/id")
    public String getPerson(int id) {
        Person person = personFacade.getPersonById(id);
        return gson.toJson(person);
    }
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/contactinfo")
    public String getPersonByPhone() {
        // List<Person> personList = personFacade.getPersons();
        //return gson.toJson(new HashMap(personList));

        return gson.toJson(new HashMap(persons));
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePerson(String content) {

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void postPerson(String content) {
//        JsonObject jOb = gson.fromJson(content, JsonObject.class);

//        Person person = new Person();       
//        person.setFirstName(jOb.get("firsname").getAsString());
//        person.setLastName(jOb.get("lastname").getAsString());
//        Mangler en add metode i facaden til at putte brugeren i DB
    }
}
