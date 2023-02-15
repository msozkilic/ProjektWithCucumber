package ApachiPOI;

import org.apache.poi.ss.usermodel.*;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetASpecificData {
    //verilen exceldeki password bilgisini bir metod araciligi bularak yazdiriniz
    //yani metoda password kelimesi gönderilecek,donen deger password un kendisi olacak
    //yani kullanicidan bir kelime alinacak o kelimenin oldugu satir alinaacak
    //src/test/java/ApachePOI/resources/LoginData.xlsx
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sözcük giriniz");
        String arananKelime = scanner.nextLine();

        String dönenSonuc = bul(arananKelime);
        System.out.println("dönenSonuc = "+ dönenSonuc);
    }

    public static String bul(String arananKelime) {
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
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);

            if (cell.toString().equalsIgnoreCase(arananKelime))
                for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++)
                    dönecek += row.getCell(j) + " ";
                }

        return dönecek;
    }
}

