package demo.steps_definition;

import demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinition {

  FavoritePage favoritePage = new FavoritePage();
  ReceiptPage receiptPage = new ReceiptPage();
  CheckOutPopUpPage checkOutPopUpPage = new CheckOutPopUpPage();

  @Then("User is on moka favourite page")
  public void userIsOnMokaFavouritePage() {
    favoritePage.isOnPage();

  }

  @When("User add item {string} with quantity {string} on favourite page")
  public void userAddItemWithQuantityOnFavouritePage(String Item, String Keyword) {
    int Quantity = Integer.parseInt(Keyword);
    favoritePage.addItem(Item, Quantity);
  }

  @And("User click charge button")
  public void userClickChargeButton() {
    favoritePage.clickCheckout();

  }

  @And("The user select the total payment that equal to the total price")
  public void theUserSelectTheTotalPaymentThatEqualToTheTotalPrice() {
    checkOutPopUpPage.clickLowestSuggest();
  }

  @And("User click charge button on checkout PopUp")
  public void userClickChargeButtonOnCheckoutPopUp() {
    checkOutPopUpPage.clickCharge();
  }

  @Then("User see receipt page with {string} information")
  public void userSeeReceiptPageWithInformation(String Keyword) {
    receiptPage.checkChange(Keyword);
  }

  @Then("User click charge back button")
  public void userClickChargeBackButton() {
    receiptPage.clickOkButton();
  }

  @And("The user select the total payment is more than the total price")
  public void theUserSelectTheTotalPaymentIsMoreThanTheTotalPrice() {
    checkOutPopUpPage.clickMiddleSuggest();
  }

  @And("The user select the total payment is highest than the total price")
  public void theUserSelectTheTotalPaymentIsHighestThanTheTotalPrice() {
    checkOutPopUpPage.clickHighestSuggest();
  }

  @And("The user input {string} cash payment on cash text field")
  public void theUserInputCashPaymentOnCashTextField(String Keyword) {
    checkOutPopUpPage.inputCash(Keyword);
  }
}
