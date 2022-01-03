package com.cybertek.step_definitions;

import com.cybertek.pages.PercentageHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class PercentageCalculatorStepDefs {

    @Given("User is on the percentage calculating page")
    public void user_is_on_the_percentage_calculating_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
      
    }
    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer, Integer> valuesMap) {

        for(Integer inputValue: valuesMap.keySet()){

            PercentageHomePage homePage = new PercentageHomePage();
            homePage.inputBox.sendKeys(inputValue+"");
            homePage.whatIsBox.sendKeys("5");
            homePage.calcBtn.click();
            String result = homePage.readBox.getAttribute("value");
            Assert.assertEquals(result, valuesMap.get(inputValue)+"");
            System.out.println(result);
            homePage.inputBox.clear();

        }
    }

}
