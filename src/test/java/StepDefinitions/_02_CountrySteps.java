package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_CountrySteps  {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @Then("Navigate to country page")
    public void navigate_to_country_page() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("countries");}

    @When("Create a country")
    public void create_a_country() {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","germany1");
        dc.findAndSend("codeInput","1234569");
        dc.findAndClick("saveButton");}

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.findAndContainsText("successMessage","successMessage");


    }
}
