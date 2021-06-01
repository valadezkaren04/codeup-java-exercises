import java.util.Scanner;

public class MethodsExercises {

    // 1
    public static int addIt(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractIt(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyIt(int num1, int num2) {
        return num1 * num2;
    }

    public static int devideIt(int num1, int num2) {
        return num1 / num2;
    }

    public static int moduleIt(int num1, int num2) {
        return num1 % num2;
    }

    // BONUS
    /* Create your multiplication method without the * operator
     * (Hint: a loop might be helpful).
     * Do the above with recursion. */

    // 2
    public static int getInteger(int min, int max) {
        System.out.printf("Give me a number between %d and %d\n", min, max);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }
    }

    //3
//    public static int factorialNum(int num) {
//        System.out.println("Please enter an integer between 1 and 10: ");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        System.out.printf("Your integer was: %d", num);
//finish exercises on monday
        //as well as the bonuses
        //work on mini project!
//    }

    //4

    //5

    public static void main(String[] args) {

        System.out.println(addIt(14, 14));
        System.out.println(subtractIt(100, 50));
        System.out.println(multiplyIt(21, 50));
        System.out.println(devideIt(2000, 50));
        System.out.println(moduleIt(500, 40));

        System.out.println(getInteger(1, 20));


    }
}
