package ReadingWritingExcelDemo;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class WritingDataDemo
{

    public static void main(String args[]) throws IOException
    {

        FileInputStream fist1 = new FileInputStream(new File("C:\\Users\\DELL\\Desktop\\TestData.xlsx"));

        XSSFWorkbook workbook = new XSSFWorkbook(fist1);

        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getPhysicalNumberOfRows();

            for(int j=0;j<rows;j++)
            {

           Row row = sheet.getRow(j+1);
           int  cells = row.getPhysicalNumberOfCells();
           System.out.println(cells);

                 for(int i=0;i<cells;i++)
                 {
                      if(row.getCell(i).getStringCellValue()=="")
                      {
                          continue;
                      }
                      else{

                      }
                 }

       }

    }
}
