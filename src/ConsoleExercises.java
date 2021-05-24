import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer.");
        int userInput = scanner.nextInt();
        System.out.printf("Your integer was: %s%n", userInput);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter three words ");
//        System.out.println("Your first word: ");
//        String firstWord = scan.nextLine();
//        System.out.println("Your second word: ");
//        String secondWord = scan.nextLine();
//        System.out.println("Your third word: ");
//        String thirdWord = scan.nextLine();
//        System.out.printf("%s\n%s\n%s\n", firstWord, secondWord, thirdWord);

        System.out.println("Please enter three words...");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.printf(first + "%n" + second + "%n" + third + "%n");


        System.out.println("Please enter a sentence...\n");
        scanner.nextLine();
        String inputSentence = scanner.nextLine();
        System.out.print("Your sentence was: " + inputSentence);


        System.out.println("\nWhat is the width of your Codeup classroom?\n");
        String width = scanner.nextLine();
        int i = Integer.parseInt(width);
        System.out.print("What is the length of your Codeup classroom?\n");
        String length = scanner.nextLine();
        int iTwo = Integer.parseInt(length);
        System.out.printf("The area of the classroom is: %d\n", iTwo * i);
        System.out.printf("The perimeter of the classroom is: %d\n", (iTwo * 2) * (i * 2));




    }
}
