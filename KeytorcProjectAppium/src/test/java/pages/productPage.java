package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class productPage {

    By searchBox = By.id("com.dmall.mfandroid:id/tvListingSearchBar");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkProductPage() {
        elementHelper.checkElementVisible(searchBox);
        String text = wait.until(ExpectedConditions.visibilityOf(driver.findElement(searchBox))).getText();
        System.out.println("Product Search Title Is = " + text);
    }

    public void clickFavButton() {
        List<WebElement> elementSizePage = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivFullImagesFavorite\")"));
        elementSizePage.get(3).click();
    }

    public void clickThirdProduct() {
        List<WebElement> elementSizePage = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivRecommendationProduct\")"));
        elementSizePage.get(2).click();
    }
}
