import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String name = "Toto";
        System.out.printf("Hello, %s%n", name); //s is for string, % replaces.

        System.out.format("%d is %s's favorite number\n", 42, name);
        System.out.println("I'm in a new line");

        System.out.println("Hello, " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey dude, how's it going? ");
        String userInput = scanner.nextLine();
        System.out.printf("You're feeling: %s%n", userInput);

        System.out.println("Give me a number");
        int num = scanner.nextInt();
        System.out.printf("Your number: %d%n", num);

    }
}
