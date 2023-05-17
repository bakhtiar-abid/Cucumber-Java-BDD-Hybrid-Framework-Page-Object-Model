package stepDefinitions;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AccountPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private AccountsPage accountsPage;
    @Given("user has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable credTable) {
      List<Map<String, String>> credList = credTable.asMaps();
       String userName = credList.get(0).get("username");
       String password = credList.get(0).get("password");




        accountsPage = loginPage.doLogin(userName,password);
    }

    @Given("user is on Accounts page")
    public void user_is_on_accounts_page() {
        loginPage.clickOnAccountPage();
        String title = accountsPage.getAccountsPageTitle();
        System.out.println("Accounts Page title is: " + title);

    }

    @Then("user gets accounts section")
    public void user_gets_accounts_section(DataTable sectionsTable) {
        List<String> expAccountSectionsList = sectionsTable.asList();

        System.out.println("Expected accounts section list: " + expAccountSectionsList);

        List<String> actualAccountSectionsList = accountsPage.getAccountsSectionsList();
        System.out.println("Actual accounts section list: " + actualAccountSectionsList);

        Assert.assertTrue(expAccountSectionsList.containsAll(actualAccountSectionsList));

    }

    @Then("accounts section count should be {int}")
    public void accounts_section_count_should_be(Integer expectedSectionCount) {
        Assert.assertTrue(accountsPage.getAccountsSectionCount() == expectedSectionCount);

    }

}
