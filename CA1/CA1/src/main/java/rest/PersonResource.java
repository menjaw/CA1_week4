package rest;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

@Path("person")
public class PersonResource {

    //Variables to facade and gson library
    private final IPersonFacade personFacade = new FacadePerson();
    private final JsonConverter jsonConverter = new JsonConverter();
    private JsonObject jOPersons;
    private JsonObject jOPerson;
    private JsonArray jOPersonsArray;

    @Context
    private UriInfo context;

    public PersonResource() {
        personFacade.addEntityManagerFactory(Persistence.createEntityManagerFactory("PU"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/complete/{id}")
    public String getPerson(@PathParam("id") int id) {
        Person person = personFacade.getPersonById(id);
        return jsonConverter.getJSONFromPerson(person);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/complete")
    public String getPersons() {
        List<Person> persons = personFacade.getPersons();
        return jsonConverter.getJSONFromPersons(persons);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/contactinfo")
    public String getPersonsInfo() {
         List<Person> personList = personFacade.getPersons();
         jOPersons = new JsonObject();
         jOPersonsArray = new JsonArray();
         
         for (int i = 0; i < personList.size(); i++) {
            JsonObject jOPerson = new JsonObject();
            
            jOPerson.addProperty("firstName", personList.get(i).getFirstName());
            jOPerson.addProperty("lastName", personList.get(i).getLastName());
            jOPerson.addProperty("Phone", personList.get(i).getPhones().toString());
            jOPerson.addProperty("email", personList.get(i).getEmail());
            
            jOPersonsArray.add(jOPerson);
        }
         jOPersons.add("persons", jOPersonsArray);
         return jOPersons.toString();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/contactinfo/{id}")
    public String getPersonInfo(@PathParam("id") int id) {
        Person person = personFacade.getPersonById(id);
        jOPerson = new JsonObject();
        
        jOPerson.addProperty("firstName", person.getFirstName());
        jOPerson.addProperty("lastName", person.getLastName());
        jOPerson.addProperty("Phone", person.getPhones().toString());
        jOPerson.addProperty("email", person.getEmail());
        
        return jOPerson.toString();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/phone")
    public String getPersonByPhone(String content) {
        
        return "";
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public String addPerson(String content) {
        Person personToAdd = jsonConverter.getPersonFromJson(content);//convert Person object from JSON to Java
        Person personAdded = personFacade.addPerson(personToAdd);
        return jsonConverter.getJSONFromPerson(personAdded);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/update")
    public String updatePerson(String content) {
        Person personToUpdate = jsonConverter.getPersonFromJson(content);
        Person personUpdated = personFacade.editPerson(personToUpdate);
        return jsonConverter.getJSONFromPerson(personUpdated);
    }

    @DELETE
    @Path("/delete/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePerson(@PathParam("id") int id) {
        Person deletedPerson = personFacade.deletePerson(id);
        return jsonConverter.getJSONFromPerson(deletedPerson);
    }
}
