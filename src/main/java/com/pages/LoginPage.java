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
    private By emailId = By.id("Email");
    private By passwordByUser = By.id("Password");
    private By signInButton = By.xpath("//button[normalize-space()='Log in']");

    private By forgotPwdlink = By.linkText("Forgot password?");

    private By myAccountPage = By.xpath("//a[@class='ico-account']");

    //2. Constructor of the page class
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public  void  goToLoginPage(){
//        driver.get("https://localhost:44369/login");

        driver.navigate().to("https://localhost:44369/login");
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

    public void clickOnAccountPage(){
        driver.findElement(myAccountPage).click();
    }
}
