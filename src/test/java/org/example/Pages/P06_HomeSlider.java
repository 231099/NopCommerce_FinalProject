package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_HomeSlider {

    public WebElement GalaxySlider(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-control\"]"));
    }

    public WebElement IphoneSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-control active\"]"));
    }
}
