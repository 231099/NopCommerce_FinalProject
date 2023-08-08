package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public WebElement LoginForm(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement Email_Field(){
        return Hooks.driver.findElement(By.xpath("//input[@id=\"Email\"]"));
    }

    public WebElement Password_Field(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }

    public WebElement Login_Button(){
        return Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\" and text()=\"Log in\"]"));
    }

    public WebElement Logout_Button(){
        return Hooks.driver.findElement(By.className("ico-logout"));
    }

    public WebElement EmailErrorMessage(){
        return Hooks.driver.findElement(By.xpath("//span[@id=\"Email-error\"]"));
    }
}
