package org.example.Step_Definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P08_WishList;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TC08_WishList {
    P08_WishList wish = new P08_WishList();

    @When("User Click On Product To Be Added To WishList")
    public void Add_To_WishList(){
        wish.Product_WishList().click();
        Select RamDrpList = new Select(wish.Ram_DropDownList());
        RamDrpList.selectByIndex(1);
        wish.HDD_RadioBox().click();
        wish.Wishlist_Button().click();
    }

    @Then("Verify Success Message Displayed With Green Background Color")
    public void WishList_Assertion(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(wish.Success_Message().isDisplayed());
       String GreenColor_RGB= wish.Success_BG().getCssValue("background-color");
       String HexGreenColor = Color.fromString(GreenColor_RGB).asHex();
       soft.assertEquals(HexGreenColor,"#4bb07a");
       soft.assertAll();
    }


    //Second Scenario

    @When("User Select Product And Add It To Wish List")
    public void item_Selection(){
        wish.Product_WishList().click();
        Select RamDrpList = new Select(wish.Ram_DropDownList());
        RamDrpList.selectByIndex(1);
        wish.HDD_RadioBox().click();
        wish.Wishlist_Button().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wish.WishList_Form().click();
    }
    @Then("Verify Quantity in Wish List Is not Zero")
    public void Quantity_Assertion(){
        String Qty = wish.Item_Quantity().getAttribute("value");
        System.out.println(Qty);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Qty != "0");
        soft.assertEquals(wish.Item_Name().getText(),"Build your own computer");
        soft.assertAll();

    }


}
