package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {

        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath="(//span[text()='Setup'])[1]\"")
    private WebElement setupOne;

    @FindBy(xpath="span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath="span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()0'Citizenships']")
            private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]']")
    private WebElement entranceExam;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setUpTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamButton;
    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement){
            case "setupOne" :myElement=setupOne; break;
            case "parameters" :myElement=parameters; break;
            case "countries" :myElement=countries; break;
            case "citizenShip" :myElement=citizenShip; break;
            case "nationalities":myElement=nationalities;break;
            case "fees":myElement=fees;break;
            case "entranceExam":myElement=entranceExam;break;
            case "setUpTwo":myElement=setUpTwo;break;
            case "entranceExamButton":myElement=entranceExamButton;break;



        }
        clickFunction(myElement);
    }
}
