package org.example.Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC01_Register {

    P01_Register register = new P01_Register();

    //First Scenario

    @Given("user navigate to register page")
    public void goRegisterPage()
    {
  register.RegistrationForm().click();
    }

    @When("User Enter Valid Data")
    public void ValidRegistration(){
        register.GenderMale().click();
        register.FirstName().sendKeys("Youssef");
        register.LastName().sendKeys("Benyameen");
        Select DayDropDownList = new Select(register.Day());
        DayDropDownList.selectByIndex(23);
        Select MonthDropDownList = new Select(register.Month());
        MonthDropDownList.selectByVisibleText("October");
        Select YearDropDownList = new Select(register.Year());
        YearDropDownList.selectByValue("1999");
        register.Email_Field().sendKeys("youssefbeny@gmail.com");
        register.Password_Field().sendKeys("Beny/000");
        register.ConfirmPassword_Field().sendKeys("Beny/000");
    }

    @And("Press Register Button")
    public void RegisterationButton(){
        register.RegisterButton().click();
    }

    @Then("Verify Successful Registration")
    public void ValidAssertion(){
        Assert.assertTrue(register.ContinueButton().isDisplayed());
        register.ContinueButton().click();
    }

    //Second Scenario
    @When("User Enter Invalid Data")
    public void InvalidRegistration(){
        register.GenderMale().click();
        register.FirstName().sendKeys("Youssef");
        register.LastName().sendKeys("Benyameen");
        Select DayDropDownList = new Select(register.Day());
        DayDropDownList.selectByIndex(23);
        Select MonthDropDownList = new Select(register.Month());
        MonthDropDownList.selectByVisibleText("October");
        Select YearDropDownList = new Select(register.Year());
        YearDropDownList.selectByValue("1999");
        register.Email_Field().sendKeys("youssefbseny@gmail.com");
        register.Password_Field().sendKeys("Beny/022");
        register.ConfirmPassword_Field().sendKeys("Beny/000");
    }

    @Then("Verify UnsSuccessful Registration")
    public void InvalidAssertion(){
        String PasswordErrorMessage = register.ErrorMessage().getText();
        Assert.assertTrue(PasswordErrorMessage.contains("The password and confirmation password do not match."));
    }

}
