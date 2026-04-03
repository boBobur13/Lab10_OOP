import java.io.File;
import java.io.PrintWriter;
public class StudentFileWriter {
    public static void main(String[] args) {
        File file =new File("students.txt");
        if (file.exists()) {
            System.out.println("Warning' File already exists Overwriting");
        }
        try (PrintWriter writer=new PrintWriter(file)) {
            writer.println("Ali Karimov 3.85 ComputerScience");
            writer.println("Dilnoza Rakhimova 3.92 Mathematics");
            writer.println("Jasur Akhmedov 3.45 Physics");
            writer.println("Madina Usmanova 3.78 Economics");
            writer.println("Rustam Tursunov 3.60 Engineering");
            System.out.println("File written successfully");
        } catch (Exception e) {
            System.out.println("Error writing file" + e.getMessage());
        }
    }
}
