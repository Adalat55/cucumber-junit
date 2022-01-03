package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTablesHomePage {

    public DataTablesHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='New']")
    public WebElement newBtn;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createBtn;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBar;

    @FindBy(xpath = "//td[@class='sorting_1']")
    public  WebElement searchResult;

}
