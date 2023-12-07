package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Parent {

   public WebElement sendKeysFunction(WebElement element, String value){

       waitUntilVisible(element);
       scrollToElement(element);
       element.clear();
       element.sendKeys(value);
       return element;}

    public void clickFunction(WebElement element){
        waitUntilVisible(element);
        scrollToElement(element);
        element.click();}

    public void waitUntilVisible(WebElement element){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    //todo burada yazilan bütün metodlardan sadece 2 tanesi return olan metod.Digerleri hep void.
    //todo cünkü void olan metodlarda sadece o elementin adini yazacagiz ve metodun adini yanina yazinca calisacak
    //todo ama return metodunda ise elementin adini yazacagiz,metodun da adini yazacagiz ve o metodla birlikte
    // todo bir deger gönderecegiz.Yani click metodunda her zaman sadece sadece click yapacak; send metodu ise
    //todo hem send yapacak hem de send icinde bir deger gönderecek.



}
