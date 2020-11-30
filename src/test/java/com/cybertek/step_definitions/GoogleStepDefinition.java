package com.cybertek.step_definitions;

import com.cybertek.utilities2.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GoogleStepDefinition {

    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https:/www.google.com");
    }




    @Then("User should be able to see the title is Google")
    public void user_should_be_able_to_see_the_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
       String actualTitle = Driver.getDriver().getTitle();
       String expectedTitle = "Google";

        Assert.assertTrue("Actual title does not match with ecpected title, TEST FAILED", actualTitle.equals(expectedTitle));

    }



}
