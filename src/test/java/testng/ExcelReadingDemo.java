package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadingDemo {
	
	
	@Test(dataProvider =  "getData")
	public void setUp(String name, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	}
	@DataProvider
	public String[][] getData() throws EncryptedDocumentException, IOException {
		
		
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testDatas\\testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("login");
		
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		DataFormatter format = new DataFormatter();
		
		String[][] testData = new String[rows-1][cols];
		
		for(int i =1; i< rows; i++) {
			
			for(int j = 0; j< cols; j++) {
				
				Cell cell = sheet.getRow(i).getCell(j);
				String data = format.formatCellValue(cell);
				
				testData[i-1][j] = data;
			}
			
		}
		
		
		
		
		return testData;
		
	}

}
