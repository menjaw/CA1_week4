/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadePerson implements IPersonFacade {
    
    private EntityManagerFactory emf;
    
    public FacadePerson() {
        
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Person getPersonById(int id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Person pers = em.find(Person.class, id);
            em.getTransaction().commit();
            return pers;
        }
        finally {
            em.close();
        }
    }

    @Override
    public Person getPersonByPhone(String phone) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Person pers = em.find(Person.class, phone);
            em.getTransaction().commit();
            return pers;
        }
        finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons() {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;
        
        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Person p").getResultList();
            em.getTransaction().commit();
            return persons;
        }
        finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons(int zipCode) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;
        
        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Person p where CityInfo.zipCode =" + zipCode).getResultList();
            em.getTransaction().commit();
            return persons;
        }
        finally {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons(String hobbyName) {
        EntityManager em = emf.createEntityManager();

        List<Person> persons = null;
        
        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Person p where Hobby.name =" + hobbyName).getResultList();
            em.getTransaction().commit();
            return persons;
        }
        finally {
            em.close();
        }
    }

    @Override
    public int getNumPerson(String hobbyName) {
        EntityManager em = emf.createEntityManager();
        
        List<Person> persons = null;
        
        try {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from Person p where Hobby.name =" + hobbyName).getResultList();
            em.getTransaction().commit();
            return persons.size();
        }
        finally {
            em.close();
        }
    }

    @Override
    public Person addPerson(Person person) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
        finally {
            em.close();
        }
        return person;
    }

    @Override
    public Person editPerson(Person person) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Person p = em.find(Person.class, person.getId());
            if(p != null) {
                p = person;
                em.merge(p);
                em.getTransaction().commit();
                return p;
            }
        }
        finally {
            em.close();
        }  
        return null;
    }
}
