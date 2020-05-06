package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class ReceiptPage {

    public void clickOkButton(){
        AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button")).click();
    }

    public void checkChange(String Change){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'change_text_view') and @text = '%s']";
        AndroidElement item = AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, Change)));
    }
}
