package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	//This driver has no scope
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By passward=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	
	private By tryforfree=By.xpath("//a[@id='signup_link']");
	
	By errorMessage=By.xpath("//div[@id='error']");
	
	
	
	public LoginPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement enterPassward() {
		return driver.findElement(passward);
	}
	
	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}
	
	public WebElement clickOntryforFree() {
		return driver.findElement(tryforfree);
	}

	public WebElement errorText() {
		return driver.findElement(errorMessage);
		
	}
	
	
	
	
	
	
	
}
