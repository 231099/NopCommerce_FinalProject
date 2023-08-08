package org.example.Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class TC02_Login {
    P02_Login login = new P02_Login();

    //First Login

    @Given("User Navigate To Login Form")
    public void Login_Form(){
        login.LoginForm().click();
    }

    @When("User Enter Valid Email & Password")
    public void ValidLogin(){
        login.Email_Field().sendKeys("youssefbeny@gmail.com");
        login.Password_Field().sendKeys("Beny/000");
    }

    @And("Press Login Button")
    public void loginbutton(){
        login.Login_Button().click();
    }

    @Then("Verify Successful Login")
    public void ValidAssertion(){
        Assert.assertTrue(login.Logout_Button().isDisplayed());
    }

    //Second Scenario
    @When("User Enter Invalid Email & Password")
    public void InvalidLogin(){
        login.Email_Field().sendKeys("");
        login.Email_Field().sendKeys(Keys.ENTER);
        login.Password_Field().sendKeys("Beny/787");
    }

    @Then("Verify UnsSuccessful Login")
    public void InvalidAssertion(){
        String ErrorMessage = login.EmailErrorMessage().getText();
        Assert.assertEquals(ErrorMessage,"Please enter your email");
    }
}
