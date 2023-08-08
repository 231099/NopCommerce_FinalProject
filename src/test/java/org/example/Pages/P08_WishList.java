package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_WishList {
    public WebElement Product_WishList(){
        return Hooks.driver.findElement(By.xpath("//div[@class=\"buttons\"] //button[@class=\"button-2 add-to-wishlist-button\" and text()=\"Add to wishlist\"]"));
    }

    public WebElement Wishlist_Button(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-1"));
    }

    public WebElement Ram_DropDownList(){
        return Hooks.driver.findElement(By.cssSelector("select[id=\"product_attribute_2\"]"));
    }

    public WebElement HDD_RadioBox(){
        return Hooks.driver.findElement(By.xpath("//input[@id=\"product_attribute_3_6\"]"));
    }

    public WebElement Success_Message(){
        return Hooks.driver.findElement(By.xpath("//p[text()=\"The product has been added to your \"]"));
    }

    public WebElement Success_BG(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement Item_Quantity(){
        return Hooks.driver.findElement(By.cssSelector("td[class=\"quantity\"] input[type=\"text\"]"));
    }

    public WebElement WishList_Form(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }

    public WebElement Item_Name(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"product-name\"]"));
    }
}

