package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactStepDefs {



    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(menuOptions,actualOptions);
    }

    @When("the user logs in using following credentals")
    public void the_user_logs_in_using_following_credentals(Map<String,String> userInfo) {
       // System.out.println("userInfo = " + userInfo);
        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));
        String actualUserName = new DashboardPage().getUserName();

        String expectedUserFirstName = userInfo.get("firstName");
        String expectedUserLastName = userInfo.get("lastName");
        String expectedUserName = expectedUserFirstName.concat(" ").concat(expectedUserLastName);
        Assert.assertEquals(expectedUserName,actualUserName);



    }



}
