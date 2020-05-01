package com.selenium.masterpart;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLink {
	@Test
	public void testBrokenLink(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\mars_workspace\\FirstSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://edition.cnn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		System.out.println("links are:"+ lists.size());
		
		for(WebElement link: lists){
			// System.out.println(link.getText());
			String URL = link.getAttribute("href");
			try {
				GetLinkStatus.verifyLink(URL);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Total broken links:");
		GetLinkStatus.getInvalidLinkCount();
		driver.quit();
}
}
