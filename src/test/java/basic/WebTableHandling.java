package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableHandling {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		List<WebElement> rowList = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr"));
		
		int rows = rowList.size();
		
		List<WebElement> colList = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/th"));
		
		int cols = colList.size();
		
		//To print all the table datas
		
//		for(int i = 2; i<=rows; i++ ) {
//			
//			for(int j =1; j<= cols; j++) {
//				
//				
//				String data = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]/td["+j+"]")).getText();
//				
//				System.out.print(data+ " ");
//				
//			}
//			System.out.println();
//			
//		}
//		
		//read datas based on specific condition
		for(int i = 2; i<=rows; i++) {
			
			String author = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]/td[2]")).getText();
			//System.out.println(author);
			
			if(author.equals("Amit")) {
				String bookname = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+i+"]/td[1]")).getText();
				System.out.println(bookname);
				
			}
			
			
		}
		
		//total price
		
		int sum =0;
		
		List<WebElement> prices = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/td[4]"));
		
		for(WebElement element:prices) {
			String data = element.getText();
			int dataPrice = Integer.parseInt(data);
			
			sum += dataPrice;
		}
		
		System.out.println("Total price :: "+sum);
		
		
		
		
		
	}

}
