package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps extends Parent {

    DialogContent dc=new DialogContent();

    @Given("Navigate to basqar")
    public void navigateToBasqar(){
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }
    @When("Enter username and password and click login button")
    public void enterUsernaeAndPasswordAndClickLogininButton(){

        dc.findAndSend("username","turkeyts");
        dc.findAndSend("password","TechnoStudy123");
        dc.findAndClick("loginButton");
    }
    @Then("User should login succesfully")
    public void userShouldLoginSuccessfuly(){


        dc.findAndContainsText("dashboard","Dashboard");

    }
}

