package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    public static WebDriverWait wait;
    DialogContent dc=new DialogContent();


    @Given("Navigate to basqar")
    public void navigateToBasqar(){
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }@When("Enter username and password and click login button")
    public void enterUsernaeAndPasswordAndClickLogininButton(){

     wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
     wait.until(ExpectedConditions.visibilityOf(dc.username)).sendKeys("turkeyts");
     wait.until(ExpectedConditions.visibilityOf(dc.password)).sendKeys("TechnoStudy123");
     wait.until(ExpectedConditions.elementToBeClickable(dc.loginButton)).click();
       
    }
    @Then("User should login succesfully")
    public void userShouldLoginSuccessfuly(){
        Assert.assertTrue(dc.dashboard.getText().contains("Dashboard"));



    }
}
