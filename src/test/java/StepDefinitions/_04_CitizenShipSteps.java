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


}
