package listenerdemo;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
	
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority =2 )
	public void login() {
		driver.findElement(By.id("email")).sendKeys("testng@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		//driver.findElement(By.name("login")).click();
		
		Assert.assertEquals(false, true);
	}
	@Test(priority = 1)
	public void checkTitle() {
	
		String expectedTitle= "Facebook – log in or sign ";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		//driver.close();
	}
	
	public static void captureCompleteScreenShot() throws AWTException, IOException {
		SimpleDateFormat fomatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		
		Date date = new Date();
		Robot r = new Robot();
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  Rectangle rect = new Rectangle(screenSize);
	  
	  BufferedImage image = r.createScreenCapture(rect);
	  
	  File dest = new File("./screenshot/robot"+fomatter.format(date)+".png");
	  
	  ImageIO.write(image, "png", dest);
		
	}

}
