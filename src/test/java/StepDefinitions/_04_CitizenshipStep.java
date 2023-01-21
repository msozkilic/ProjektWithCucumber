package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenshipStep {
    DialogContent dc = new DialogContent();
    @Then("Navigate to Cizienship page")
    public void navigate_to_cizienship_page() {
        LeftNav ln=new LeftNav();
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("citizenShip");
    }
    @Then("Already exist message should be displayed")
    public void already_exist_message_should_be_displayed() {

        dc.findAndContainsText("alreadyExist","already exists");
    }
    @Then("Click on close button")
    public void click_on_close_button() {
        dc.findAndClick("closeDialog");
    }


    @When("User a Citizenship name as<CitizenshipName>short name as <ShortName>")
    public void userACitizenshipNameAsCitizenshipNameShortNameAsShortName(String name,String shortName) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndSend("shortName", shortName);
        dc.findAndClick("saveButton");
    }
}
