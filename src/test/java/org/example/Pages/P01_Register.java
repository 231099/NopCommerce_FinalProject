package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {

    // Locators
    public WebElement RegistrationForm()
    {

        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement GenderMale(){
        return Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][value=\"M\"]"));
    }

    public WebElement FirstName(){
        return Hooks.driver.findElement(By.cssSelector("input[type=\"text\"][data-val-required=\"First name is required.\"]"));
    }

    public WebElement LastName(){
        return Hooks.driver.findElement(By.cssSelector("input[type=\"text\"][data-val-required=\"Last name is required.\"]"));
    }

    public WebElement Day(){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement Month(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement Year(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement Email_Field(){
        return Hooks.driver.findElement(By.cssSelector("input[type=\"email\"][data-val-email=\"Wrong email\"]"));
    }

    public WebElement Password_Field(){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Password is required.\"][type=\"password\"][id=\"Password\"]"));
    }

    public WebElement ConfirmPassword_Field(){
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Password is required.\"][type=\"password\"][id=\"ConfirmPassword\"]"));
    }

    public WebElement RegisterButton(){
        return Hooks.driver.findElement(By.id("register-button"));
    }

    //Assertion Locators

    public WebElement ContinueButton(){
        return Hooks.driver.findElement(By.className("register-continue-button"));
    }


    public WebElement ErrorMessage(){
        return Hooks.driver.findElement(By.xpath("//span[@id=\"ConfirmPassword-error\"]"));
    }


}
