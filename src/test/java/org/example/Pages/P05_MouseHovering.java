package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_MouseHovering {


    public WebElement ComputerCategory(){
        return Hooks.driver.findElement(By.xpath(" //ul[@class=\"top-menu notmobile\"] //a[@href=\"/computers\"]"));
    }

    public List<WebElement> AssertMouseHover(){
        return Hooks.driver.findElements(By.xpath("//div[@class=\"header-menu\"] //ul[@class=\"top-menu notmobile\"] //li //ul[@class=\"sublist first-level\"]"));

    }

    public WebElement Subcategory(){
        return Hooks.driver.findElement(By.xpath(" //ul[@class=\"top-menu notmobile\"]  //ul[@class=\"sublist first-level\"] //a[@href=\"/notebooks\"]"));
    }

    public WebElement SubCategoryTitle(){
        return Hooks.driver.findElement(By.xpath("//h1[text()=\"Notebooks\"]"));
    }
}
