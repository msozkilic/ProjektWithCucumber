package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_ApachiPOIGetAllData {
public static void main(String[]args)throws IOException{
        String path="src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sayfa1");

        int satirSayisi=sheet.getPhysicalNumberOfRows();

        for (int i = 0; i <satirSayisi ; i++) {

        Row satir=sheet.getRow(i);
        int hücreSayisi=satir.getPhysicalNumberOfCells();
        for (int j = 0; j <hücreSayisi ; j++) {
              Cell hücre=satir.getCell(j);
                System.out.print(hücre+" ");
            
        }
                System.out.println();

        
    }
        }
    
}
