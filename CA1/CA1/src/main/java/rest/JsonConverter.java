/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.Person;
import java.util.List;

/**
 *
 * @author Menja
 */
public class JsonConverter {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public Person getPersonFromJson(String javascript) {
        return GSON.fromJson(javascript, Person.class);
    }

    public String getJSONFromPerson(Person person) {
        return GSON.toJson(person);
    }

    public String getJSONFromPersons(List<Person> persons) {
        return GSON.toJson(persons);
    }
}
