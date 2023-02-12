package StepDefinations;

import Base.BaseClass;
import Pages.SwagLabsLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass {

    SwagLabsLoginPage swagLabsLoginPage;

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I access the sauce labs login page")
    public void access_the_sauce_labs_login_page() {
        setup();
        driver.get("https://www.saucedemo.com");
    }

    @When("^I am entering the user (.*)$")
    public void enter_username(String username) {
        swagLabsLoginPage = new SwagLabsLoginPage();
        swagLabsLoginPage.enterUserName(username);
    }

    @When("^I enter pass (.*)$")
    public void enter_password(String password) {
        swagLabsLoginPage.enterPassword(password);
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        swagLabsLoginPage.clickOnLoginBtn();
    }

    @Then("Verify user should not able to login")
    public void verify_user_should_not_able_to_login() {
        swagLabsLoginPage.verifyLoginWithWrongCred();
    }

    @Then("Verify user should be able to login")
    public void verify_user_should_be_able_to_login() {
        swagLabsLoginPage.verifyLoginWithRightCred();
    }
}
