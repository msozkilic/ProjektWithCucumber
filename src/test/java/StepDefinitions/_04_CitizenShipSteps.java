package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_CitizenShipSteps {
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();


    @And("^Click on close button$")
    public void clickOnCloseButton() {

        dialogContent.findAndClick("closeDialog");
    }


    @And("Navigate to Cizienship page")
    public void navigateToCizienshipPage() {
        leftNav.findAndClick("setupOne");
        leftNav.findAndClick("parameters");
        leftNav.findAndClick("citizenships");
    }
    @When("User a Citizenship name as<CitizenshipName>short name as <ShortName>")
    public void userCreateACitizenshipNameAsShortNameAs(String name, String shortname) {

        dialogContent.findAndClick("addButton");
        dialogContent.findAndSend("nameInput", name);
        dialogContent.findAndSend("shortName", shortname);
        dialogContent.findAndClick("saveButton");



    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dialogContent.findAndContainsText("ErrorMessage", "Error");

    }
    @When("User delete the <CitizenshipName>")
    public void userDeleteTheCitizenshipName(String arananKelime) {
        dialogContent.searchAndDelete(arananKelime);

    }
}
