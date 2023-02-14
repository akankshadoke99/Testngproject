package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signupPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifySignup extends baseClass {

	@Test
	public void signup() throws IOException, InterruptedException {
		
	/*	driverInitilize();
		driver.get("https://login.salesforce.com/");     it is add in base class in before method no need to write here
		*/
		LoginPageObject lpo=new LoginPageObject(driver); 
		lpo.clickOntryforFree().click();
		
		signupPageObject spo = new signupPageObject(driver);

		Thread.sleep(5000);
		
		spo.enterFirstname().sendKeys(constants.firstname);
		spo.enterLastname().sendKeys(constants.lastname);
	    spo.enterEmail().sendKeys(constants.Email);
		spo.enterPhone().sendKeys(constants.Phone);
		spo.enterCompany().sendKeys(constants.Company);
		
	/*	Select s=new Select(spo.selectEmployees());      //it is handle by static dropdown
		s.selectByIndex(1);
		
	    Select s1=new Select(spo.selectCountry());      //it is handle by static dropdown
		s1.selectByIndex(1);
		*/
		
		commonMethods.selectDropdown(spo.selectEmployees(), 1);   //if common method of dropdown add in common method class then dont write here above two method 
		commonMethods.selectDropdown(spo.selectCountry(), 2);     //only write these two codes
		
		
		
		
		
	}
}
