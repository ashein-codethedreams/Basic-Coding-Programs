import java.util.Scanner;

public class TrianglePatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose a Triangle Pattern to Print:");
            System.out.println("1. Right-Angled Triangle");
            System.out.println("2. Inverted Right-Angled Triangle");
            System.out.println("3. Pyramid Pattern");
            System.out.println("4. Inverted Pyramid Pattern");
            System.out.println("5. Pascal's Triangle");
            System.out.println("6. Diamond Pattern");
            System.out.println("7. Number Triangle Pattern");
            System.out.println("8. Floyd's Triangle");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRightAngledTriangle();
                    break;
                case 2:
                    printInvertedRightAngledTriangle();
                    break;
                case 3:
                    printPyramidPattern();
                    break;
                case 4:
                    printInvertedPyramidPattern();
                    break;
                case 5:
                    printPascalsTriangle();
                    break;
                case 6:
                    printDiamondPattern();
                    break;
                case 7:
                    printNumberTriangle();
                    break;
                case 8:
                    printFloydsTriangle();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    // 1. Right-Angled Triangle
    public static void printRightAngledTriangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Inverted Right-Angled Triangle
    public static void printInvertedRightAngledTriangle() {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Pyramid Pattern
    public static void printPyramidPattern() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Inverted Pyramid Pattern
    public static void printInvertedPyramidPattern() {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Pascal's Triangle
    public static void printPascalsTriangle() {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // 6. Diamond Pattern
    public static void printDiamondPattern() {
        int rows = 5;
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 7. Number Triangle
    public static void printNumberTriangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 8. Floyd's Triangle
    public static void printFloydsTriangle() {
        int rows = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
