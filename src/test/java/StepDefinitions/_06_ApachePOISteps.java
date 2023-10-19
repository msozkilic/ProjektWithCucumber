package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOISteps  {
    DialogContent dialogContent=new DialogContent();
    @When("User Create citizenship with ApachiPOI")
    public void userCreateCitizenshipWithApachiPOI() {
        //todo excelden oku ve citizenship i creat et

       ArrayList<ArrayList<String>>tablo=ExcelUtility.getListData("src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx",
                "Sayfa1",2);
        for (ArrayList<String> satir:tablo
             ) {

        }
    }
    @Then("User Delete citizenship with ApachiPOI")
    public void userDeleteCitizenshipWithApachiPOI() {
        //todo kaydettiklerini yine excelden okuyarak sil
        ArrayList<ArrayList<String>>tablo=ExcelUtility.getListData("src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx",
                "Sayfa1",1);
        for (ArrayList<String> satir:tablo
        ) {
          dialogContent.searchAndDelete(satir.get(0));
          dialogContent.findAndContainsText("successMessage","success");
        }
    }
}
