package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class MouseHover {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17382917545863667199&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061910&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		
		WebElement span = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(span).perform();
		act.moveToElement(span, 10, 15).perform();
		
		//WebElement order = driver.findElement(By.xpath("//span[text() = 'Your Orders']"));
		
		Point location = span.getLocation();
		System.out.println(location);
		
		//act.moveToElement(order).click().perform();
		
		//act.moveToElement(order, , 0).perform();
		
		
	}

}
