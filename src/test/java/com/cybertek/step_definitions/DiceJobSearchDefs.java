package com.cybertek.step_definitions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DiceJobSearchDefs  {


    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));

    }

    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        WebElement keyWord = Driver.getDriver().findElement(By.id("typeaheadInput"));
        WebElement zipCode= Driver.getDriver().findElement(By.id("google-location-search"));
        keyWord.sendKeys("Java");
        zipCode.sendKeys("91364"+ Keys.ENTER);

    }

    @Then("User should see search results")
    public void user_should_see_search_results() {


        WebElement jobCount = Driver.getDriver().findElement(By.id("totalJobCount"));
        System.out.println("Job count: "+jobCount.getText());
    }
}
