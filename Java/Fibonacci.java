// Fibonacci sequence in Java

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, nextTerm;

        System.out.print("Fibonacci Sequence: " + a + ", " + b);

        for (int i = 1; i <= n - 2; ++i) {
            nextTerm = a + b;
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }
    }
}
