import java.io.PrintWriter;
import java.util.Date;
public class FileLogger {
    public static void writeLog(String filename, String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);
            writer.println(new Date() + "-" +message);
            throw new RuntimeException("Simulated write error");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                writer.close();
                System.out.println("Logger closed.");
            }
        }
    }
    public static void main(String[] args) {
        try {
            writeLog("log.txt", "Test message");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
