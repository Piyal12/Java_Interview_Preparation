package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadDataFromExcel {
    public static void main(String[] args) throws FileNotFoundException {
        //Convert excel file to Java representation object
        FileInputStream fis=new FileInputStream("path");

        //Connect the file
/*        Workbook workbook =WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet(sheetname);
        Row row=sheet.getRow(rownum);
        Cell cell=row.getCell(cellNum);
        DataFormatter dataFormatter=new DataFormatter();
        String value=dataFormatter.formatCellValue(cell);*/
    }
}
