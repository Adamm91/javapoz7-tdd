package com.sda.service.bookstore;

import com.sda.service.bookstore.Book;
import com.sda.service.bookstore.Bookstore;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BookstoreSteps {

    private Bookstore bookstore;
    private Book book;

    @Given("^I instantiate bookstore$")
    public void I_instantiate_bookstore() {
        this.bookstore = new Bookstore();
    }

    @And("^I create book$")
    public void I_create_book() {
        this.book = new Book("Ogniem i mieczem", 800,
                "Henryk Sienkiewicz", "abc123");
    }

    @When("^I add book to bookstore$")
    public void I_add_book_to_bookstore() {
        this.bookstore.add(this.book);
    }

    @Then("^Book is present in bookstore$")
    public void Book_is_present_in_bookstore() {
        Assert.assertEquals(1, this.bookstore.getBooks().size());
    }

    @And("^I can change the title$")
    public void I_can_change_the_title() {
        this.bookstore.updateTitle(this.book, "Kubus Puchatek");
    }

    @Then("^Book title is changed")
    public void Book_title_is_changed() {
        Assert.assertEquals("Kubus Puchatek", this.bookstore.getBooks().get(0).getTitle());
    }

}
