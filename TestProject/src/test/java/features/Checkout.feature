Feature: As a visitor of the SWAG LABS website
	user want to be able to do a purchase
	So that user can get the product what user wants

  @tag1
  Scenario: Successful Checkout
    Given User enters "username" and "password" and lands on SWAGLABS landing page
    When User adds Sauce Labs Backpack Item to Cart and proceed to Checkout
    And User verifies the product name is Checkoutpage
    And User enters "firstname" "lastname" and "zipcode" in Checkoutpage
    And User verifies product details in CheckoutOverviewPage
    Then User Redirected to Thankyou Page