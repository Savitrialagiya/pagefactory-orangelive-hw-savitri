package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordText;


    public void clickOnForgotPasswordLink() {
        Reporter.log("click On Forgot Password Link" + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
        CustomListeners.test.log(Status.PASS,"click On Forgot Password Link");
    }

    public String getResetPasswordText() {
        Reporter.log("Get Reset Password Text" + resetPasswordText.toString());
        CustomListeners.test.log(Status.PASS,"Get Reset Password Text");
        return getTextFromElement(resetPasswordText);
    }
}
