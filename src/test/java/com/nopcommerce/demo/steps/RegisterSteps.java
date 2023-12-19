package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I verify register text")
    public void iVerifyRegisterText(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getWelcomeText(), expectedMessage);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("Verify the error message {string}")
    public void verifyTheErrorMessage(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequiredMessage(), expectedMessage);
    }

    @And("I enter firstname")
    public void iEnterFirstname(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getFirstNameRequiredMessage(), expectedMessage);
    }

    @And("I enter lastname")
    public void iEnterLastname(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getLastNameRequiredMessage(), expectedMessage);
    }

    @And("I select day")
    public void iSelectDay(String Day) {
        new RegisterPage().selectDate(Day);
    }

    @And("I select month")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I select year")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().sendDataToConfirmPasswordField(confirmPassword);
    }

    @Then("Verify message Your registration completed")
    public void verifyMessageYourRegistrationCompleted(String expectedMessage) {
        Assert.assertEquals(new RegisterPage().getDataFromConfirmationMessage(), expectedMessage);
    }

    @Then("Verify message \"Your registration completed")
    public void verifyMessageYourRegistrationCompleted() throws Throwable {    // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }
}

