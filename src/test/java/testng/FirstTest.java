package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void firstClass2() {
		System.out.println("first class test");
	}
	
	@Test
	public void secondClass2() {
		System.out.println("second class test");
	}
	
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after method");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }


}
