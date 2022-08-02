package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class productDetailPageStep {

    pages.productDetailPage productDetailPage = new pages.productDetailPage(DriverFactory.getDriver());

    @When("click close button")
    public void clickCloseButton() { productDetailPage.clickCloseButton(); }

    @Then("check product detail page")
    public void checkProductDetailPage() { productDetailPage.checkProductDetailPage(); }

    @When("click add to cart button")
    public void clickAddToCartButton() {
        productDetailPage.clickAddToCartButton();
    }


}