package ApachiPOI.resource;



import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Übungg {
    public static void main(String[] args) throws IOException {

    }

    public static ArrayList<ArrayList<String>> findAndSend(String path, int sheet, int column) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();

        FileInputStream inputStream = null;
        Workbook workbook = null;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet1 = workbook.getSheetAt(sheet);


        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> datalar = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                datalar.add(sheet1.getRow(i).getCell(j).toString());


                tablo.add(datalar);

            }
            return tablo;

        }

        return tablo;
    }
}











 






