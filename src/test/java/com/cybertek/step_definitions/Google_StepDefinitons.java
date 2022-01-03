package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.pages.GoogleSearchResultPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitons {

    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");
    }
    @When("User searches for apple")
    public void user_searches_for_apple() {

        GoogleSearchPage googleSearchPage= new GoogleSearchPage();
        googleSearchPage.searchBar.sendKeys("apple"+ Keys.ENTER);

    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualTitle= Driver.getDriver().getTitle();
        String expTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expTitle));



    }

    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> items) {
        System.out.println("items = " + items);
        GoogleSearchPage searchPage = new GoogleSearchPage();
        for(String eachItem: items){
        searchPage.searchBar.sendKeys(eachItem+Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(eachItem));
        searchPage.searchBar.clear();
        }
    }

    @When("User searches for {string} capital")
    public void userSearchesForCapital(String countryName) {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        searchPage.searchBar.sendKeys("What is  capital city name of "+countryName+ Keys.ENTER);

    }

    @Then("User should see {string}  in the result")
    public void userShouldSeeInTheResult(String capitalCity) {

        System.out.println("capitalCity = " + capitalCity);
        GoogleSearchResultPage searchResultPage = new GoogleSearchResultPage();

        String capital=searchResultPage.capitalResult.getText();
        System.out.println("capital from page "+ capital);
        Assert.assertTrue(capitalCity.contains(capital));
    }
}
