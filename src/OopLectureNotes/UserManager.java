package OopLectureNotes;
import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    // when the program starts, we want to prompt the user with choices so they can navigate through the options.
    public static void startMenu(User u) {
        System.out.println("Welcome, would you like to do?");
        System.out.println("1. Log in.\n2.Exit Program.");

        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            UserTools.logIn(u);
            // once the user logs in, run the editPreferences method to take them to the next portion of functionality.
            editPreferences(u);
        } else {
            System.out.println("Thank you for your time. Bye!");
        }
    }

    public static void editPreferences(User u) {
        if(!u.isLoggedIn()) {
            System.out.println("Sorry, you are currently logged out, please log in.");
            UserTools.logIn(u);
        } else {
            System.out.println("Welcome to your preferences. Would you like to:\n1. Change your password.\n2. Change your username.\n3. View credentials. \n4. Log out");
            int userChoice = scanner.nextInt();
            System.out.println("You chose to choice " + userChoice);
            // creating a case for each option of editPreferences, and using recursion to point
            // them back to this preferences menu AFTER the they complete the task they have chosen.
            switch (userChoice) {
                case 1:
                    // must use the Class name to access static methods, then pass in the object we are communicating with.
                    UserTools.changePassword(u);
                    editPreferences(u);
                    break;
                case 2:
                    UserTools.changeUsername(u);
                    editPreferences(u);
                    break;
                case 3:
                    u.describeUser();
                    editPreferences(u);
                    break;
                default:
                    UserTools.logOut(u);
                    startMenu(u);
            }
        }
    }

    public static void main(String[] args) {
        // instantiate a new User object.
        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");
        // running our startMenu method, passing in our object instance.
        startMenu(user2);
    }
}
