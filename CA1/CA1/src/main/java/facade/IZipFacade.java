/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.CityInfo;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface IZipFacade {
    
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public List<CityInfo> getAllZips();
    
}
