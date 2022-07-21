package training;

import org.junit.Test;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;	 

public class FirstSeleniumClass {
	
	private WebDriver driver;
	
	@Test
	public void testEasy() {
		driver = new ChromeDriver();
		
		driver.get("https://testautomationu.applitools.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		org.junit.Assert.assertTrue(title.equals("Test Automation University | Applitools"));
		
		driver.quit();
	}
	
	@Test
	public void testTwo() {
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		String title1 = driver.getTitle();
		System.out.println("title is " + title1);
		org.junit.Assert.assertTrue(title1.equals("Google"));
		
		driver.quit();
	}

}
