package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
	static WebDriver driver;

	public static void main(String[] args) {
		LaunchBrowser();
		LoginTest();
		tearDown();

	}
	
	public static void LaunchBrowser() {
		// Create an object for the webdriver
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naomi\\SeleniumFolder\\FirstSeleniumProject\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
				//to maximize a window of a webpage
				driver.manage().window().maximize();
		
	}

	public static void LoginTest() {
		// provide username on the form
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				
				// provide password on the form
				driver.findElement(By.id("password")).sendKeys("abc123");
				
				// click on the log in button
				driver.findElement(By.name("login")).click();	
		
	}
	
	public static void tearDown() {
		//close browser
		driver.close();
		
	}
}
