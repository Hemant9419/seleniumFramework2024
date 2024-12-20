package pageObjec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		 
	super(driver);
	}
	
	@FindBy(linkText = "Calculator")
	WebElement CalculatorLink;
	
	
	public void clickcalculatorLink() {
		CalculatorLink.click();
		
	}
	
	public String getTitle() {
		
		String url=driver.getCurrentUrl();
		
		return url;
		
	}
	
	
	
}
