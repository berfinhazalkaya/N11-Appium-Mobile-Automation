package pages;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class productDetailPage {

    By closeButton = By.id("com.dmall.mfandroid:id/closeIV");
    By productImage = By.id("com.dmall.mfandroid:id/productImageIV");
    By addToCartButton = By.id("com.dmall.mfandroid:id/pdpAddToCartButton");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public productDetailPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickCloseButton() {
        elementHelper.click(closeButton,10);
    }

    public void checkProductDetailPage() {
        elementHelper.checkElementVisible(productImage);
    }

    public void clickAddToCartButton() {
        elementHelper.click(addToCartButton,5);
    }


}
