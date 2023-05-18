package stepDefinitions;

import com.pages.RegistrationPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationPageSteps {


    private RegistrationPage registrationPage = new RegistrationPage(DriverFactory.getDriver());
    private static String errorMessage;
    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        registrationPage.goToRegPage();
    }


    @When("user click on my registration page")
    public void user_click_on_my_registration_page() {
        registrationPage.navigateToRegistrationPage();
    }

    @Then("user enters last name {string}")
    public void user_enters_last_name(String lastName) {
        registrationPage.setLastName(lastName);
    }

    @Then("user enters email as {string}")
    public void user_enters_email_as(String emailAddress) {
        registrationPage.setEmail(emailAddress);
    }

    @Then("user enters phone number {string}")
    public void user_enters_phone_number(String phoneNumber) throws InterruptedException {
        Thread.sleep(3000);
        registrationPage.setPhoneNumber(phoneNumber);
    }

    @Then("user enters fax number {string}")
    public void user_enters_fax_number(String faxNum) throws InterruptedException {
        Thread.sleep(3000);
        registrationPage.setFaxNumber(faxNum);
    }

    @Then("user enters password for registration page {string}")
    public void user_enters_password_for_registration_page(String psswrd) throws InterruptedException {
        Thread.sleep(3000);
        registrationPage.setPassWord(psswrd);
    }

    @Then("user enters confirm password for registration page {string}")
    public void user_enters_confirm_password_for_registration_page(String cnfrmPass) throws InterruptedException {
        Thread.sleep(5000);
        registrationPage.setConfirmPassWord(cnfrmPass);
    }

    @Then("user click on registration button")
    public void user_click_on_registration_button() throws InterruptedException {
        Thread.sleep(3000);
        registrationPage.setButtonClick();
    }

    @Then("user see error message {string}")
    public void user_see_error_message(String expectedErrorMsg) throws InterruptedException {
        Thread.sleep(3000);
        errorMessage = registrationPage.errorValidation();
        Assert.assertTrue(errorMessage.contains(expectedErrorMsg));
    }





}
