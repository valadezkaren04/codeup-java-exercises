import java.util.Scanner;

public class HelloWorldPartTwo {
    public static void main(String[] args) {
        System.out.println("Hello World! I'm practicing Java");

        int myFavNum = 14;
        System.out.println(myFavNum);

        String aString = "Hello beautiful people";
        System.out.println(aString);

        // string can be changed to something else ; reassigned

        aString = "now this is the string";
        System.out.println(aString);

        // but a string cannot be reassigned to a number

        // aString = 3.14159; // it is incompatible

        // long theNum = 3.14; // needs to be casted

        // long theNum = 123L;
        // System.out.println(theNum); // 123

        long theNum = 123;
        System.out.println(theNum); // 123

        float changingTheNum = 3.14F;
        theNum = (int) changingTheNum;
        System.out.println(theNum); // 3

        // int x = 5;
        // System.out.println(x++); // prints out 5
        // System.out.println(x); // 6

        // int x = 5;
        // System.out.println(++x); // 6
        // System.out.println(x); // 6

        // var class; // cannot be resolved

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o; // error

        // int three = (int) "three"; // error

        // int x = 4;
        // x = x + 5;

        // int x = 3;
        // int y = 4;
        // y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;


        String name = "karen";
        System.out.printf("Hello there, %s. Nice to see you.\n", name); // Hello there, karen. Nice to see you.

        String greeting = "Hello from";
        String company = "Purps";
        System.out.printf("%s, %s! %n", greeting, company); // Hello from, Purps!

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something:"); // need to enter something in the console
        //String userInput = scanner.next();
        String userInput = scanner.nextLine(); // gives you the next line after

        System.out.println("You entered: --> \"" + userInput + "\" <--"); //

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("please enter 4 words");
        System.out.println("Your first word: ");
        String first = scanner.nextLine();
        System.out.println("Your second word:");
        String second = scanner.nextLine();
        System.out.println("Your third word:");
        String third = scanner.nextLine();
        System.out.println("Your fourth word:");
        String fourth = scanner.nextLine();

        System.out.printf("%s%n%s%n%s%n%s", first, second, third, fourth);


        // user can input a sentence into the scanner
        System.out.println("please enter a complete sentence...");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("Your sentence was: " + sentence);

        // using some math
        System.out.println("\nWHat is the width of your living room?\n");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the length of your living room?\n");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("The are of the living room is: %d%n", length * width);
        System.out.printf("The perimeter of the living room is: %d%n", (length * 2) * (width * 2));

        // boolean expressions
        //discountPercent == 2.3       // equal to a numeric literal
        //letter == 'y'                // equal to a char literal
        //isValid == false             // equal to the false value

        //subtotal != 0                // not equal to a numeric literal
        //loggedInUser != accountOwner // not equal to a variable

        //years > 0                    // greater than a numeric literal
        //i < months                   // less than a variable

        //subtotal >= 500              // greater than or equal to a numeric literal
        //quantity <= reorderPoint     // less than or equal to a variable

        // logical operators
        //if (isLoggedIn && isAdmin) { // user is logged in *and* is an admin
        // show the admin panel


    }

}