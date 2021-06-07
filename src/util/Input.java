package util;
//import java.util.Locale;
import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in); // When an instance of this object is created, the scanner property should be set to a new instance of the Scanner class. ; created a CONSTRUCTOR (special method that is called when an object is created).
    }

    public String getString(){ //getter
        System.out.println("Please enter a sentence...");
        return this.scanner.nextLine(); // can be in one line instead
        //String input = scanner.nextLine();
        // return input;
    }

    public boolean yesNo() {
        System.out.println("Yes or No?");
        String Userinput = scanner.nextLine();
        if (Userinput.trim().equalsIgnoreCase("yes")||Userinput.trim().equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter an integer between %d and %d", min, max);
        int userNum = this.scanner.nextInt();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("That number is not between the max and min");
            return getInt(min, max);
        }
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a decimal between %f and %f", min, max);
        double userNum = this.scanner.nextDouble();

        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("That decimal number is not between the max and min");
            return getDouble(min, max);
        }
    }

    public double getDouble(String s) {
        return this.scanner.nextInt();
    }

    public boolean yesNo(String s) {
        return false;
    }


//    double getDouble()

}
