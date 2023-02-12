package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class ProductsPage extends BaseClass {

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "app_logo")
    WebElement app_logo;
    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    WebElement add_to_cart_btn;
    @FindBy(className = "shopping_cart_link")
    WebElement goto_cart_btn;
    @FindBy(id = "checkout")
    WebElement checkout_btn;
    @FindBy(id = "first-name")
    WebElement first_name_input_field;
    @FindBy(id = "last-name")
    WebElement last_name_input_field;
    @FindBy(id = "postal-code")
    WebElement postal_code_input_field;
    @FindBy(id = "continue")
    WebElement continue_btn;
    @FindBy(id = "finish")
    WebElement finish_btn;
    @FindBy(className = "complete-text")
    WebElement complete_order;
    @FindBy(className = "cart_item")
    List<WebElement> cart_list;
    @FindBy(xpath = "//button[contains(@id,'remove')]")
    WebElement remove_product_btn;
    @FindBy(id = "continue-shopping")
    WebElement continue_shopping_btn;
    @FindBy(xpath = "//img[contains(@alt,'Sauce Labs')]")
    WebElement products_image;
    @FindBy(className = "inventory_details_img")
    WebElement products_detail_image;


    String complete_order_text = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";


    public void clickAddToCartBtn() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(add_to_cart_btn));
        add_to_cart_btn.click();
    }

    public void clickOnProductsImage() {
        wait.until(ExpectedConditions.visibilityOf(products_image));
        products_image.click();
    }

    public void verifyProductsDetailPage() {
        wait.until(ExpectedConditions.visibilityOf(products_detail_image));
        Assert.assertTrue(products_detail_image.isDisplayed());
    }

    public void clickOnGotoCartBtn() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(add_to_cart_btn));
        goto_cart_btn.click();
    }

    public void verifyProductList(int value) {
        Assert.assertEquals(cart_list.size(), value);
    }

    public void removeProduct() {
        wait.until(ExpectedConditions.visibilityOf(remove_product_btn));
        remove_product_btn.click();
    }

    public void clickOnContinueShopping() {
        wait.until(ExpectedConditions.visibilityOf(continue_shopping_btn));
        continue_shopping_btn.click();
    }

    public void clickOnCheckOutBtn() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(checkout_btn));
        checkout_btn.click();
    }

    public void enterFirstName(String first_name) {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(first_name_input_field));
        first_name_input_field.sendKeys(first_name);
    }

    public void enterLastName(String last_name) {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(last_name_input_field));
        last_name_input_field.sendKeys(last_name);
    }

    public void enterPostalCode(String postal_code) {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(postal_code_input_field));
        postal_code_input_field.sendKeys(postal_code);
    }

    public void clickOnContinue() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(continue_btn));
        continue_btn.click();
    }

    public void clickOnFinish() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(finish_btn));
        finish_btn.click();
    }

    public void verifyOrderPlacedSuccessfully() {
        wait.until(ExpectedConditions.visibilityOf(app_logo));
        wait.until(ExpectedConditions.visibilityOf(complete_order));
        Assert.assertTrue(complete_order.isDisplayed(), "Order is not placed successfully");
        Assert.assertEquals(complete_order.getText(), complete_order_text, "Order is not placed successfully");
    }
}
