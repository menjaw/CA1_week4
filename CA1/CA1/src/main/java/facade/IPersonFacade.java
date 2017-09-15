/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface IPersonFacade {
    
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public Person getPersonById(int id);
    public Person getPersonByPhone(String phone);
    public List<Person> getPersons();
    public List<Person> getPersons(int zipCode);
    public List<Person> getPersons(String hobbyName);
    public int getNumPerson(String hobbyName);
    public Person addPerson(Person person);
    public Person editPerson(Person person);
    public Person deletePerson(int id);
    

}
