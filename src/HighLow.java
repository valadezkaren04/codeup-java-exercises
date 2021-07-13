import java.util.Scanner;

//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.


    public class HighLow {
        public static void main(String[] args) {
            littleGame();
        }

        public static int magicNum(int min, int max) {
            return (int) Math.floor(Math.random() * ((max) - min) + min);
        }

        public static String littleGame(int guess, int answer) {
            if (guess > answer) {
                return "LOWER";
            } else if (guess < answer) {
                return "HIGHER";
            } else {
                return "YOU GOT IT!";
            }
        }

        public static void littleGame(int min, int max, int tries) {
            Scanner sc = new Scanner(System.in);
            int answer = magicNum(min, max);
            int guess = 0;
            int attempts = 0;
            while (guess != answer && attempts < tries) {
                System.out.printf("Guess a number between %d and %d You have %d attempts left.%n", min, max, tries - attempts);
                guess = sc.nextInt();
                System.out.println(littleGame(guess, answer));
                attempts++;
            }
            if (attempts == tries && guess != answer) {
                System.out.println("The magic number was: " + answer + ". You have ran out of guesses...");
            } else {
                System.out.println("Thank you so much for to playing my game! You took " + attempts + " attempts.");
            }
        }

        public static void littleGame() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Higher or Lower!");
            System.out.println("Please enter a minimum value.");
            int min = MethodsExercises.getInteger(0, 300);
            System.out.printf("You entered: %d.%n", min);
            System.out.println("Please enter a maximum value.");
            int max = MethodsExercises.getInteger(min + 1, min + 300);
            System.out.printf("You entered: %d.%n", max);
            int tries = 25;
            while (true) {
                System.out.println("Please select your difficulty:");
                System.out.println("EASY: 25 attempts to guess the correct number.");
                System.out.println("NORMAL: 15 attempts to guess the correct number.");
                System.out.println("HARD: 5 attempts to guess the correct number.");
                System.out.println("HOT SHOT: 1 attempt to guess the correct number.");
                String difficulty = sc.nextLine();
                if (difficulty.equalsIgnoreCase("easy")) {
                    System.out.println("You've selected: EASY");
                    break;
                } else if (difficulty.equalsIgnoreCase("normal") || difficulty.equalsIgnoreCase("medium")) {
                    System.out.println("You've selected: NORMAL");
                    tries -= 10;
                    break;
                } else if (difficulty.equalsIgnoreCase("hard")) {
                    System.out.println("You've selected: HARD");
                    tries -= 20;
                    break;
                } else if (difficulty.equalsIgnoreCase("hot shot")) {
                    System.out.println("You've selected: HOT SHOT");
                    tries -= 24;
                    break;
                } else {
                    System.out.println("Invalid selection: Try Again.");
                }
            }

            }
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Preparing game...");
                littleGame();
            } else {
                System.out.println("Program closed by user.");
            }
        }
}
