package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
	
public WebDriver driver;
	
	public CheckoutOverviewPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By productName = By.xpath("//div[text()='Sauce Labs Backpack']");
	By finishButton = By.id("finish");
	
	public String VerifyProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void ClickFinishButton()
	{
		driver.findElement(finishButton).click();
	}
}
