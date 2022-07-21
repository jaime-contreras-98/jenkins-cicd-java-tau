package maven_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Test;
import org.testng.annotations.Test;    
import org.testng.annotations.BeforeTest;    
import org.testng.annotations.AfterTest;
import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	private WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void testEasy() {
		
		driver.get("https://testautomationu.applitools.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		org.junit.Assert.assertTrue(title.equals("Test Automation University | Applitools"));

	}
	
	@Test
	public void testTwo() {
		
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		String title1 = driver.getTitle();
		System.out.println("title is " + title1);
		org.junit.Assert.assertTrue(title1.equals("Google"));

	}
}

