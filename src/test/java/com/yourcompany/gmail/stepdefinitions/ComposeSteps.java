package com.yourcompany.gmail.stepdefinitions;

import com.yourcompany.gmail.pages.ComposePage;
import com.yourcompany.gmail.pages.GmailHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComposeSteps {
    private GmailHomePage gmailHomePage;
    private ComposePage composePage;

    @Given("^I am on Gmail home page$")
    public void iAmOnGmailHomePage() {
        gmailHomePage = new GmailHomePage();
        gmailHomePage.open();
    }

    @When("^I click on the Compose button$")
    public void iClickOnTheComposeButton() {
        composePage = gmailHomePage.clickComposeButton();
    }

    @Then("^the compose window should open$")
    public void theComposeWindowShouldOpen() {
        Assert.assertTrue(composePage.isComposeWindowDisplayed());
    }

    @Then("^the email address field should be empty$")
    public void theEmailAddressFieldShouldBeEmpty() {
        Assert.assertTrue(composePage.isEmailAddressFieldEmpty());
    }

    @Then("^the subject field should be empty$")
    public void theSubjectFieldShouldBeEmpty() {
        Assert.assertTrue(composePage.isSubjectFieldEmpty());
    }

    @Then("^the body field should be empty$")
    public void theBodyFieldShouldBeEmpty() {
        Assert.assertTrue(composePage.isBodyFieldEmpty());
    }
}