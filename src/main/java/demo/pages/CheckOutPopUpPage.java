package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class CheckOutPopUpPage {

    public void clickLowestSuggest(){
        AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest")).click();
    }

    public void clickMiddleSuggest(){
        AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_middle")).click();
    }

    public void clickHighestSuggest(){
        AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_highest")).click();
    }

    public void inputCash(String Keyword){
        AndroidElement inputCash = AndroidDriverInstance.androidDriver.findElement(By.id("cash_edit_text"));
        inputCash.sendKeys(Keyword);
    }

    public void clickCharge(){
        AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button")).click();
    }
}

