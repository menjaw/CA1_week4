package jpacontrol;

import entity.Address;
import entity.Company;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Address address1 = new Address();
        address1.setStreet("Street 1");

        Person p1 = new Person();
        p1.setFirstName("John");
        p1.setLastName("Olesen");
        p1.setAddress(address1);
        p1.setEmail("email@dk.dk");
        em.persist(p1);
        
        Company c = new Company();
        c.setName("Falck");
        c.setCvr("23423523");
        
        em.persist(c);
        
        em.getTransaction().commit();
        em.close();
    }
}
