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

/**
 * Utils > Test Date
 */
public class TestData {
    /**
     * <p>
     * This method reads the column Test Data from given excel file as list.
     * Need to pass the column number as parameter
     * </p>
     *
     * @param args
     */

    public static ArrayList<String> getData(final int columnNumber) {

        ArrayList<String> columnData = new ArrayList<String>();
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\sball\\git\\cath\\src\\test\\java\\TestData\\Login_Data.xls");
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();
            rows.next();
            while (rows.hasNext()) {
                columnData.add(rows.next().getCell(columnNumber).getStringCellValue());
            }
        } catch (IOException io) {
            io.printStackTrace();
        }

        return columnData;

    }

}
