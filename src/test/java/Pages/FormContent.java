package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(),this);//todo driverimiz bizim GWD.getDriver
    }

    @FindBy(xpath="(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel ;

    @FindBy(xpath="//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel2;

    public WebElement myElement;
    public void findAndSend(String strElement,String value){

        switch (strElement){
        }
        sendKeysFunction(myElement,value);
    }



}


