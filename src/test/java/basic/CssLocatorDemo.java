package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLocatorDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement inputemail = driver.findElement(By.cssSelector("input#email"));
		
		//WebElement inputemail = driver.findElement(By.cssSelector("input.inputtext._55r1._6l"));
		//inputemail.sendKeys("selenium");
		
		
		List<WebElement> findElements = driver.findElements(By.tagName("inputt"));
		System.out.println(findElements);
		
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("123");
		
		driver.findElement(By.cssSelector("button[type = 'submit']")).click();
	}

}
