package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LyftFareEstimationPage {

    public LyftFareEstimationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "fare-start")
    public WebElement pickupLocation;

    @FindBy(name = "fare-end")
    public WebElement dropoffLocation;


    @FindBy(xpath = "//button[.='Get estimate']")
    public WebElement getEstimateBtn;

    @FindBy(xpath = "//h3")
    public WebElement rideTypes;

    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement lyftFare;

    @FindBy(xpath = "//small[.='Please select a valid location.']")
    public WebElement errorMessage;

    public void enterPickUpLocation(String pickUpLocation){
        pickupLocation.sendKeys(pickUpLocation);
    }
}
