package ApachiPOI;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path="src/test/java/ApachiPOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sayfa1");

        //todo HAFIZADA OLUSTURMA VE YAZMA ISLEMLERI YAPILIYOR
        Row yeniSatir=sheet.createRow(0);
        Cell yeniHücre=yeniSatir.createCell(0);
        yeniHücre.setCellValue("Merhaba Dünye");

        //todo 10 hücreyi daha dolduruyoruz
        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }
        //todo sira kaydetmeye geldi ,bütün bilgile hafizada buraya kadar.
        inputStream.close();


}
