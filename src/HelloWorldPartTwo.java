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

        String userResp = scanner.nextLine();
        System.out.println("Your first word is: ");


    }
}
