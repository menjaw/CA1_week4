package jpacontrol;

import entity.Company;
import entity.InfoEntity;
import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Person p = new Person();
        p.setFirstName("John");
        p.setLastName("Olesen");
        
        InfoEntity i = new InfoEntity();
//        i.setEmail("jo@dk.dk");
//        i.setFirstName("John");
//        i.setLastName("Olsen");
//        
        Company c = new Company();
        c.setName("Falck");
        c.setCvr("23423523");
        
        em.persist(i);
        em.persist(c);
        
        em.getTransaction().commit();
        em.close();
    }
}
