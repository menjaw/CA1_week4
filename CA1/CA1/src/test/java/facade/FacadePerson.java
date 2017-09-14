//package facade;
//
//import entity.Person;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class FacadePersonTest
//{
//    
//    public FacadePersonTest()
//    {
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
//    @Test
//    public void testGetPersonById()
//    {
//        // init
//        System.out.println("getPersonById");
//        int id = 1;
//        FacadePerson instance = new FacadePerson();
//        Person expResult = new Person("Dogan", "Yildirim", 1);
//        
//        // execute
//        Person result = instance.getPersonById(id);
//        
//        // verify
//        assertEquals(expResult.getId(), result.getId());
//    }
//
//    @Test
//    public void testGetPersonByPhone()
//    {
//        // init
//        System.out.println("getPersonByPhone");
//        String phone = "00000000";
//        FacadePerson instance = new FacadePerson();
//        Person expResult = new Person("Dogan", "Yildirim", 1);
//        
//        // execute
//        Person result = instance.getPersonByPhone(phone);
//        
//        // verify
//        assertEquals(expResult.getId(), result.getId());
//    }
//
//    @Test
//    public void testGetNumPerson()
//    {
//        // init
//        System.out.println("getNumPerson");
//        String hobbyName = "Soccer";
//        FacadePerson instance = new FacadePerson();
//        
//        // execute
//        int expResult = 0;
//        int result = instance.getNumPerson(hobbyName);
//        
//        // verify
//        assertEquals(expResult, result);
//    }
//    
//}
