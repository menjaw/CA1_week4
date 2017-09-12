/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.CityInfo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public class FacadeZip implements IZipFacade {
    
    private EntityManagerFactory emf;
    
    public FacadeZip() {
        
    }

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<CityInfo> getAllZips() {
        EntityManager em = emf.createEntityManager();

        List<CityInfo> cityInfo = null;
        
        try {
            em.getTransaction().begin();
            cityInfo = em.createQuery("Select z.zipCode from CityInfo z").getResultList();
            em.getTransaction().commit();
            return cityInfo;
        }
        finally {
            em.close();
        }
    }
    
}
