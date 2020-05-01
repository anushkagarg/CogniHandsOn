package com.selenium.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffSignTest {

	@Test
	public void testSignin(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://rediff.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle,"Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		WebElement signinLink =  driver.findElement(By.linkText("Sign in"));
		//open site,verify title,click signin,verify signin insert click submit verify 
	  
	    signinLink.click();
		//verify signin page title
		Assert.assertEquals(driver.getTitle(), "Rediffmail");
	
		//insert username and pswd
       // WebElement username = driver.findElement(By.id("login1"));
	    WebElement paswd = driver.findElement(By.name("passwd"));
	  // xapth of logo--   /html/body/div[2]/div/div[1]/span
	    //using relative XPATH :
	   WebElement username =  driver.findElement(By.xpath("//input[@id = 'login1']"));
	    
	    username.sendKeys("abc.com");
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    paswd.sendKeys("test");
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    WebElement btn = driver.findElement(By.name("proceed"));
	   btn.click();
	   
	   //verify profile pagetitle
	   
	   //Assert.assertEquals(driver.getTitle(),"Welcome to rediffmail");
	   
	   driver.quit();
	
	}
}
