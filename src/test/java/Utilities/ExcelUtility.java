package Utilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/*todo Kendisine verilen path deki excelin,
   istenilen,sheetindeki verilen kolan kadar bilgisini okuyup Arraylist formatinda geri döndüren fonksiyonu yaziniz
    */
public class ExcelUtility {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> tablo=getListData("src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx",
                "Sayfa1",2);
        System.out.println("tablo ="+ tablo);
    }
  public static ArrayList<ArrayList<String>> getListData(String path,String sheetName,int columnCount){
        ArrayList<ArrayList<String>>tablo=new ArrayList<>();

        Workbook workbook=null;

      try {
          FileInputStream inputStream=new FileInputStream(path);
          workbook=WorkbookFactory.create(inputStream);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
      Sheet sayfa= workbook.getSheet(sheetName);
      for (int i = 0; i < sayfa.getPhysicalNumberOfRows(); i++) {

          ArrayList<String> satirData=new ArrayList<>();
          for (int j = 0; j < columnCount; j++) {
              satirData.add(sayfa.getRow(i).getCell(j).toString());

          }
          tablo.add(satirData);
      }
      return tablo;
  }

}





