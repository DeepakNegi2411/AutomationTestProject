package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Then;
import pageObjects.ThankyouPage;
import utils.TestContextSetup;

public class ThankyouPageStepDefinition {
	
	public WebDriver driver;
	public ThankyouPage thankyouPage;
	TestContextSetup testContextSetup;
	
	public ThankyouPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
		this.thankyouPage = testContextSetup.pageObjectManager.getThankyouPage();
	}
	
	@Then("^User Redirected to Thankyou Page$")
    public void user_redirected_to_thankyou_page() throws Throwable {
       
		Assert.assertEquals(thankyouPage.getTitleThankyouPage().contains("COMPLETE!"), 
				thankyouPage.getTitleThankyouPage().contains("COMPLETE!"));
		Assert.assertEquals(thankyouPage.getTitleThankyouPage().equalsIgnoreCase("Thank You For Your Order"), 
				thankyouPage.getTitleThankyouPage().equalsIgnoreCase("Thank You For Your Order"));
		Thread.sleep(2000);
    }

}
