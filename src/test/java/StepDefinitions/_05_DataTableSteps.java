package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;

import java.util.List;

public class _05_DataTableSteps {


    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    FormContent fc=new FormContent();
    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));

        }

    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));

        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
            //todo listin ilk elemanina(webelement adi,ikincielemani yani degeri gönder)
        }

    }

    @And("User delete item from Dilaog")
    public void userDeleteItemFromDilaog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.searchAndDelete(listElement.get(i));
        }}

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {

    }


}
