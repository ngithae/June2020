package launchbrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestJunit {

	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		// Create an object for the webdriver

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Naomi\\SeleniumFolder\\FirstSeleniumProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
		// to maximize a window of a webpage
		driver.manage().window().maximize();
		
		// to define an implicitwait that happens on the remote side
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	@Test
	public void LoginTest() {
		// provide username on the form
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// provide password on the form
		driver.findElement(By.id("password")).sendKeys("abc123");

		// How to verify the property of an element using an explicitwait on local side.
		//Property elements used; elementToBeClickable, visibilityOfElementLocated, elementToBeSelected.
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("login"))));

		// click on the log in button
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void LoginTest1() {
		// provide username on the form
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// provide password on the form
		driver.findElement(By.id("password")).sendKeys("abc123");

		// click on the log in button
		driver.findElement(By.name("login")).click();

	}

	@Test
	public void LoginTest2() {
		// provide username on the form
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// provide password on the form
		driver.findElement(By.id("password")).sendKeys("abc123");

		// click on the log in button
		driver.findElement(By.name("login")).click();

	}

	@After
	public void tearDown() {
		// close browser
		driver.close();

	}

}
