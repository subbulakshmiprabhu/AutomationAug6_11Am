package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.id("email"));
		
		input.sendKeys("selenium@gmail.com");
		
		
		WebElement pass = driver.findElement(By.name("pass"));
		
		pass.sendKeys("12345");
		
		
		//WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		
		//WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
		
		//link.click();
		
		
		 List<WebElement> findElements = driver.findElements(By.tagName("input"));
		 
		 System.out.println(findElements.size());
		
		
		
		//driver.close();
		
	}

}
