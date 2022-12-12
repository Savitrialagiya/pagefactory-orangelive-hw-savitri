package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashboardText;


    public void enterUsername(String username) {
        Reporter.log("Enter username " + username + " to username field " + userNameField.toString());
        sendTextToElement(userNameField, username);
        CustomListeners.test.log(Status.PASS,"Enter username" + username);

    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"Enter password" + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on Login Button" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on Login Button");
    }

    public String getDashboardText() {
        Reporter.log("Verify Dashboard Text" + dashboardText.toString());
        CustomListeners.test.log(Status.PASS,"Verify Dashboard Text");
        return getTextFromElement(dashboardText);
    }


}
