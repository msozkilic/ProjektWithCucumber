package ApachiPOI.resource;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Übungg {
    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
        String arananKelime=scanner.nextLine();

        String dönenSonuc=bul(arananKelime);
        System.out.println(dönenSonuc);




    }

   public static String bul(String arananKelime){
        String dönecek="";
       String path = "src/test/java/ApachiPOI/resource/ApacheExcel2.xlsx";

       FileInputStream fileInputStream = null;
       Workbook workbook=null;
       try {
           fileInputStream = new FileInputStream(path);
          workbook = WorkbookFactory.create(fileInputStream);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       Sheet sheet = workbook.getSheet("Sayfa 1");

       for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
           Row row=sheet.getRow(i);

           Cell cell=row.getCell(0);
           if(cell.toString().equalsIgnoreCase(arananKelime))
           for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
               dönecek+=sheet.getRow(j)+ " ";
           }

       }
       return dönecek;
   }


}
