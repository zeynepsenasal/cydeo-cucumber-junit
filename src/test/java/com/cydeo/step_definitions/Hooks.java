package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before (order = 1) //from cucumber! not JUnit
    public void setupScenario(){
        System.out.println("======Setting up browser using cucumber @Before");


    }

    @Before (value = "@login", order = 2)
    public void setupScenarioForLogins(){
        System.out.println("======Setting up browser using cucumber @Before for scenarios with @login tag");


    }
    @Before (value = "@db", order = 0)
    public void setupScenarioForDataBase(){
        System.out.println("======Setting up browser using cucumber @Before for scenarios with @db tag");


    }

    @After
    public void teardownScenario(Scenario scenario){
        //TAKING SCREENSHOT

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        
        Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----------> applying setup using @BeforeStep");

    }

    @AfterStep
    public void teardownStep(){
        System.out.println("----------> applying teardown using @AfterStep");
    }

}
