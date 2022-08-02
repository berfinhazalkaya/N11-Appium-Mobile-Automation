package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class productPageStep {

    pages.productPage productPage = new pages.productPage(DriverFactory.getDriver());

    @Then("check product page")
    public void checkProductPage() {
        productPage.checkProductPage();
    }

    @When("click fav button")
    public void clickFavButton() {
        productPage.clickFavButton();
    }

    @When("click third product")
    public void clickThirdProduct() {
        productPage.clickThirdProduct();
    }
}