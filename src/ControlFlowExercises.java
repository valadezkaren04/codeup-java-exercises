import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1

        //a
//        int i = 5;
//        while (i <= 15) {
//            i++;
//            System.out.print(i + " ");
//        }

        //b
//        int i = 100;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 100000);

        //c
//          for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2L; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

        //2
        /*You have to design the code such that the user has only three tries to
         * guess the correct pin of the account. You set the pin as a constant with a
         * final attribute. When correct display "Correct, welcome back." When
         * incorrect display "Incorrect, try again.". When user runs out of tries
         * display "Sorry but you have been locked out."
         * program Starts:
         * Please enter pin:
         * 22132
         * Output:
         * Incorrect, try again.
         * Please enter pin:
         * 23412
         * Output:
         * Incorrect, try again.
         * Please enter pin:
         * 12345
         * Output:
         * Correct, welcome back.
         */

//        Scanner scanner = new Scanner(System.in);
//        final int pin = 12345;
//        int userInput = 0;
//        int attempts = 1;
//
//        while (attempts <= 3) {
//            System.out.println("Please enter the pin: ");
//            userInput = scanner.nextInt();
//
//            if (userInput != pin) {
//                if (attempts < 3) {
//                    System.out.println("\nIncorrect, please try again.");
//                } else {
//                    System.out.println("Sorry, but you have used all your attempts.");
//                }
//            } else {
//                System.out.println("Correct, welcome back!");
//                break;
//            }
//            attempts++;
//        }

        //3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        boolean userContinue = false;
//
//        do {
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------  | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                System.out.printf("%-7d| %-8d| %-5d%n", i, i * i, i * i * i);
//            }
//            System.out.println("Would you like to continue? yes/no");
//            String ans = scanner.next();
//            if (ans.equals("yes")) {
//                userContinue = true;
//                System.out.println("What number would you like to go up to? ");
//            } else {
//              break;
//              }
//        } while (userContinue);


        //4
        Scanner scanner = new Scanner(System.in);
        String userChoice = "yes";
        while (!userChoice.equals("no")) {
            System.out.println("Enter the student's grade: ");
            short gradeInput = scanner.nextShort();
            char letterGrade;
            if (gradeInput > 0 && gradeInput <= 59) {
                letterGrade = 'F';
            } else if (gradeInput > 59 && gradeInput <= 66) {
                letterGrade = 'D';
            } else if (gradeInput > 66 && gradeInput <= 79) {
                letterGrade = 'C';
            } else if (gradeInput > 79 && gradeInput <= 87) {
                letterGrade = 'B';
            } else {
                letterGrade = 'A';
            }
            System.out.println("The letter grade is: " + letterGrade);
            System.out.println("Would you like to enter another grade? yes/no");
            userChoice = scanner.next();
        }



    }
}
