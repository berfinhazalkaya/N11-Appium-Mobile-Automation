package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class cartPage {

    By payButton = By.id("com.dmall.mfandroid:id/basketContinueBtnRoot");
    By deleteButton = By.id("com.dmall.mfandroid:id/basketItemDeleteSelectedTV");
    By emptyCart = By.id("com.dmall.mfandroid:id/emptyBasketTitleTv");


    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public cartPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkCartPage() {
        elementHelper.checkElementVisible(payButton);
    }

    public void clickDeleteButton() {
        elementHelper.click(deleteButton,5);
    }

    public void checkEmptyCart() {
//        elementHelper.checkElementVisible(emptyCart);
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(emptyCart))).getText();
        System.out.println(text);
    }
}
