package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test(priority  = 3)
	public void loginCheck() {
		String actualText = loginPage.login();
		
		String expectedText = "The password that you've entered is incorrect."
				+ "\nForgotten password?";
		
		System.out.println(actualText);
		System.out.println(expectedText);
		 Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority = 1)
	
	public void checkTitle() {
		String titleName = loginPage.getTitleName();
		
		Assert.assertEquals(titleName, "Facebook – log in or sign up");
	}
	
	@Test (priority = 2)
	public void checkUrl() {
		String url = loginPage.getUrl();
		Assert.assertEquals(url, "https://www.facebook.com/");
	}

}
