package com.cybertek.step_definitions;

import com.cybertek.pages.LyftFareEstimationPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LyftFareEstimateStepDefs extends LyftFareEstimationPage {

    WebDriver driver;
    LyftFareEstimationPage fareEstimationPage = new LyftFareEstimationPage();


    @Given("User is on lyft fare estimate page")
    public void user_is_on_lyft_fare_estimate_page() {

       driver= Driver.getDriver();
       driver.get(ConfigurationReader.getProperty("lyft.fare.estimate.url"));
       String expTitle = "Get Fare Estimates for Your City - Lyft Price Estimate | Lyft";
       String actTitle = driver.getTitle();
       Assert.assertEquals(expTitle, actTitle);
       BrowserUtils.scrollDown(1000);


    }
    @When("User enters {string} to pickup adress")
    public void user_enters_to_pickup_adress(String string) {

        fareEstimationPage.pickupLocation.sendKeys(string);
        BrowserUtils.sleep(1);


    }
    @And("User enters {string} to drop-off adress")
    public void user_enters_to_dropoff_adress(String string) {

        fareEstimationPage.dropoffLocation.sendKeys(string);
        BrowserUtils.sleep(1);



    }
    @And("User clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {

        fareEstimationPage.getEstimateBtn.click();
        BrowserUtils.sleep(1);
        fareEstimationPage.getEstimateBtn.click();
       // ((JavascriptExecutor)driver).executeScript("arguments[0].click()", fareEstimationPage.getEstimateBtn);

//        fareEstimationPage.getEstimateBtn.click();
//        BrowserUtils.sleep(2);
//        fareEstimationPage.getEstimateBtn.click();





    }
    @Then("User should see estimated prices")
    public void user_should_see_estimated_prices() {


      //  WebDriverWait wait = new WebDriverWait(driver, 20);
       // wait.until(ExpectedConditions.visibilityOf(fareEstimationPage.lyftFare));
        BrowserUtils.sleep(3);
        System.out.println(fareEstimationPage.lyftFare.getText());
        Assert.assertTrue(fareEstimationPage.rideTypes.isDisplayed());




    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {

      Assert.assertTrue(fareEstimationPage.errorMessage.isDisplayed());
        System.out.println(fareEstimationPage.errorMessage.getText());
    }
}
