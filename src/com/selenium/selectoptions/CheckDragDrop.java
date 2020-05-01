package com.selenium.selectoptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckDragDrop {

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
	
	//@Test
	public void performDrag(){
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		
		driver.switchTo().frame(0);
		WebElement dragg = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(dragg, 110, 120);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void performDrop(){
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
	
	    Actions action = new Actions(driver);
	    action.dragAndDrop(src, target).build().perform();
	    
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	}
}
