package ApachiPOI.resource;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Übungg {
    public static void main (String[]args) throws IOException {

        String path="src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheet("Sayfa 1");

        Row row=sheet.getRow(0);
        Cell cell=row.getCell(0);

        System.out.println("cell ="+cell);



    }




}
