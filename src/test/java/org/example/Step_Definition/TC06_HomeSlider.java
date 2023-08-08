package org.example.Step_Definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P06_HomeSlider;
import org.testng.Assert;

public class TC06_HomeSlider {

    P06_HomeSlider slider = new P06_HomeSlider();

    //First Scenario
    @When("User Click On First Slider")
    public void first_slider_Click() throws InterruptedException {
        slider.GalaxySlider().click();
        Thread.sleep(3);
    }

    @Then("Verify Url Have Changed")
    public void first_slider_assertion(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/samsung-galaxy-s22");
    }

    //Second Scenario
    @When("User Click On Second Slider")
    public void second_slider_click() throws InterruptedException{
        slider.IphoneSlider().click();
        Thread.sleep(3);
    }

    @Then("Verify Actual Url Matches Expected Url")
    public void second_slider_assertion(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-14-pro");
    }
}
