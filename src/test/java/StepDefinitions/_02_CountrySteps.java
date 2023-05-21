package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Then("Navigate to country page")
    public void navigate_to_country_page() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("countries");
    }



}
