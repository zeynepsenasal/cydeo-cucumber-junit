package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

   @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;



    public void login(){
        inputUsername.sendKeys("Test");
        inputPassword.sendKeys("Tester");
        loginButton.click();
    }

   public void login(String username, String password){
       inputUsername.sendKeys(username);
       inputPassword.sendKeys(password);
       loginButton.click();
   }

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("webTable.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("webTable.password"));
        loginButton.click();
    }

}
