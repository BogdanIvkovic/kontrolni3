package testSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestSel {

	
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\driver\\Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		 	}
	
	@Test
	public void FailedLogin() {
		WebDriver driver;
	//	driver.navigate().to(Home.URL);
		String userName = "Bogdan";
		String password = "secret_sauce" ; 
	//	Home.UserName(driver, UserName);
		
		
		 
		
			 
			
			 	
		
	
						

				
				 

	}
	
		
	}
			
	

