package javascriptdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class DrawBorderDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value = 'selenium@gmail.com';", username);
		
		//draw border
		
		
		jse.executeScript("arguments[0].style.border = '3px solid red';", username);
		
		
		WebElement login = driver.findElement(By.name("login"));
		String bgcolor = login.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		String newbgColor = "rgb(155, 235, 52)";
		
		for(int i =1; i<=100; i++) {
		
		jse.executeScript("arguments[0].style.backgroundColor= '"+newbgColor+"';", login);
		
		jse.executeScript("arguments[0].style.backgroundColor = '"+bgcolor+"';", login);
		}
		
		
		
		
	}

}
