package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageSteps {
    Homepage homepage = new Homepage();
    @Given("^user is on iceland homepage$")
    public void user_is_on_iceland_homepage() throws Throwable {
        homepage.homepageAssertion();
    }

    @When("^user types crisp into the search box$")
    public void user_types_crisp_into_the_search_box() throws Throwable{
        homepage.doSearch();
    }

    @When("^user clicks on the searchbutton$")
    public void user_clicks_on_the_searchbutton() throws Throwable {
        homepage.doClick();
    }

    @Then("^user should see all products related to crisps$")
    public void user_should_see_all_products_related_to_crisps() throws Throwable {
        homepage.resultAssertion();
    }
}
