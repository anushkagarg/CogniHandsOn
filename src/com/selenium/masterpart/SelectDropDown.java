package com.selenium.masterpart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectDropDown {

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
	/*public void SelectDOM(){
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select select = new Select(month);
		select.selectByIndex(5);
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		select.selectByValue("11");
		try {
			Thread.sleep(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		select.selectByVisibleText("Sept");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> monthValues = select.getOptions();
		for(WebElement monthh: monthValues){
			System.out.println(monthh.getText());
		}*/
	public void handleBrowser(){
		driver.get("https://www.facebook.com/");
		String handle = driver.getWindowHandle();
		System.out.println("main page id"+handle);
		
		driver.findElement(By.linkText(""));
		String forgot = driver.getWindowHandle();
		System.out.println("forgot page id"+forgot);
	}
	
	@Test
	public void handleMultiTabs(){
		driver.get("");
	}
	
}
