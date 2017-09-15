//package facade;
//
//import entity.CityInfo;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class FacadeZip
//{
//    
//    public FacadeZip()
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
//    public void testGetAllZips()
//    {
//        // init
//        System.out.println("getAllZips");
//        FacadeZip instance = new FacadeZip();
//        List<CityInfo> expResult = new ArrayList<CityInfo>() {{
//          new CityInfo("2635", "Ishøj");
//          new CityInfo("2800", "Kongens Lyngby");
//          new CityInfo("2900", "Hellerup");
//        }};
//        
//        // execute
//        List<CityInfo> result = instance.getAllZips();
//        
//        // verify
//        assertEquals(expResult.size(), result.size());
//    }
//    
//}
