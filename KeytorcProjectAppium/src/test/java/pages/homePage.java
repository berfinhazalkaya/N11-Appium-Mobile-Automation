package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class homePage {
    By bannerImage = By.id("com.dmall.mfandroid:id/bannerImageIV");
    By myAccountButton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hesabım\")");
    By homeSearchBox = By.id("com.dmall.mfandroid:id/tvHomeSearchBar");
    By searchBox = By.id("com.dmall.mfandroid:id/etSearch");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkAppIcon() {
        elementHelper.checkElementVisible(bannerImage);
    }

    public void clickMyAccountButton() {
        elementHelper.click(myAccountButton,10);
        elementHelper.waitBySeconds(3);
    }

    public void clickhomeSearchBox() {
        elementHelper.click(homeSearchBox,10);
    }

    public void writeSamsungInSearchBox(String product) {
        elementHelper.sendKey(searchBox, product);
    }

    public void clickSamsungTitle() {
        List<WebElement> elementSizePage = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/keywordTV\")"));
        elementSizePage.get(0).click();

    }
}
