package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);//todo driverimiz bizim GWD.getDriver
    }

    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "((//span[contains(text(),'Dashboard')]))[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath= "//ms-text-field[@formcontrolname=\"name\"]//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//name")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname=\"shortName\"]//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'succcessfully'")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog'")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME']/")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deletButton;

    @FindBy(xpath = "//span[contains(text(),'DELETE']")
    private WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[contains(@formcontrolname='budgetAccountIntegrationCode']//input")
    private WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    private WebElement priorityCode;

    @FindBy(xpath = "//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;

    public WebElement myElement;
    public void findAndSend(String strElement,String value){

        switch (strElement){
            case "username" :myElement=username; break;
            case "password" :myElement=password;break;
            case "nameInput" :myElement=nameInput;break;
            case "codeInput" :myElement=codeInput;break;
            case "shortName" :myElement=shortName;break;
            case "searchInput" :myElement=searchInput;break;
            case "integrationCode" :myElement=integrationCode;break;
            case "priorityCode" :myElement=priorityCode;break;
        }
        sendKeysFunction(myElement,value);
    }




}
