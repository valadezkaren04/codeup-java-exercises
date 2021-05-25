import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1

        //a
//        int i = 5;
//        while (i <= 15) {
//            i++;
//            System.out.println(i);
//        }

        //b
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 100) {
//            System.out.println(i);
//        }

        //c
//        for (int i = 2; i <= 100; i++) {
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

        Scanner scanner = new Scanner(System.in); {
            System.out.println("Please enter pin: ");
            String userInput = scanner.next();
            if (userInput.equals(12345)) {
                System.out.println("Correct, welcome back!");
            } else {
                System.out.println("Incorrect, please try again");
            }
        }

        //3



    }
}
