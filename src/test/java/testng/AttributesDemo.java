package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesDemo {
	@Test(priority = -2, description = "user logging in", enabled = true, timeOut = 5000)
	public void login() throws InterruptedException {
		
		
		//Thread.sleep(6000);
		System.out.println("login method");
	}
	@Test(priority =-1, invocationCount = 3, invocationTimeOut = 2000)
	public void homepage() throws InterruptedException {
		Thread.sleep(1500);
		System.out.println("home method");
	}
	
	
	
	
	@Test (priority =0)
	public void productPage() {
		System.out.println("product method");
		Assert.assertEquals(false, true);
	}
	@Test(priority =4, dependsOnMethods = "productPage", alwaysRun =  true)
	public void addToCartPage() {
		System.out.println("addto cart method");
		
	}
	
	@Test(priority = 5, expectedExceptions =  Exception.class)
	
	public void division() {
		int div = 14/0;
	}
	
	

}
