package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    public void inputUsername(String Keyword){
        AndroidElement inputUsername = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("emailOrPhoneEditText"));
        inputUsername.sendKeys(Keyword);
    }

    public void inputPassword(String Keyword){
        AndroidElement inputPass = AndroidDriverInstance.androidDriver
                .findElement(MobileBy.id("passwordEditText"));
        inputPass.sendKeys(Keyword);
    }

    public void clickSignIn(){
        AndroidDriverInstance.androidDriver.findElement(MobileBy.id("signInButton")).click();

    }

    public boolean errorState(){
        WebDriverWait wait = new WebDriverWait(AndroidDriverInstance.androidDriver, 30);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errorSignInTextView"))).isDisplayed();
    }
}
