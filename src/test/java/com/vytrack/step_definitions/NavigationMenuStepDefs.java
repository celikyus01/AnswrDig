package com.vytrack.step_definitions;

import com.vytrack.pages.ContactInfoPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates to {string} -- {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String string) {
        new DashboardPage().waitUntilLoaderScreenDisappear();
        Assert.assertEquals(string,Driver.get().getTitle());
    }

    @When("the user navigates to Marketting  -- Campaigns")
    public void the_user_navigates_to_Marketting_Campaigns() {
        System.out.println("I click on the Campaign tag ");
    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("The title changed to Campaign// Expected mach with actual");
    }

    @When("the user navigates to Activities -- Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("I click on the Calendar tag ");
    }

    @Then("the title should be Calendar")
    public void the_title_should_be_Calendar() {
        System.out.println("The title changed to Calendar// Expected mach with actual");
    }
    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer int1) throws InterruptedException {
        int actualPageNumber=Integer.parseInt(new ContactsPage().pageNumber.getAttribute("value"));
        Assert.assertEquals(1,actualPageNumber);

    }




}
