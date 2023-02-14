package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObject {

	
public WebDriver driver;
	
	private By Firstname=By.xpath("//input[@name='UserFirstName']");
	private By Lastname=By.xpath("//input[@name='UserLastName']");
	private By Email=By.xpath("//input[@name='UserEmail']");
	private By Phone=By.xpath("//input[@name='UserPhone']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	
	
	public signupPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}
	public WebElement enterFirstname() {
		return driver.findElement(Firstname);
	}
	public WebElement enterLastname() {
		return driver.findElement(Lastname);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}
	public WebElement enterPhone() {
		return driver.findElement(Phone);
	}
	public WebElement enterCompany() {
		return driver.findElement(Company);
	}
	public WebElement selectEmployees() {
		return driver.findElement(Employees);
	}
	public WebElement selectCountry() {
		return driver.findElement(Country);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
