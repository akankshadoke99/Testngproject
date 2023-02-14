package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;

public class verifyLogin extends baseClass {
    
    SoftAssert a=new SoftAssert();
	@Test(dataProvider="testData")
	public void login(String uname,String password) throws IOException {

	/*	driverInitilize(); // it opens browser
		
	   //This driver have scope
		driver.get("https://login.salesforce.com/");        it is add in base class in before method no need to write here
     */
		LoginPageObject obj = new LoginPageObject(driver);
		
		commonMethods.handleAssertions(driver.getCurrentUrl(),"https://login.salesforce.com/","url is not matching");

		obj.enterUsername().sendKeys(uname);
		
		obj.enterPassward().sendKeys(password);
		
		obj.clickOnLogin().click();

	/*	SoftAssert a=new SoftAssert();
		String actual=obj.errorText().getText();
		String expected="Please check your password. If you still can't log in, contact your Salesforce administrator.";
		a.assertEquals(actual, expected,"Error message is not matching");    //actual and expected are not match means asserts goes fail then error message will print 
		
		a.assertAll();
		*/
		commonMethods.handleAssertions(obj.errorText().getText(),constants.expectedErrorMessage,"Error message is not matching");
		
	}
	
	 @DataProvider
	 public Object[][] testData() {
	  Object[][] data=new Object[3][2];
	  data[0][0]=constants.username1;
	  data[0][1]=constants.password1;
	  data[1][0]=constants.username2;
	  data[1][1]=constants.password2;
	  data[2][0]=constants.username3;
	  data[2][1]=constants.password3;
	  return data;
	 }
		
		
		
		
		
		
		
		
		
		
	
}
