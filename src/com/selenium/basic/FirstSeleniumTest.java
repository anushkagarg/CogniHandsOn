package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

	@Test
	public void verifyFacebookHomePage(){
		String url = "https://www.facebook.com";
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().window().maximize(); //to maximize window size
		String pageTitle = driver.getTitle();
	    System.out.println("get the title:" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
	    driver.close(); //for closing browser
	} 
}
