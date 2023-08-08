package org.example.Pages;

import org.example.Step_Definition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_FollowUs {

    public WebElement FaceBook_Link(){
        return Hooks.driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\" and text()=\"Facebook\"]"));
    }

    public WebElement Twitter_Link(){
        return Hooks.driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\" and text()=\"Twitter\"]"));
    }

    public WebElement RSS_Link(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement Youtube_Link(){
        return Hooks.driver.findElement(By.xpath("//a[@rel=\"noopener noreferrer\" and text()=\"YouTube\"]"));
    }

}
