package ApachiPOI.resource;
import io.cucumber.java.sl.Ce;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CalismaSayfasi {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("Sayfa1");

        Row row= sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("merhaba");

        for (int i = 0; i < 10; i++) {
          row.createCell(i).setCellValue(i);
        }

        String path="src/test/java/ApachiPOI/resource/YeniExcel.xlsx";
        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("islem tamamlandi");



        }

    }

