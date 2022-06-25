package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage= new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on Google search page");
    }
    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter2() {
        // Write code here that turns the phrase above into concrete actions
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String keyword) {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle = keyword + "- Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as required", actualTitle,expectedTitle);
    }

    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
        // Write code here that turns the phrase above into concrete actions
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as required", actualTitle,expectedTitle);
    }

}
