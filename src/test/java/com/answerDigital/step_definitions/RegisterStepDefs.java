package com.answerDigital.step_definitions;

import com.answerDigital.pages.RegisterPage;
import com.answerDigital.utilities.BrowserUtils;
import com.answerDigital.utilities.ConfigurationReader;
import com.answerDigital.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class RegisterStepDefs {

    @Given("the user is in the main page")
    public void the_user_is_in_the_main_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user navigates to {string} -- {string}")
    public void the_user_navigates_to(String main, String sub) {
        new RegisterPage().navigatesTo(main,sub);
    }


    @When("the user fill the form with below data")
    public void the_user_fill_the_form_with_below_data(Map<String,String> data) {
        new RegisterPage().sendKeys("First Name", data.get("First Name"));
        new RegisterPage().sendKeys("Last Name", data.get("Last Name"));
        new RegisterPage().sendKeys("name@example.com",data.get("Email"));
        BrowserUtils.waitFor(3);

    }

    @When("the user enter {string} , {string} and {string}")
    public void theUserEnterAnd(String firstName, String lastName, String email) {
        new RegisterPage().sendKeys("First Name", firstName);
        new RegisterPage().sendKeys("Last Name", lastName);
        new RegisterPage().sendKeys("name@example.com",email);

    }

    @When("the user fill {string} as {string}")
    public void theUserFillAs(String identifier, String value) {

        new RegisterPage().sendKeys(identifier,value);


    }


    @When("the user click on {string}")
    public void theUserClickOn(String identifier) {
        new RegisterPage().clickAnyWebElement("Male");
    }

    @When("the user select {string} as {string}")
    public void theUserSelectAs(String identifier, String value) {
        new RegisterPage().clickAnyWebElement(value);
        BrowserUtils.waitFor(2);

    }

    @When("the user clicks on {string} button")
    public void theUserClicksOnButton(String buttonName) {
        new RegisterPage().clickButton(buttonName);
    }


    @When("the user fills in all fields with random valid data")
    public void the_user_fills_in_all_fields_with_random_valid_data() {

    }

    @When("the user selects below subjects")
    public void the_user_selects_below_subjects(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("the user select {string} radio button as {string}")
    public void the_user_select_radio_button_as(String string, String string2) {

    }

    @When("the user {string} dropdown as {string}")
    public void the_user_dropdown_as(String string, String string2) {

    }

    @When("the student clicks on {string} button")
    public void the_student_clicks_on_button(String string) {

    }

    @And("the user verifies {string}")
    public void the_user_verifies(String string) {

    }



}
