package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public SwaglabsLandingPage swagLabsLandingPage;
	public SwaglabsCheckoutPage swagLabsCheckoutPage;
	public CheckoutOverviewPage checkoutOverviewPage;
	public ThankyouPage thankyouPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public SwaglabsLandingPage getSwaglabsLandingPage()
	{
		swagLabsLandingPage = new SwaglabsLandingPage(driver);
		return swagLabsLandingPage;
	}
	
	public SwaglabsCheckoutPage getSwaglabsCheckoutPage()
	{
		swagLabsCheckoutPage = new SwaglabsCheckoutPage(driver);
		return swagLabsCheckoutPage;
	}
	
	public CheckoutOverviewPage getCheckoutOverviewPage()
	{
		checkoutOverviewPage = new CheckoutOverviewPage(driver);
		return checkoutOverviewPage;
	}
	
	public ThankyouPage getThankyouPage()
	{
		thankyouPage = new ThankyouPage(driver);
		return thankyouPage;
	}

}
