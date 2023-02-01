package ReadingWritingExcelDemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;


public class ReadingExcelDemo {

    public static void main(String args[]) throws IOException {

        FileInputStream fist1= new FileInputStream(new File("C:\\Users\\DELL\\Desktop\\TestData.xlsx"));
        FileOutputStream fist= new FileOutputStream(new File("C:\\Users\\DELL\\Desktop\\TestData.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(fist1);

        XSSFSheet sheet = workbook.getSheetAt(0);


        Iterator<Row> itr = sheet.iterator();


        while(itr.hasNext())
        {
            Row rw = itr.next(); // To store the row data in a row type variable


            Iterator<Cell> cl = rw.cellIterator();

            while(cl.hasNext())
            {
                Cell cell1= cl.next();

               System.out.print(cell1.getStringCellValue()+"\t\t");
            }
             System.out.println();
        }



    }
}
