package com.selenium.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvokeBrowserDynamic {

	WebDriver driver;
	/* @AfterMethod
	public void OpenBrowser(String browser){	
	}*/
	@Test
	public void verifyFacebookHomePage(){
		String url = "https://www.facebook.com";
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(options);*/
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize(); //to maximize window size
		driver.get(url);
		driver.manage().window().maximize(); //to maximize window size
		String pageTitle = driver.getTitle();
	    System.out.println("get the title:" +pageTitle);
		//Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
	    driver.close(); //for closing browser
	} 
	
}
