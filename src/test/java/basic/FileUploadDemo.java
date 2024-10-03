package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement chooseBtn = driver.findElement(By.name("upfile"));
		
		chooseBtn.sendKeys("G:\\Subbulakshmi\\Demo\\java_notes\\javanotes_Athish.txt");
		
		WebElement press = driver.findElement(By.xpath("//input[@type = 'submit']"));
		press.click();
	}

}
