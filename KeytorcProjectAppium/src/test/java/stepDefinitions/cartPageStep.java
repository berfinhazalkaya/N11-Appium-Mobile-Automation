package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class cartPageStep {

    pages.cartPage cartPage = new pages.cartPage(DriverFactory.getDriver());

    @Then("check cart page")
    public void checkCartPage() { cartPage.checkCartPage(); }

    @When("click delete button")
    public void clickDeleteButton() { cartPage.clickDeleteButton(); }

    @Then("check empty cart")
    public void checkEmptyCart() { cartPage.checkEmptyCart(); }
}