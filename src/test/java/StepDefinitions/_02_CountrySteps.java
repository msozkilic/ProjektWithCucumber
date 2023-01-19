package StepDefinitions;

import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;

public class _02_CountrySteps {

    LeftNav ln=new LeftNav();

    @And("Navigate to country page")
    public void navigate_to_country_page() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("Countries");
    }
    @When("Create a country")
    public void create_a_country() {

    }
    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

    }

}
