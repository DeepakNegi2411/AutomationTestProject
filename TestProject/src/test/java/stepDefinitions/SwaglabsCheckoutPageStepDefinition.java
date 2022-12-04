package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import pageObjects.SwaglabsCheckoutPage;
import pageObjects.SwaglabsLandingPage;
import utils.TestContextSetup;

public class SwaglabsCheckoutPageStepDefinition {
	
	public WebDriver driver;
	public SwaglabsCheckoutPage swaglabsCheckoutPage;
	TestContextSetup testContextSetup;
	
	public SwaglabsCheckoutPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.swaglabsCheckoutPage = testContextSetup.pageObjectManager.getSwaglabsCheckoutPage();
	}
	
	@And("^User verifies the product name is Checkoutpage$")
    public void user_verifies_the_product_name_is_checkoutpage() throws Throwable {
        
		if(swaglabsCheckoutPage.VerifyProductName().equalsIgnoreCase("Sauce Labs Backpack"))
		{
			swaglabsCheckoutPage.ClickCheckoutButton();
		}
    }
	
	@And("^User enters \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" in Checkoutpage$")
    public void user_enters_something_something_and_something_in_checkoutpage(String firstname, String lastname, String zipcode) throws Throwable {
       
		swaglabsCheckoutPage.EnterUserDetailsToCheckout("Deepak", "Negi", "ZipCode1234");
		Thread.sleep(2000);
    }

}
