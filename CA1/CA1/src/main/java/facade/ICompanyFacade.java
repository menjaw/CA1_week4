/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Company;
import java.util.List;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Oliver
 */
public interface ICompanyFacade {
    
    public void addEntityManagerFactory(EntityManagerFactory emf);
    public Company getCompanyByCvr(String cvr);
    public Company getCompanyByPhone(String phone);
    public List<Company> getNumEmployees(int numEmployees);
    public void addCompany(Company company);
    public Company editCompany(Company company);
    
}
