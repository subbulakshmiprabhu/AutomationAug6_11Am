package pageLayer;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.BaseClass;



public class LoginPage extends BaseClass {
	
	By username = By.id("email");
	By password =By.id("pass");
	By login = By.name("login");
	By forgotPwd = By.linkText("Forgotten password?");
	By createNewBtn = By.id("u_0_0_Ga");
	
	By divElement = By.className("_9ay7");
	
	

	public String login() {
		driver.findElement(username).sendKeys("selenium");
		driver.findElement(password).sendKeys("123");
		driver.findElement(login).click();
		String text = driver.findElement(divElement).getText();
		return text;
		
	}
	
	public String getTitleName() {
		String title = driver.getTitle();
		
		return title;
	}
	
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	

}
