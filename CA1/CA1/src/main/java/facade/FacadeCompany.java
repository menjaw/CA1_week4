/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadeCompany implements ICompanyFacade {

    private EntityManagerFactory emf;
    
    public FacadeCompany() {
        
    }
    
    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public Company getCompanyByCvr(String cvr) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Company comp = em.find(Company.class, cvr);
            em.getTransaction().commit();
            return comp;
        }
        finally {
            em.close();
        }
    }

    @Override
    public Company getCompanyByPhone(String phone) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Company company = (Company)em.createQuery("SELECT c FROM COMPANY c WHERE c.PHONE ="+ phone).getSingleResult();
            em.getTransaction().commit();
            return company;
        }
        finally {
            em.close();
        }
    }

    @Override
    public List<Company> getNumEmployees(int numEmployees) {
        EntityManager em = emf.createEntityManager();

        List<Company> company = null;
        
        try {
            em.getTransaction().begin();
            company = em.createQuery("Select c from Company c where Company.numEmployees =" + numEmployees).getResultList();
            em.getTransaction().commit();
            return company;
        }
        finally {
            em.close();
        }
    }

    @Override
    public void addCompany(Company company) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(company);
            em.getTransaction().commit();
}
        finally {
            em.close();
        }
    }

    @Override
    public Company editCompany(Company company) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Company c = em.find(Company.class, company.getId());
            if(c != null) {
                c = company;
                em.merge(c);
                em.getTransaction().commit();
                return c;
            }
        }
        finally {
            em.close();
        }  
        return null;
    }
    
}
