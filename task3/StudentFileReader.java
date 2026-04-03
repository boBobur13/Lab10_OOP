import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class StudentFileReader {
    public static void main(String[] args) {
      File file = new File("students.txt");
        try (Scanner scanner = new Scanner(file)) {
           System.out.println("Name\tGPA\tMajor");
            System.out.println("--------------------------");
            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String name = parts[0] + " " + parts[1];
                String gpa = parts[2];
                String major = parts[3];
               System.out.println(name + "\t" + gpa + "\t" + major);
                count++;
            }
            System.out.println("--------------------------");
            System.out.println("Total students: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error; File not found Please run StudentFileWriter first.");
        }
    }
}
