package testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	static WebDriver driver;
	
	static ExtentReports extent ;
	
	static ExtentTest test;
	@BeforeSuite
	public void setUp() {
		
		
	     extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/report/Spark.html");
		extent.attachReporter(spark);

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	@Test
	public void login() throws IOException {
		
		
		 test = extent.createTest("login google").assignAuthor("user3").assignCategory("sanity").assignDevice("windows11");
		 
		 test.log(Status.INFO, "Opening google page");
		
		  driver.get("https://www.google.com/");
		  
		  
		  String actualTitle = driver.getTitle();
		  
		  
		  if(actualTitle.equals("Googlee")) {
			  test.log(Status.PASS, "Title matched");
			  
		  }else
		  {
			  test.log(Status.FAIL, "Title mismatched");
			  
			  captureScreenshot();
		  }
	}
	
	@Test
	public void test1() {
		
		test= extent.createTest("Test1").assignAuthor("user1").assignCategory("regression").assignDevice("windows10");
		
		
		test.log(Status.PASS, "Test1 passed");
	}
	
	@Test
	public void test2() {
		
		test = extent.createTest("Test2").assignAuthor("User2").assignCategory("sanity").assignDevice("windows 11");
		
		test.log(Status.FAIL, "Test2 failed");
		
	}
	
	@AfterSuite
	public void tearDown() {
				extent.flush();
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
		
		
		test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(dest.getAbsolutePath()).build());
		
	}

	
	
	

}
