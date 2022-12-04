package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankyouPage {
	
public WebDriver driver;
	
	public ThankyouPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By thankYouMessage = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");
	
	public String getTitleThankyouPage()
	{
		return driver.getTitle();
	}
	
	public String VerifyThankyouMessage()
	{
		return driver.findElement(thankYouMessage).getText();
	}

}
