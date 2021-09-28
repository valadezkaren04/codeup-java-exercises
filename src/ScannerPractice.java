import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int userInput = scanner.nextInt();
        System.out.printf("Your integer was: %d%n", userInput);
    }
}
