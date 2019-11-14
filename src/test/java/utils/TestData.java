package utils;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestData {

public static void getData(final int columnNumber) throws IOException {

    List<String> list=new ArrayList<String>();
    try{
        FileInputStream file=new FileInputStream("C:\\Users\\sball\\git\\cath\\src\\test\\java\\TestData\\Login_Data.xls");
        HSSFWorkbook workbook=new HSSFWorkbook(file);
        HSSFSheet sheet=workbook.getSheetAt(0);
        Iterator<Row> rows=sheet.iterator();
        rows.next();
        while(rows.hasNext()) {
          list.add(rows.next().getCell(columnNumber).getStringCellValue());
        }
     }catch (IOException io)
    {
        io.printStackTrace();
    }

    System.out.println(list);

}

}
