package SDR;

//import static org.junit.Assert.assertEquals;  
import org.junit.After;  
import org.junit.AfterClass;  
import org.junit.Before;  
import org.junit.BeforeClass;  
import org.junit.Test;  
  
public class TestCase2 {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("Before class");
		
	}
	
	@Before
	public static void setUp() throws Exception
	{
		System.out.println("Before");
	}
	
	@Test
	public void testCube()
	{
		System.out.println("Test case cube");
		assertEquals(27,Calculation1.cube(3));
		
	}
	
	@After
	public void tearDown() throws Exception
	{
		System.out.println("After");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("After class");
		
		
	}

}
