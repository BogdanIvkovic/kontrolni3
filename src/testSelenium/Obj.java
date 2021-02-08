package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Obj {
	
	
	public static final String USERNAME_XPATH = " //*[@id=\"user-name\"]";
	public static final String PASS_XPATH = " //*[@id=\"password\"] ";
	public static final String BTN_XPATH = "//*[@id=\"login-button\"] ";
	public static final String SRT_XPATH = "//*[@id=\"inventory_filter_container\"]/select";
	public static final String SCRL_XPATH = "//*[@id=\"inventory_filter_container\"]/option[3]";
	
	public static void Login(WebDriver driver, String username, String password) {
		WebElement we = driver.findElement(By.xpath(USERNAME_XPATH));
		we.click();
		we.sendKeys(username);
		
		
		WebElement we1 = driver.findElement(By.xpath(PASS_XPATH));
		we1.click();
		we1.sendKeys(password);
		driver.findElement(By.xpath(BTN_XPATH));
		
	}
	
	
	public static void Sort (WebDriver driver) {
	
			driver.findElement(By.xpath(SRT_XPATH));
			driver.findElement(By.xpath(SCRL_XPATH));
	}
	
	
	
	
	
		
		
	


	 
	
	
	
		
	}
		
	


