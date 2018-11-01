public class RunApp
{
    public static void main( String[] args ){
        excelReader read = new excelReader();
        convertPDF convert = new convertPDF();
        try {
            convert.convertPDF();
            System.out.println("\nConverting to PDF . . .");

        }catch (Exception e){
            e.getStackTrace();
        }

        System.out.println("\nDATA PRINTED SUCCESSFULLY");
    }
}