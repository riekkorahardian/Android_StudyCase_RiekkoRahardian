package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FavoritePage {

    public boolean isOnPage(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tool_bar_favorite_img"))).isDisplayed();

    }

    public void addItem(String itemName, int quantity) {
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '%s']";
        AndroidElement item = AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, itemName)));
        for (int i = 0; i < quantity; i++) {
            item.click();
        }
    }

        public void clickCheckout(){
            AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton")).click();
        }


}
