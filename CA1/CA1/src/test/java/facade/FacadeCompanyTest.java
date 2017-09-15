//package facade;
//
//import entity.Company;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class FacadeCompanyTest
//{
//    
//    public FacadeCompanyTest()
//    {


//        //init
//        System.out.println("getCompanyByCvr");
//        String cvr = "25-25-25";
//        FacadeCompany instance = new FacadeCompany();
//        Company expResult = new Company("test", "test", "25-25-25", 0, 0, "00000000");
//        
//        // execute
//        Company result = instance.getCompanyByCvr(cvr);
//        
//        // verify
//        assertNotNull(result);
//        assertEquals(expResult.getCvr(), result.getCvr());
//
//    }
//
//    @Test
//    public void testGetCompanyByPhone()
//    {
//        // init
//        System.out.println("getCompanyByPhone");
//        String phone = "00000000";
//        FacadeCompany instance = new FacadeCompany();
//        Company expResult = new Company("test", "test", "test", 0, 0, "00000000");
//        
//        // execute
//        Company result = instance.getCompanyByPhone(phone);
//        
//        // verify
//        assertNotNull(result);
//        assertEquals(expResult.getPhone(), result.getPhone());
    }


//    }
//    
//    @BeforeClass
//    public static void setUpClass()
//    {
//    }
//    
//    @AfterClass
//    public static void tearDownClass()
//    {
//    }
//    
//    @Before
//    public void setUp()
//    {
//    }
//    
//    @After
//    public void tearDown()
//    {
//    }
//
////    @Test
////    public void testGetCompanyByCvr()
////    {
//
////        //init
////        System.out.println("getCompanyByCvr");
////        String cvr = "25-25-25";
////        FacadeCompany instance = new FacadeCompany();
////        Company expResult = new Company("test", "test", "25-25-25", 0, 0, "00000000");
////        
////        // execute
////        Company result = instance.getCompanyByCvr(cvr);
////        
////        // verify
////        assertNotNull(result);
////        assertEquals(expResult.getCvr(), result.getCvr());
//
//    }
//
////    @Test
////    public void testGetCompanyByPhone()
////    {
////        // init
////        System.out.println("getCompanyByPhone");
////        String phone = "00000000";
////        FacadeCompany instance = new FacadeCompany();
////        Company expResult = new Company("test", "test", "test", 0, 0, "00000000");
////        
////        // execute
////        Company result = instance.getCompanyByPhone(phone);
////        
////        // verify
////        assertNotNull(result);
////        assertEquals(expResult.getPhone(), result.getPhone());
////    }
//
//
////    }
////
////    @Test
////    public void testGetCompanyByPhone()
////    {
//////        // init
//////        System.out.println("getCompanyByPhone");
//////        String phone = "00000000";
//////        FacadeCompany instance = new FacadeCompany();
//////        Company expResult = new Company("test", "test", "test", 0, 0, "00000000");
//////        
//////        // execute
//////        Company result = instance.getCompanyByPhone(phone);
//////        
//////        // verify
//////        assertNotNull(result);
//////        assertEquals(expResult.getPhone(), result.getPhone());
////    }
////
////    @Test
////    public void testGetNumEmployees()
////    {
//
////        // init        
////        System.out.println("getNumEmployees");
////        FacadeCompany instance = new FacadeCompany();  
////        int numEmployees = 0;
////        List<Company> expResult = new ArrayList<Company>() {{
////            new Company("test1", "test", "test", 0, modCount, "00000000");
////            new Company("test2", "test", "test", 0, modCount, "11111111");
////            new Company("test3", "test", "test", 0, modCount, "22222222");
////        }};
////        
////        // execute
////        List<Company> result = instance.getNumEmployees(numEmployees);
////        
////        // verify
////        assertEquals(expResult.size(), result.size());
//
////    }
////    
//
////}
