package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _11_JDBCSteps {
    @Then("Send query the database {string} and control match")
    public void sendQueryTheDatabaseAndControlMatch(String sorgu) {
        //todo Database den gerekli liste alinacak
        List<List<String>> dbList= DBUtility.getListData(sorgu);
        System.out.println(dbList);

        //todo Webden ekrandaki isimleri alacagim
        DialogContent dc=new DialogContent();
        List<WebElement>uiList=dc.waitVisibleListAllElement(dc.nameList);
        for (WebElement e:uiList)
        {
            System.out.println(e.getText());
        }

        //todo karsilastiracagim
        for (int i = 0; i < dbList.size(); i++) {
            Assert.assertEquals("Hatali Durum",dbList.get(i).get(1),uiList.get(i).getText());

        }


    }
}
