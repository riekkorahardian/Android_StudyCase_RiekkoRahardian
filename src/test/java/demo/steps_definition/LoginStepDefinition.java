package demo.steps_definition;

import demo.pages.SignInPage;
import demo.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    StartPage startPage = new StartPage();
    SignInPage signInPage = new SignInPage();

    @Given("User is on moka start page")
    public void userIsOnMokaStartPage() {
        boolean actual = startPage.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("User click sign in button on moka start page")
    public void userClickSignInButtonOnMokaStartPage() {
        startPage.clikSignInButton();
    }

    @And("User input email/phone {string} on username text field")
    public void userInputEmailOnUsernameTextField(String Keyword) {
        signInPage.inputUsername(Keyword);
    }

    @And("User input password {string} on password text field")
    public void userInputPasswordOnPasswordTextField(String Keyword) {
        signInPage.inputPassword(Keyword);
    }

    @Then("User see error state Authentication failed")
    public void userSeeErrorStateAuthenticationFailed() {
        signInPage.errorState();
    }

    @And("User click sign in button on sign in page")
    public void userClickSignInButtonOnSignInPage() {
        signInPage.clickSignIn();
    }

}
