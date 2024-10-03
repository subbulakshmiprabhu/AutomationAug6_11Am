package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	public static void main(String[] args) {
		//WebDriver driver = BaseClass.browserSetUp("chrome");
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(1);
		WebElement input = driver.findElement(By.xpath("//input[@type = 'text']"));
		input.sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement btn = driver.findElement(By.linkText("Iframe with in an Iframe"));
		btn.click();
		
		
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		//driver.switchTo().frame(outerFrame);
		
		driver.switchTo().frame(2);
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		//driver.switchTo().frame(innerFrame);
		driver.switchTo().frame(0);
		WebElement input2 = driver.findElement(By.xpath("//input[@type = 'text']"));
		input2.sendKeys("selenium");
		
		
		driver.switchTo().parentFrame();
		
		boolean displayed = driver.findElement(By.xpath("//h5[text() = 'Nested iFrames']")).isDisplayed();
		System.out.println(displayed);
		
		driver.switchTo().defaultContent();
		
	}

}
