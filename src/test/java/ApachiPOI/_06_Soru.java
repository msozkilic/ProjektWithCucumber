package ApachiPOI;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class _06_Soru {
    /*
    todo Bir önceki yapilan soruda ,kullaniciya 1.sutundaki tüm deger bir liste halinde sunalim
    todo kullanici hangi numarayi girerse  o satirin yanindaki tüm bilgiler gösterilsin.
    Username icin 1
    Password icin 2 giriniz 2
     */
    public static void main(String[] args) {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Sayfa2");

        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);



        carpimTablosu();

        }

    public static void carpimTablosu() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                int carpim = i * j;
                System.out.println(i + "*" + j + "=" + carpim + " ");

            }
            System.out.println();


        }

    }
}

