package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Currencies {

    public WebElement CurrencyList(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> Products(){
        return Hooks.driver.findElements(By.cssSelector("div[class=\"product-grid home-page-product-grid\"] div[class=\"item-grid\"] div[class=\"item-box\"]"));
    }
}
