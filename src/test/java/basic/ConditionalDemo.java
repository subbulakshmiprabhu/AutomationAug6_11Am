package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement input = driver.findElement(By.id("APjFqb"));
		
		input.sendKeys("selenium");
		String text = input.getAttribute("value");
		
		System.out.println(text);
		
		String classvalue = input.getAttribute("class");
		System.out.println(classvalue);
		
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String text2 = gmail.getText();
		System.out.println(text2);
		
		
		System.out.println(gmail.getAttribute("innerHTML"));
		System.out.println(gmail);
	}
}
