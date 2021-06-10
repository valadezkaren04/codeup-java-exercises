package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
//            = new Scanner(System.in);

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    // TODO: **BONUS**
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String userInput = this.scanner.nextLine();
        return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
    }

    // TODO: **BONUS**
    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = this.scanner.next();
        return userInput.trim().equalsIgnoreCase("y") || userInput.trim().equalsIgnoreCase("yes");
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    // TODO: **BONUS**
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return this.scanner.nextInt();
//    }

    // refactor getInt method to use try-catch
    public int getInt(String prompt){
        int number;
        try {
            number = Integer.valueOf(getString(prompt));
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Give me a whole number between %d and %d", min, max);
        int userNumber = this.scanner.nextInt();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getInt(min, max);
        }
    }

    // TODO: **BONUS**
    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userNumber = this.scanner.nextInt();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getInt(min, max);
        }
    }


    public double getDouble() {
        return this.scanner.nextDouble();
    }

    // TODO: **BONUS**
    public double getDouble(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a decimal number between %f and %f", min, max);
        double userNumber = this.scanner.nextDouble();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getDouble(min, max);
        }
    }

    // TODO: **BONUS**
    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userNumber = this.scanner.nextDouble();

        if(userNumber >= min && userNumber <= max) {
            return userNumber;
        } else {
            System.out.println("That number is invalid.");
            return getDouble(min, max);
        }
    }
}