package StepDefinations;

import Base.BaseClass;
import Pages.ProductsPage;
import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepDef extends BaseClass {
    ProductsPage productsPage;

    @After
    public void tearDown() {
        driver.quit();
    }

    @When("I click on products image")
    public void click_on_products_image() {
        productsPage = new ProductsPage();
        productsPage.clickOnProductsImage();
    }

    @Then("Verify product details page is opening")
    public void verify_product_details_page_is_opening() {
        productsPage.verifyProductsDetailPage();
    }

    @When("I click on add to cart button")
    public void click_on_add_to_cart_button() {
        productsPage = new ProductsPage();
        productsPage.clickAddToCartBtn();
    }

    @When("I click on go to cart button")
    public void click_on_go_to_cart_button() {
        productsPage.clickOnGotoCartBtn();
    }

    @When("Verify that multiple products are being added")
    public void verify_that_multiple_products_are_being_added() {
        productsPage.verifyProductList(2);
    }

    @When("I click on continue shopping")
    public void click_on_continue_shopping() {
        productsPage.clickOnContinueShopping();
    }

    @Then("Verify product is being added successfully")
    public void verify_product_is_being_added_successfully() {
        productsPage.verifyProductList(1);
    }

    @When("I click on remove product button")
    public void click_on_remove_product_button() {
        productsPage.removeProduct();
    }

    @Then("Verify product is being removed successfully")
    public void verify_product_is_being_removed_successfully() {
        productsPage.verifyProductList(0);
    }

    @And("I click on checkout button")
    public void click_on_checkout_button() {
        productsPage.clickOnCheckOutBtn();
    }

    @And("I click on continue button")
    public void click_on_continue_button() {
        productsPage.clickOnContinue();
    }


    @And("I enter user details")
    public void enter_user_details() {
        Faker faker = new Faker();
        productsPage.enterFirstName(faker.name().firstName());
        productsPage.enterLastName(faker.name().lastName());
        productsPage.enterPostalCode(faker.address().zipCode());
    }

    @And("I click on finish")
    public void click_on_finish() {
        productsPage.clickOnFinish();
    }

    @And("Verify order has been places successfully")
    public void verify_order_has_been_places_successfully() {
        productsPage.verifyOrderPlacedSuccessfully();
    }
}
