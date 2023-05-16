package stepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    private static String title;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    @Given("user is on login page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.goToLoginPage();
//        throw new io.cucumber.java.PendingException();
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        title =  loginPage.getLoginPageTitle();
        System.out.println("Login page title is: "+ title);
//        throw new io.cucumber.java.PendingException();
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(title.contains(expectedTitleName));
//        throw new io.cucumber.java.PendingException();
    }

    @Then("forgot your password link should be displayed")
    public void forgot_your_password_link_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(loginPage.isForgotPwdLinkExist());
//        throw new io.cucumber.java.PendingException();
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterUserName(username);
//        throw new io.cucumber.java.PendingException();
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterPassword(password);
//        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickOnLogin();
//        throw new io.cucumber.java.PendingException();
    }

    @Then("user gets the title of the account page")
    public void user_gets_the_title_of_the_account_page() {
        // Write code here that turns the phrase above into concrete actions

//        throw new io.cucumber.java.PendingException();
    }




}
