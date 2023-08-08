package org.example.Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_Search;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class TC04_Search {
    P04_Search search = new P04_Search();

    //First Scenario


    @When("User Search With Book")
    public void user_search_using_book() {
        search.SearchField().sendKeys("Book");
    }

    @When("User Search With Laptop")
    public void user_search_using_laptop() {
        search.SearchField().sendKeys("Laptop");
    }

    @When("User Search With Nike")
    public void user_search_using_nike() {
        search.SearchField().sendKeys("Nike");
    }

    @And("Click Search Button")
    public void ProductSearchButton() {
        search.SearchButton().click();
    }

    @And("Choose Display Per Page 9")
    public void DisplayDropList() throws InterruptedException {
        Select DisplayProductDrpDownList = new Select(search.DisplayPerPage());
        DisplayProductDrpDownList.selectByValue("9");
        Thread.sleep(4);
    }

    @Then("Verify Search Result Matches Book The User Entered")
    public void BookAssertion(){
        List<WebElement> Books = search.Products();
        WebElement q;
        for (WebElement book : Books) {

            q = book;
            System.out.println(q.getText().toLowerCase());
            Assert.assertTrue(q.getText().contains("Book"));
        }

    }

    @Then("Verify Search Result Matches Laptop The User Entered")
    public void LaptopAssertion(){
        List<WebElement> Laptops = search.Products();
        WebElement q;
        for (WebElement laptop : Laptops) {

            q = laptop;
            System.out.println(q.getText().toLowerCase());
            Assert.assertTrue(q.getText().contains("Laptop"));
        }

    }

    @Then("Verify Search Result Matches Nike The User Entered")
    public void NikeAssertion(){
        List<WebElement> Nike = search.Products();
        WebElement q;
        for (WebElement nike : Nike) {

            q = nike;
            System.out.println(q.getText().toLowerCase());
            Assert.assertTrue(q.getText().contains("Nike"));
        }
    }

    //Second Scenario

    //SCIENCE & FAITH

    @When("User Search Using SCI_FAITH")
    public void search_using_SCI_FAITH(){
        search.SearchField().sendKeys("SCI_FAITH");
    }

    @And("Choose Product Based On SCI_FAITH")
    public void select_using_SCI_FAITH(){
        search.ScienceFaith_Product().click();
    }

    @Then("Verify Search Result Matches SCI_FAITH The User Entered")
    public void SCI_FAITH_ASSERTION(){
        String sci_SerialNumber = search.SCI_SerialNumber().getText();
        Assert.assertEquals(sci_SerialNumber,"SCI_FAITH");
    }


    //APPLE_CAM

    @When("User Search Using APPLE_CAM")
    public void search_using_APPLE_CAM(){
        search.SearchField().sendKeys("APPLE_CAM");
    }

    @And("Choose Product Based On APPLE_CAM")
    public void select_using_APPLE_CAM(){
        search.AppleCamera_Product().click();
    }

    @Then("Verify Search Result Matches APPLE_CAM The User Entered")
    public void APPLE_CAM_ASSERTION(){
        String apple_cam_SerialNumber = search.APPLECAM_SerialNumber().getText();
        Assert.assertEquals(apple_cam_SerialNumber,"APPLE_CAM");
    }

    //SF_PRO_11
    @When("User Search Using SF_PRO_11")
    public void search_using_SF_PRO_11(){
        search.SearchField().sendKeys("SF_PRO_11");
    }

    @And("Choose Product Based On SF_PRO_11")
    public void select_using_SF_PRO_11(){
        search.SoundForge_Product().click();
    }

    @Then("Verify Search Result Matches SF_PRO_11 The User Entered")
    public void SF_PRO_11_ASSERTION(){
        String SF_PRO_serialnumber = search.SOUNDFORGE_SerialNumber().getText();
        Assert.assertEquals(SF_PRO_serialnumber,"SF_PRO_11");
    }






}