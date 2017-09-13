/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import entity.Person;
import facade.FacadePerson;
import facade.IPersonFacade;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Menja
 */
@Path("person")
public class PersonResource {

    //Variables to facade and gson library
    private final IPersonFacade personFacade = new FacadePerson();
    private final JsonConverter jsonConverter = new JsonConverter();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiResource.
     *
     * Creates an EntityManagerFactory
     */
    public PersonResource() {
        personFacade.addEntityManagerFactory(Persistence.createEntityManagerFactory("PU"));
    }

    /**
     * Retrieves representation of an instance of eu.websen.ca1.PersonResource
     *
     * @param id
     * @return a Json object with the given id
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/complete/{id}")
    public String getPerson(@PathParam("id") int id) {
        Person person = personFacade.getPersonById(id);
        return jsonConverter.getJSONFromPerson(person);
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
        List<Person> persons = personFacade.getPersons();
        return jsonConverter.getJSONFromPersons(persons);
    }

    /**
     * POST method for creating an instance of PersonResource
     *
     * @param content representation for the resource
     * @return
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addPerson(String content) {
        Person personToAdd = jsonConverter.getPersonFromJson(content);//convert Person object from JSON to Java
        Person personAdded = personFacade.addPerson(personToAdd);
        return jsonConverter.getJSONFromPerson(personAdded);
    }

    /**
     * PUT method for updating or creating an instance of PersonResource
     *
     * @param content representation for the resource
     * @return
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/update")
    public String updatePerson(String content) {
        Person personToUpdate = jsonConverter.getPersonFromJson(content);
        Person personUpdated = personFacade.editPerson(personToUpdate);
        return jsonConverter.getJSONFromPerson(personUpdated);
    }

    /**
     * DELETE method to deleting an instance of PersonResource
     *
     * @param id
     * @return
     */
    @DELETE
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePerson(@PathParam("id") int id) {
        //Person deletedPerson = personFacade.deletePerson(id);
        //return jsonConverter.getJSONFromPerson(deletedPerson);
        return "";
    }
}
