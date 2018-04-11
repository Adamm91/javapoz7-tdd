package com.sda.bank;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BankSteps {

    private Bank bank;
    private BankUser user;
    private boolean userInsertResult;

    @Given("^I instantiate Bank$")
    public void I_instantiate_Bank() {
        this.bank = new Bank();
    }

    @And("^I create user with name '(.*)' and pesel '(.*)'$")
    public void ICreateUserWithNameNameAndPeselPesel(String name, String pesel) {
        this.user = new BankUser(name, pesel);
    }


    @When("^I insert user to the bank$")
    public void iInsertUserToTheBank(){
        userInsertResult = bank.addBankUser(user);
    }

    @Then("^User is present in the bank$")
    public void userIsPresentInTheBank() {
        Assert.assertTrue(userInsertResult);
        Assert.assertEquals(1, bank.numberOfUsers());
    }
}
