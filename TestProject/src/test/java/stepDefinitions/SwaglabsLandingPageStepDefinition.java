package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.SwaglabsLandingPage;
import utils.TestContextSetup;

public class SwaglabsLandingPageStepDefinition {
	
	public WebDriver driver;
	public SwaglabsLandingPage swagLabsLandingPage;
	TestContextSetup testContextSetup;
	
	public SwaglabsLandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.swagLabsLandingPage = testContextSetup.pageObjectManager.getSwaglabsLandingPage();
	}
		
	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\" and lands on SWAGLABS landing page$")
    public void user_enters_something_and_something_and_lands_on_swaglabs_landing_page(String username, String password) throws Throwable {
        
		swagLabsLandingPage.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
    }
	
	@When("^User adds Sauce Labs Backpack Item to Cart and proceed to Checkout$")
    public void user_adds_sauce_labs_backpack_item_to_cart_and_proceed_to_checkout() throws Throwable {
        
		swagLabsLandingPage.SelectBackpack();
		swagLabsLandingPage.AddBackpackToCart();
		swagLabsLandingPage.selectCart();
		Thread.sleep(2000);
    }
}
