import java.util.Scanner;
public class SafeCalculator {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First Number (or 'Exit'): ");
            String first = scanner.nextLine();
            if (first.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.print("Enter second number: ");
            String second = scanner.nextLine();
            try {
                int a = Integer.parseInt(first);
                int b = Integer.parseInt(second);
                int result = a / b;
                System.out.println("Result: " + a + " / " + b + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error; cannot divide by zero.Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Error; Please enter valid integers only.");
            }
       
        }
        scanner.close();
    }
}
