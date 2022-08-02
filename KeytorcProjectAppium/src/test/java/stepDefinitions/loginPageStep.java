package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class loginPageStep {

    pages.loginPage loginPage = new pages.loginPage(DriverFactory.getDriver());

    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("check login page")
    public void checkLoginPage() {
        loginPage.checkLoginPage();
    }

    @When("write {string} in email part")
    public void writeInEmailPart(String email) {
        loginPage.writeEmail(email);
    }

    @When("write {string} in password part")
    public void writeInPasswordPart(String psw) {
        loginPage.writePassword(psw);
    }

    @When("click show button")
    public void clickShowButton() {
        loginPage.clickShowButton();
    }

    @When("click login button in login page")
    public void clickLoginButtonInLoginPage() {
        loginPage.clickLoginButtonAgain();
    }
}