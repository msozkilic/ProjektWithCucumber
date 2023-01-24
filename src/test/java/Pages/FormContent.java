package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(),this);//todo driverimiz bizim GWD.getDriver
    }

    @FindBy(xpath="(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),'2021-2022')]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "//span[text(),'Grade Level')])[3]")
    private WebElement gradeLevel ;

    @FindBy(xpath="//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;



    public WebElement myElement;
    public void findAndSend(String strElement,String value){

        switch (strElement){
        }
        sendKeysFunction(myElement,value);
    }
    public void findAndClick(String strElement){

        switch (strElement){

            case "academicPeriod" :myElement=academicPeriod; break;
            case "academicPeriod1" :myElement=academicPeriod1; break;
            case "gradeLevel" :myElement=gradeLevel; break;
            case "gradeLevel2" :myElement=gradeLevel2; break;

        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement,String text){

        switch (strElement){
           // case "dashboard" :myElement=dashboard; break;


        }
        verifyContainsText(myElement,text);
    }
    public void searchAndDelete(String searchtText){
        //todo arama kutucuguna kelimeyi yaz,arama butonuna bas,silme butonuna bas,diaologdaki silme but bas.,,
        findAndSend(searchtText,"searchText");
        findAndClick("searchButton");

        GWD.Bekle(2);
        findAndClick("deleteButton");
        findAndClick("deleteDialogBtn");
    }


}


