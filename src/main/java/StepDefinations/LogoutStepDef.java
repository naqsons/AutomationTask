package StepDefinations;

import Base.BaseClass;
import Pages.LogoutPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDef extends BaseClass {

    LogoutPage logoutPage;

    @After
    public void tearDown() {
        driver.quit();
    }

    @When("I click on hamburger menu")
    public void click_on_hamburger_menu() {
        logoutPage = new LogoutPage();
        logoutPage.clickOnHamburgerMenu();
    }

    @When("I click on Logout button")
    public void click_on_logout_button() {
        logoutPage.clickOnLogoutButton();
    }

    @Then("Verify I am able to logout successfully")
    public void verify_i_am_able_to_logout_successfully() {
        logoutPage.verifyLogout();
    }
}