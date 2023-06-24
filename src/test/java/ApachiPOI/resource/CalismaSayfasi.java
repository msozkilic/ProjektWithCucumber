package ApachiPOI.resource;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;
import java.util.ArrayList;

public class CalismaSayfasi {
    public static void main(String[] args) throws IOException {


    }

    public static ArrayList<ArrayList<String>> findAndSend(String path, String sayfaNo, int kolonNo) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        FileInputStream fileInputStream = null;
        Workbook workbook;
        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.createSheet(sayfaNo);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> liste = new ArrayList<>();
            for (int j = 0; j < kolonNo; j++) {
                liste.add(sheet.getRow(i).getCell(j).toString());

            }
            tablo.add(liste);

        }


       return tablo;
    }


}



