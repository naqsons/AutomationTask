package Pages;

import Base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


public class LogoutPage extends BaseClass {

    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamburger_menu;
    @FindBy(id = "logout_sidebar_link")
    WebElement logout_btn;
    @FindBy(id = "login-button")
    WebElement login_btn;
    @FindBy(className = "login_logo")
    WebElement login_logo;


    public void clickOnHamburgerMenu() {
        wait.until(ExpectedConditions.visibilityOf(hamburger_menu));
        hamburger_menu.click();
    }

    public void clickOnLogoutButton() {
        wait.until(ExpectedConditions.visibilityOf(logout_btn));
        logout_btn.click();
    }

    public void verifyLogout() {
        wait.until(ExpectedConditions.visibilityOf(login_btn));
        Assert.assertTrue(login_btn.isDisplayed());
        Assert.assertTrue(login_logo.isDisplayed());
    }

}
