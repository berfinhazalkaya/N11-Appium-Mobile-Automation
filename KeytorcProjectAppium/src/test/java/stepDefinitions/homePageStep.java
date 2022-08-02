package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class homePageStep {

    pages.homePage homePage = new pages.homePage(DriverFactory.getDriver());

    @Given("Berfin is opened app")
    public void berfinIsOpenedNApp() {
        homePage.checkAppIcon();
    }

    @When("click my account button")
    public void clickMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @When("click home search box")
    public void clickHomeSearchBox() {
        homePage.clickhomeSearchBox();
    }

    @When("write {string} in search box")
    public void writeInSearchBox(String product) {
        homePage.writeSamsungInSearchBox(product);
    }

    @When("click samsung title")
    public void clickSamsungTitle() {
        homePage.clickSamsungTitle();
    }


}