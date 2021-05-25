import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, it means x is 5");
//        }
//
//        System.out.println("On the other hand, this says nothing about x, because it runs regardless");

//        int y = 14;
//
//        if (y == 2) {
//            System.out.println("The statement 'y == 2' is true.");
//        } else {
//            System.out.println(" 'y == 2' is not true.");
//        }

//        short y = -5;
//        y = 14;
//        y = 32000;
       // y = 33000; can't put an int into a short
//        if (y < 0) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >= 0 && y < 30000) {
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "chocolate";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla ice cream cone coming right out.");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate ice cream cone coming right out.");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry ice cream cone coming right out.");
//                break;
//            default:
//                System.out.println("I'm sorry, we don't have that kind, sorry.");
//        }


        //cannot do this
//        String existence = "I exist";
//
//        if (existence) {
//            System.out.println("The programmer is a real being.");
//        }

//        boolean existence = true;
//
//        if (existence) {
//            System.out.println("The programmer is a real being.");
//        }

        /* LOGICAL OPERATORS */
        // you can do && || &

//        int c = 0, d = 100, e = 50;
//
//        if (c == 1 && e++ < 100) {
            //do anything
//        }
//        System.out.println("e = " + e); // doesn't increment ; stays at 50

//        if (c == 0 && e++ < 100) {
            //do anything
//            d = 150;
//        }
//        System.out.println("e = " + e); // increments ; changes to 51

        // non-short circuit operator
//        if (c == 1 & e++ < 100) {
            //do anything
//        }
//        System.out.println("e = " + e); // increments ; changes to 52

       /* & will always test both conditions, && will only test both if the first executes as true */

//        boolean existence = true;
//        boolean solipsism = false;
//        boolean weAllLiveInSomeoneElsesDream = false;
//        boolean thisDeskIsRealNotAProjectionOfMyMind = true;
//
//        if (thisDeskIsRealNotAProjectionOfMyMind | weAllLiveInSomeoneElsesDream) {
//            System.out.println("Common sense is victorious.");
//        } else {
//            System.out.println("I'm really confused now...");
//        }
//
//        if (solipsism || weAllLiveInSomeoneElsesDream) {
//            System.out.println("Common sense is victorious.");
//        } else {
//            System.out.println("I'm really confused now...");
//        }

        // comparison operator ==
        // there is no strict equality operator
        // inequality operator !=
        // there is no strict inequality, don't use this: !==

        //these get stored in the same place
//        String myName = "Karen";
//        String anotherKaren = "Karen";
//
//        String karen = new String("Karen");
//
//        System.out.println(myName == anotherKaren);
//        System.out.println(myName == karen);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//        if (userInput == myName) {
//            System.out.println("Hello, me");
//        } else {
//            System.out.println("You are not me.");
//        }
//        if (userInput.equals(myName)) {
//            System.out.println("Hello, me");
//        } else {
//            System.out.println("You are not me.");
//        }

        /* LOOPS */

        int i = 1;
        while (i < 10) {
            System.out.println("Now I'm in the loop. I have not incremented yet and its value is " + 1);
            // i++ is shorthand for i = i + 1;
            i++;
            System.out.println("I'm still in the loop, but i has incremented now, and it's value is " + i);
        }
        System.out.println("This is outside of the loop, after it has executed. The conditional has tested false. The value of i is now " + i);
    }
}
