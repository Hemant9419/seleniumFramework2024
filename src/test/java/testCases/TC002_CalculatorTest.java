package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjec.CalculatorPage;
import pageObjec.HomePage;
import testBase.BaseClass;

public class TC002_CalculatorTest extends BaseClass {

	CalculatorPage obj;

	@Test(priority = 0, groups = { "smoke", "sanity" })
	public void calculateCarEmi() {
		HomePage ob = new HomePage(driver);
		obj = new CalculatorPage(driver);
		ob.clickcalculatorLink();

		obj.clickEMIlink();
	}

	@Test(priority = 1, dependsOnMethods = "calculateCarEmi", dataProvider = "getdata", groups = "smoke")
	public void enterFieldAmount(String rupees, String months, String rates) {
		obj.enterLoanFiled(rupees, months, rates);

	}

	@DataProvider
	public Object[][] getdata() {

		Object[][] data = new Object[2][3];

		data[0][0] = "890";
		data[0][1] = "5";
		data[0][2] = "50";

		data[1][0] = "8900";
		data[1][1] = "8";
		data[1][2] = "15";

		return data;

	}
}
