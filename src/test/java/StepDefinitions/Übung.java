package StepDefinitions;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Übung {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<String>>getData(String path,String sheet,int colounCount){
        ArrayList<ArrayList<String>> doku=new ArrayList<>();

        Workbook workbook=null;
        try {
            FileInputStream inputStream=new FileInputStream(path);
             workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet1= workbook.getSheet(sheet);

        for (int i = 0; i <sheet1.getPhysicalNumberOfRows(); i++) {

            ArrayList<String> satirData=new ArrayList<>();

            for (int j = 0; j <colounCount ; j++) {
                satirData.add(sheet1.getRow(i).getCell(j).toString());

            }
            doku.add(satirData);

        }


        return doku;
    }
}
