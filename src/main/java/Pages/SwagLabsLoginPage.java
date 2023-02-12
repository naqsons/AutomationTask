package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SwagLabsLoginPage extends BaseClass {

    public SwagLabsLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement user_name;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(name = "login-button")
    WebElement login_button;
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement error_message;
    @FindBy(className = "app_logo")
    WebElement app_logo;

    public String error_message_text = "Username and password do not match any user in this service";

    public void enterUserName(String username) {
        wait.until(ExpectedConditions.visibilityOf(user_name));
        user_name.sendKeys(username);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(this.password));
        this.password.sendKeys(password);
    }

    public void clickOnLoginBtn() {
        wait.until(ExpectedConditions.visibilityOf(login_button));
        login_button.click();
    }

    public void verifyLoginWithWrongCred() {
        wait.until(ExpectedConditions.visibilityOf(error_message));
        Assert.assertTrue(error_message.isDisplayed(), " It's not showing error message when user tries to login with wrong credentials");
        Assert.assertTrue(error_message.getText().contains(error_message_text), " error message isn't printing as it should be");
    }

    public void verifyLoginWithRightCred() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        Assert.assertTrue(app_logo.isDisplayed(), "Not able to login with right cred");
    }
}
