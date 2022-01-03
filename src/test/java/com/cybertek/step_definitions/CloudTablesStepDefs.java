package com.cybertek.step_definitions;

import com.cybertek.pages.DataTablesHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CloudTablesStepDefs {

    DataTablesHomePage tablesHomePage = new DataTablesHomePage();

    @Given("User is on cloudtables home page")
    public void user_is_on_cloudtables_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        Assert.assertEquals("Editor | Editing for DataTables", Driver.getDriver().getTitle());


    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstName) {
        tablesHomePage.newBtn.click();
        tablesHomePage.firstName.sendKeys(firstName);

    }
    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastName) {
       tablesHomePage.lastName.sendKeys(lastName);


    }
    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {


        tablesHomePage.position.sendKeys(position);


    }
    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {


        tablesHomePage.salary.sendKeys(salary);

    }
    @When("User clicks on create button")
    public void user_clicks_on_create_button() {

        tablesHomePage.createBtn.click();

    }



    @Then("{string} should be added to the list")
    public void shouldBeAddedToTheList(String firstName) {

        tablesHomePage.searchBar.sendKeys(firstName);
        Assert.assertTrue(tablesHomePage.searchResult.getText().contains(firstName));
    }
}
