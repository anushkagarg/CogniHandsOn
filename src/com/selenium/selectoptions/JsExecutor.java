package com.selenium.selectoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsExecutor {
	WebDriver driver = null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	@AfterMethod()
		public void closeBrowser(){
			driver.quit();
	}
	
	@Test
	public void testExecutor(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.rediff.com'");
		
		String title = (String)js.executeAsyncScript("return document.title");
		Assert.assertEquals(title,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping" );
		
		WebElement sign = driver.findElement(By.className("signin"));
		js.executeScript("arguments[0].click();",sign);
		//window.scroll(by,4000) for scrolling
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
