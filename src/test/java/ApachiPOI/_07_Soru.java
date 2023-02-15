package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_Soru {
     /*
    todo Bir öceki soruda kullanicidan bu sefer sütun numarasi isteyiniz ve o sütündaki bütün bilgileri isteyiniz.
     */
     public static void main(String[] args) throws IOException {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Bir sayi giriniz");
         int sütun=scanner.nextInt();

         String dönenSonuc = bul(sütun);
         System.out.println("dönenSonuc = "+ dönenSonuc);
     }
     public static String bul(int sütun) {
        String dönecek = "";

        String path = "src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if(sheet.getRow(i).getPhysicalNumberOfCells()> sütun)
            dönecek+=sheet.getRow(i).getCell(sütun)+"\n";
        }
        return dönecek;
    }
}
