package com.pages;

import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    /*
    we have to mention by locators, constructor, page Methods
     */

    private WebDriver driver;
    //1. By locators
    private By emailId = By.id("email");
    private By passwordByUser = By.id("pass");
    private By signInButton = By.id("send2");

    private By forgotPwdlink = By.linkText("Forgot Your Password?");

    //2. Constructor of the page class
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public  void  goToLoginPage(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/login");
    }

    //3. Page actions: features(behavior) of the page the form of methods:

    public String getLoginPageTitle(){
     return  driver.getTitle();
    }

    public boolean isForgotPwdLinkExist(){
       return driver.findElement(forgotPwdlink).isDisplayed();
    }


    public void enterUserName(String username){
        driver.findElement(emailId).sendKeys(username);

    }

    public void enterPassword(String pwd){
        driver.findElement(passwordByUser).sendKeys(pwd);

    }

    public void clickOnLogin(){
        driver.findElement(signInButton).click();
    }
}
