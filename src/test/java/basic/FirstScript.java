package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver(); //upcasting
//		
//	    // driver = new FirefoxDriver();
//		
//		
//		driver.get("https://www.google.com/");
		
		WebDriver driver = BaseClass.browserSetUp("firefox");
		driver.get("https://www.google.com/");
		

	}

}
