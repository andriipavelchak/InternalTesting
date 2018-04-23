package com.internal.testing.internal_testing;
	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class AppTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			System.setProperty("webdriver.chrome.driver", "C:\\Development\\tools\\Selenium\\chromedriver_win32\\chromedriver.exe");
			// wrong part
			driver = new ChromeDriver();  
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
