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
    public static String factorial(long num) {
        long factorial = 1L;
        String result = " = ";
        for (long i = 1L; i <=num; i++) {
            factorial *= i;
            if (i == num) {
                result += i;
            } else {
                result += i + " x ";
            }
        }
        return factorial + result;
    }

    //4
    public static void diceRoll(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }

    public static void diceRoll() {
        boolean keepGoing = true;
        while (keepGoing) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides is the die?");
            int sides = sc.nextInt();
            System.out.println("How many die are you wanting to roll?");
            int numDice = sc.nextInt();
            diceRoll(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {
                System.out.println("Keep playing? [Yes/No]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("No")) {
                System.out.println("Thanks for playing!");
                keepGoing = false;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(addIt(14, 14));
        System.out.println(subtractIt(100, 50));
        System.out.println(multiplyIt(21, 50));
        System.out.println(devideIt(2000, 50));
        System.out.println(moduleIt(500, 40));

        System.out.println(getInteger(1, 20));


    }
}
