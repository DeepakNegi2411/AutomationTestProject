package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class SwaglabsLandingPage {
	
public WebDriver driver;
	
	public SwaglabsLandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By userNameField = By.name("user-name");
	By passwordFiled = By.name("password");
	By loginButton = By.name("login-button");
	By header = By.xpath("//span[text()='Products']");
	By productsList = By.xpath("//div[contains(@class,'inventory_list')]");
	By sauceLabsBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
	By cartLink = By.xpath("//div[@id='shopping_cart_container']");
	
	
	public void login(String userName, String password)
	{
		driver.findElement(userNameField).sendKeys(userName);
		driver.findElement(passwordFiled).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
	public boolean VerifySwagLabsPageHeader() 
	{
		return driver.findElement(header).isDisplayed();
		
	}
	
	public void SelectBackpack()
	{
		driver.findElement(sauceLabsBackpack).click();
	}
	
	public void AddBackpackToCart()
	{
		driver.findElement(addToCartBackpack).click();
	}
	
	public void selectCart()
	{
		driver.findElement(cartLink).click();
	}

}
