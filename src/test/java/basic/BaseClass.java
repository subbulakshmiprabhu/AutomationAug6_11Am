package basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver browserSetUp(String browserName) {
		WebDriver driver = null;
		
		switch(browserName) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("please enter valid browser name.");
		
		}
		
		return driver;
		
	}
	
	public static int brokenLinkChecker(String link) {
		int count = 0;
		try {
			URL url = new URL(link);
			HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
			
			httpurl.connect();
			
			int responseCode = httpurl.getResponseCode();
			
			if(responseCode>=400) {
				count++;
				System.out.println("The given link is broken link "+ link);
				
			}else
			{
				System.out.println("The given link is valid link "+ link);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
		
		
		
	}

	

}
