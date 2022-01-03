package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyAllCategoriesPage;
import com.cybertek.pages.EtsyHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsySearchDefs {

    WebDriver driver;

    @Given("User is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        driver= Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("etsy.url"));
    }
    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {

        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", driver.getTitle());

    }
    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {

        EtsyHomePage etsyHomePage = new EtsyHomePage();
        etsyHomePage.searchFor("Wooden spoon");

    }
    @Then("Page title should start with wooden spoon")
    public void page_title_should_start_with_wooden_spoon() {
        Assert.assertTrue(driver.getTitle().startsWith("Wooden spoon"));
    }

    @When("User searches for empty value")
    public void userSearchesForEmptyValue() {
        EtsyHomePage etsyHomePage = new EtsyHomePage();
        etsyHomePage.searchFor("");
    }

    @Then("All categories should be displayed")
    public void allCategoriesShouldBeDisplayed() {
        Assert.assertTrue(driver.getTitle().contains("All categories"));
        EtsyAllCategoriesPage allCategoriesPage = new EtsyAllCategoriesPage();
        Assert.assertTrue(allCategoriesPage.allCategoriesHeader.isDisplayed());
    }
}
