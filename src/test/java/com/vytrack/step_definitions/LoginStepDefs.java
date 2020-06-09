package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDefs {

    @Given("the user is in Login page")
    public void the_user_is_on_the_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driven_information() throws InterruptedException {
        String userName= ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        new LoginPage().login(userName,password);
        Thread.sleep(4000);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualTitle);

    }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        String userName= ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        new LoginPage().login(userName,password);
    }

    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        String userName= ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        new LoginPage().login(userName,password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String string, String string2) {

        new LoginPage().login(string,string2);
    }



    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) throws InterruptedException {
        System.out.println("expectedTitle = " + expectedTitle);
        Thread.sleep(3000);
        Assert.assertTrue("Actual Title"+Driver.get().getTitle(),Driver.get().getTitle().contains(expectedTitle));
    }

    @When("the user logs in as a {string}")
    public void the_user_logs_in_a(String userType) {
        Driver.get().get(ConfigurationReader.get("url"));
       // new LoginPage().login(ConfigurationReader.get(username+"_username"),ConfigurationReader.get(username+"_password"));
        String userName=null;
        String password=null;
        if(userType.equalsIgnoreCase("driver")){
            userName=ConfigurationReader.get("driver_username");
            password=ConfigurationReader.get("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            userName=ConfigurationReader.get("sales_manager_username");
            password=ConfigurationReader.get("sales_manager_password");
        }else if (userType.equalsIgnoreCase("store manager")){
            userName=ConfigurationReader.get("store_manager_username");
            password=ConfigurationReader.get("store_manager_password");
        }

        new LoginPage().login(userName,password);
    }


}
