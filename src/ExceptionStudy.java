import java.util.Scanner;

public class ExceptionStudy {
    public String maybeAnInteger = "42";
    public String definitelyNotAnInteger = "Nope. I'm not an integer, I'm a String.";

    public void askForAnInterger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer...");
        String userInput = scanner.nextLine();
        try {
            int userInputInt = Integer.parseInt(userInput);
            System.out.println("The integer in your string is: " + userInputInt);
        } catch (NumberFormatException e) {
            System.out.println("Oh nooo! " + e.getMessage() + " is not an integer");
        } finally {
            System.out.println("Thank you for using the app");
            System.out.println("Have a great day! n.n ");
        }
    }

//    // series of catches
//    /**make sure you put more specific exceptions catches ABOVE more general exception catches
//     * in your code or you will get thee already caught exception.
//     */
//    public void moreComplexInt() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter an integer...");
//        String userInput = scanner.nextLine();
//        try {
//            //userInput = null // npe
//            int userInputInteger = Integer.parseInt(userInput, 10, 15, 10);
//            System.out.println("Thank you for entering: " + userInputInteger);
//        } catch (NumberFormatException nfe){
//            System.out.println("No integer between characters 10 and 15");
//        } catch (IndexOutOfBoundsException iobe) {
//            System.out.println("Your string wasn't long enough");
//        } catch (NullPointerException npe) {
//            System.out.println("You literally didn't hear anything");
//        } finally {
//            System.out.println("Thank you for visiting our application.");
//        }
//    }
//}
