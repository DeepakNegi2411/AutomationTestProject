package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwaglabsCheckoutPage {
	
	public WebDriver driver;
	
	public SwaglabsCheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By productName = By.xpath("//div[text()='Sauce Labs Backpack']");
	By checkOutButton = By.id("checkout");
	By firstName =  By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueButton = By.id("continue");
	
	
	public String VerifyProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void ClickCheckoutButton()
	{
		driver.findElement(checkOutButton).click();
	}
	
	public void EnterUserDetailsToCheckout(String firstname, String lastname, String zipcode)
	{
		driver.findElement(firstName).sendKeys(firstname);
		driver.findElement(lastName).sendKeys(lastname);
		driver.findElement(zipCode).sendKeys(zipcode);
		driver.findElement(continueButton).click();
	}

}
