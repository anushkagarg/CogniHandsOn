package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class InvokeBrowserAuto {
WebDriver driver = null;
	
    @Parameters("browser")
	@BeforeMethod
	public void OpenBrowser(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
		//Open the URL with Selenium
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();	
		}else{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		
		//To maximize the Browser
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
	
	
	@Test
	public void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
				
		driver.get(URL);
	
		//Verify HomePage Tiitle
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
