package com.selenium.masterpart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {
	
	WebDriver driver = null;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}
	@AfterMethod()
		public void closeBrowser(){
			driver.quit();
	}
	@Test
	public void getIFrame(){
		driver.findElement(By.linkText("Button")).click();
		WebElement pageTitle = driver.findElement(By.className("entry-title"));
		Assert.assertEquals(pageTitle.getText(),"Button");
		
		//working in frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));
		WebElement firstBtn = driver.findElement(By.xpath("//*[@class = 'widget']/button"));
		Assert.assertEquals(firstBtn.getText(),"A button element");
		
		driver.switchTo().parentFrame();
		WebElement example =driver.findElement(By.xpath("//*[@id='content']/div[1]/h2"));
	    Assert.assertEquals(example.getText(),"Examples");
	
	}
}