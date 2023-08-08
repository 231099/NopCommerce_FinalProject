package org.example.Step_Definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P07_FollowUs;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.ArrayList;

public class TC07_FollowUs {
    P07_FollowUs follow = new P07_FollowUs();

    //First Scenario

    @When("User Opens Facebook Link In Another Tab")
    public void Click_Facebook_Link(){

        follow.FaceBook_Link().click();
    }

    @Then("Verify Facebook Link")
    public void Facebook_Assertion() throws InterruptedException{
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    //Second Scenario
    @When("User Opens Twitter Link In Another Tab")
    public void Click_Twitter_Link(){
        follow.Twitter_Link().click();
    }

    @Then("Verify Twitter Link")
    public void Twitter_Assertion()throws InterruptedException {
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    //Third Scenario
    @When("User Opens RSS Link In Another Tab")
    public void Click_RSS_Link(){
        follow.RSS_Link().sendKeys(Keys.CONTROL,Keys.ENTER);
    }

    @Then("Verify RSS Link")
    public void RSS_Assertion() throws InterruptedException{
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    //Fourth Scenario
    @When("User Opens YouTube Link In Another Tab")
    public void Click_YouTube_Link() {
        follow.Youtube_Link().click();
    }

    @Then("Verify YouTube Link")
    public void YouTube_Assertion()throws InterruptedException{
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
