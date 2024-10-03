package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassLocatorDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//WebElement input = driver.findElement(By.className("gLFyf"));
		
		
		WebElement input = driver.findElement(By.tagName("textarea"));
		
		input.sendKeys("selenium");
	}

}
