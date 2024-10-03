package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public void hard() {
		
		Assert.assertFalse(true);
		
		System.out.println("end of test");
		
		
	}
	
	@Test
	public void soft() {
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(false, true);
	
	
	System.out.println("end of soft test");
	
	soft.assertAll();
	}

}
