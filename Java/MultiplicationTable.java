import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Automatically closes scanner
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }  // Scanner is closed automatically here
    }
}
