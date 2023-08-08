package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {
    public WebElement SearchField(){
        return Hooks.driver.findElement(By.className("search-box-text"));
    }

    public WebElement SearchButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public WebElement DisplayPerPage(){
        return Hooks.driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
    }

    public List<WebElement> Products(){
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-box\"]"));
    }

    public WebElement ScienceFaith_Product(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]"));
    }

    public WebElement AppleCamera_Product(){
        return Hooks.driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000040_apple-icam_415.jpeg\"]"));
    }

    public WebElement SoundForge_Product(){
        return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000034_sound-forge-pro-11-recurring_415.jpeg\"]"));
    }

    public WebElement SCI_SerialNumber(){
        return Hooks.driver.findElement(By.id("sku-36"));
    }

    public WebElement APPLECAM_SerialNumber(){
        return Hooks.driver.findElement(By.id("sku-17"));
    }

    public WebElement SOUNDFORGE_SerialNumber(){
        return Hooks.driver.findElement(By.id("sku-12"));
    }
}
