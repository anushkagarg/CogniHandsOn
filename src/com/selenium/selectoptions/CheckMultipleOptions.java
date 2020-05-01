package com.selenium.selectoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckMultipleOptions {

	WebDriver driver = null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	@AfterMethod()
		public void closeBrowser(){
			driver.quit();
	}
	
	@Test
	public void selectDob(){
		WebElement month = driver.findElement(By.name("birthday_month"));
	  Select select = new Select(month);
	  
	
	}
}
