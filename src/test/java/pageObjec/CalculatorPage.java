package pageObjec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage {

	public CalculatorPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[ @alt=\"Car Loan EMI Calculator\"]")
	WebElement EMIlink;
	
	@FindBy(xpath="//*[@name=\"loan\" ]")
	WebElement LoanAmount;
	
	@FindBy(xpath="//*[@name=\"months\"]")
	WebElement month;
	
	@FindBy(xpath="//*[@name=\"rate\"]")
	WebElement rate;
	
	@FindBy(xpath="//*[@value=\"Submit\"]")
	WebElement submit;
	
	public void clickEMIlink() {
		
		EMIlink.click();
	}

	
	public void enterLoanFiled(String Rs, String  months, String rates) {
		LoanAmount.sendKeys(Rs);
		month.sendKeys(months);
		
	   rate.sendKeys(rates);
	   submit.click();
		
	}
}
