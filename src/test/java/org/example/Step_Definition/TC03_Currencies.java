package org.example.Step_Definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Currencies;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class TC03_Currencies {

    P03_Currencies currency = new P03_Currencies();

    @When("Choose Euro From DropDown List")
    public void CurrencySelect(){
        Select CurrencyDropDownList = new Select(currency.CurrencyList());
        CurrencyDropDownList.selectByVisibleText("Euro");
    }

    @Then("Verify Each Product Has Euro Symbol")
    public void CurrencyAssertion(){
        List<WebElement> items = currency.Products();
        WebElement q;
        for(int i =0; i<items.size(); i++){
            q = items.get(i);
            System.out.println(q.getText().toLowerCase());
            Assert.assertTrue(q.getText().contains("€"));
        }
    }
}
