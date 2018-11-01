import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class excelReader {

    private static final String FILE_NAME = "D:\\chessResultsList.xls";
    ArrayList<student> Studentlist = new ArrayList<>();
    ArrayList<topHeader> topList = new ArrayList<>();
    ArrayList<bottomFooter> bottomList = new ArrayList<>();

    public List<topHeader> readFirstData() {
        try {
            System.out.println("\n");
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(FILE_NAME));
            HSSFSheet sheet = workbook.getSheetAt(0);


            for (int b = 0; b <= 3; b++) {

                HSSFRow word = sheet.getRow(b);
                System.out.println(word.getCell(0).getStringCellValue());
                topList.add(new topHeader(word.getCell(0).getStringCellValue()));
            }
            return topList;

        } catch (Exception e) {
            return null;
        }
    }

    public List <student> readStudent(){
        try {
            System.out.println("\n");
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(FILE_NAME));
            HSSFSheet sheet = workbook.getSheetAt(0);

            System.out.format("%5s%31s%23s%7s%5s%20s%14s%n", "|  No.|", " Name", "| FidelID|", "FED", "| Rtg", "|  Club/City ", "|");

            for (int a = 5; a <= 154; a++) {
                int b = a - 4;
                HSSFRow row = sheet.getRow(a);
                System.out.printf("| %3d", b);
                //Name
                System.out.printf(" | %42s", row.getCell(2).getStringCellValue());
                //FideID
                System.out.printf(" | %6s", row.getCell(3).getStringCellValue());
                //FED
                System.out.printf(" | %7s", row.getCell(4).getStringCellValue());
                //RTG
                System.out.printf(" | %7s", row.getCell(5).getNumericCellValue());
                //Club or City
                System.out.printf(" | %23s | %n", row.getCell(6).getStringCellValue());

                int index = b;
                String name = row.getCell(2).getStringCellValue();
                String fideId = row.getCell(3).getStringCellValue();
                String fed = row.getCell(4).getStringCellValue();
                double rtg = row.getCell(5).getNumericCellValue();
                String cc = row.getCell(6).getStringCellValue();

                Studentlist.add(new student(b, name, fideId, fed, rtg, cc));

            }

            return Studentlist;
        }catch (Exception e){
            return null;
        }
    }

    public List <bottomFooter> readBottomExcel() {
        try {
            System.out.println("\n");
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(FILE_NAME));
            HSSFSheet sheet = workbook.getSheetAt(0);
            for (int c = 156; c <= 157; c++) {

                HSSFRow word1 = sheet.getRow(c);
                System.out.printf("%70s%n", word1.getCell(0).getStringCellValue());
                bottomList.add(new bottomFooter(word1.getCell(0).getStringCellValue()));
            }
            return bottomList;
        } catch (Exception e) {
            return null;
        }
    }
}