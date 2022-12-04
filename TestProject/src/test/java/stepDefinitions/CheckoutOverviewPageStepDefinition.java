package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pageObjects.CheckoutOverviewPage;
import utils.TestContextSetup;

public class CheckoutOverviewPageStepDefinition {
	
	public WebDriver driver;
	public CheckoutOverviewPage checkoutOverviewPage;
	TestContextSetup testContextSetup;
	
	public CheckoutOverviewPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.checkoutOverviewPage = testContextSetup.pageObjectManager.getCheckoutOverviewPage();
	}

	 @And("^User verifies product details in CheckoutOverviewPage$")
	    public void user_verifies_product_details_in_checkoutoverviewpage() throws Throwable {
	        
		 if(checkoutOverviewPage.VerifyProductName().equalsIgnoreCase("Sauce Labs Backpack"))
			{
			 checkoutOverviewPage.ClickFinishButton();
			}
	    }
}
