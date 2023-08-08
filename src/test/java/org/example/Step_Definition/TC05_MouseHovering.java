package org.example.Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P05_MouseHovering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Locale;

public class TC05_MouseHovering {
    P05_MouseHovering hovering = new P05_MouseHovering();

    @When("User Hover On Computer Category")
    public void MouseHover(){
        WebElement element = hovering.ComputerCategory();
        Actions actions = new Actions(Hooks.driver);
        actions.moveToElement(element).perform();
    }

    @Then("Verify Computer Category Contains Three SubCategories")
    public void HoveringAssertion(){
        List<WebElement> items = hovering.AssertMouseHover();
        int size = items.size();
            Assert.assertEquals(size,3);

    }

    @And("Click NoteBooks SubCategory")
    public void SubCategorySelection(){
        hovering.Subcategory().click();
    }

    @Then("Verify You Are On NoteBooks Page")
    public void SubCategoryAssertion(){
        String Title = hovering.SubCategoryTitle().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Title.toLowerCase().contains("notebooks"));
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/notebooks");
        soft.assertAll();
    }
}
