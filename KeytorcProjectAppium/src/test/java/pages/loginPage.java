package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {

    By loginButton = By.id("com.dmall.mfandroid:id/myAccountFragmentLogInBtn");
    By loginPageTitle = By.id("com.dmall.mfandroid:id/welcomeText");
    By emailPart = By.id("com.dmall.mfandroid:id/loginEmailET");
    By passwordPart = By.id("com.dmall.mfandroid:id/loginPassET");
    By showButton = By.id("com.dmall.mfandroid:id/showPassTV");
    By loginButton2 = By.id("com.dmall.mfandroid:id/LoginBtn");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public loginPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton,10);
        elementHelper.waitBySeconds(3);
    }

    public void checkLoginPage() {
        elementHelper.checkElementVisible(loginPageTitle);
    }

    public void writeEmail(String email) {
        elementHelper.sendKey(emailPart,email);
    }

    public void writePassword(String psw) {
        elementHelper.sendKey(passwordPart,psw);
    }

    public void clickShowButton() {
        elementHelper.click(showButton,10);
    }

    public void clickLoginButtonAgain() {
        elementHelper.click(loginButton2,10);
    }
}
