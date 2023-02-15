package ApachiPOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_NewExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet  sheet=workbook.createSheet("Sayfa1");

        //todo HAFIZADA OLUSTURMA VE YAZMA ISLEMLERI YAPILIYOR
        Row yeniSatir=sheet.createRow(0);
        Cell yeniHücre=yeniSatir.createCell(0);
        yeniHücre.setCellValue("Merhaba Dünye");

        //todo 10 hücreyi daha dolduruyoruz
        for (int i = 1; i < 10; i++) {
            yeniSatir.createCell(i).setCellValue(i);
        }
        //todo Yazma islemini YAZMA modunda acip öyle yapacagiz.
        String yeniExcelPath="src/test/java/ApachiPOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(yeniExcelPath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("islem tamamlandi");
    }
    }

