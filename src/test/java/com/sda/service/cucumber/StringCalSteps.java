package com.sda.service.cucumber;

import com.sda.service.StringCal;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StringCalSteps {

    private String value;

    private int result;

    private StringCal calculator;

    @Given("^I initialize stringCal$")
    public void i_initialize_stringCal() {
        this.calculator = new StringCal();
    }

    @Given("^I pass single number value$")
    public void I_pass_single_number_value() {
        this.value = "5";
    }

    @When("^I trigger calculate function$")
    public void I_trigger_calculate_function() {
        this.result = calculator.calculate(value);
    }

    @Then("^I get 5 as a result$")
    public void I_get_5_as_a_result() {
        Assert.assertEquals(5, result);
    }

    @And("^I pass null value$")
    public void I_pass_null_value() {
        this.value = null;
    }

    @Then("^I get 0 as a result$")
    public void I_get_as_a_result(){
        Assert.assertEquals(0, result);
    }

    @And("^I pass blank value$")
    public void I_pass_blank_value() {
        this.value = "";
    }

    @And("^I pass two numbers$")
    public void I_pass_two_numbers() {
        this.value = "3;2";
    }

    @And("^I pass few numbers$")
    public void I_pass_few_numbers() {
        this.value = "13;6;2";
    }

    @And("^I pass few numbers with whitespaces$")
    public void I_pass_few_numbers_with_whitespaces() {
        this.value = "1;   2;  2";
    }

    @Then("^I get 21 as a result$")
    public void I_get_21_as_a_result() {
        this.result = 21;
    }
}
