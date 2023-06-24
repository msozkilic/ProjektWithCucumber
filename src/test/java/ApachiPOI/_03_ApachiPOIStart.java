package ApachiPOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachiPOIStart {
public static void main(String[]args) throws IOException {
        String path="src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx";

        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        Sheet calismaSayfasi=calismaKitabi.getSheet("Sayfa1");

        Row satir=calismaSayfasi.getRow(0);

        Cell hücre= satir.getCell(0);

        System.out.println("hücre ="+ hücre);

        }
}
