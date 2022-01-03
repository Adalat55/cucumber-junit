package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PercentageHomePage {

    public PercentageHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//form[@id='f1']//nobr/input")
    public WebElement inputBox;

    @FindBy(xpath = "//form[@id='f1']//input")
    public WebElement whatIsBox;

    @FindBy(xpath = "//form[@id='f1']//input[@value='Calculate']")
    public WebElement calcBtn;

    @FindBy(xpath = "//form[@id='f1']//input[@readonly='readonly']")
    public WebElement readBox;


}
