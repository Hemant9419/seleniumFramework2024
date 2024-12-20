package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass {

	public WebDriver driver;

	@Parameters({ "os", "browser" })
	@BeforeClass

	public void setup(String os, String br) {

		switch (br.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;

		case "IE":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("No browser found");
			return;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().deleteAllCookies();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().window().maximize();
	}
	
	 @AfterClass public void teardown() {
	  driver.quit(); }
	 

}
