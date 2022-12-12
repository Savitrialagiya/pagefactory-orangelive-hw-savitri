package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    ForgotPasswordPage forgotPasswordPage;
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(),expectedMessage,"Page is not displayed");
    }
    @Test(groups = {"smoke","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginPage.getDashboardText(),expectedText,"Messsage not displayed");
    }

}


