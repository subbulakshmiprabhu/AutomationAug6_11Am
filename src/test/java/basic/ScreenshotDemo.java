package basic;

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

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo {
	static WebDriver driver ;
	public static void main(String[] args) throws IOException, AWTException {
		// driver = BaseClass.browserSetUp("chrome");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("selenium");
		captureScreenshot();
		//captureCompleteScreenShot();
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
		//captureScreenshot();
		captureCompleteScreenShot();
	}
	
	public static void captureScreenshot() throws IOException {
		SimpleDateFormat fomatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		
		Date date = new Date();
		System.out.println(date);
		
		TakesScreenshot tks = (TakesScreenshot) driver;
		File image = tks.getScreenshotAs(OutputType.FILE);
		
		//File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		
		File dest = new File("./screenshot/facebook"+fomatter.format(date)+".png");
		FileUtils.copyFile(image, dest);
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
