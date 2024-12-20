package testCases;

import org.testng.annotations.Test;

import pageObjec.HomePage;
import testBase.BaseClass;

public class TC001_MycarHomeTest extends BaseClass {

	@Test(enabled=false)
	public void login() {
		
		HomePage obj= new HomePage(driver);
		
		obj.clickcalculatorLink();
		
		String title=obj.getTitle();
		
		System.out.println(title);
	}
}
