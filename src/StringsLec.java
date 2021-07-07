//import java.util.Locale;
import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {
        char character = 'k';
        System.out.println(character == 'k');

        Scanner scanner = new Scanner(System.in);
        String bob = "Uncle Bob";
        System.out.println("Who is your favorite uncle?");
        String maybeBob = scanner.nextLine();
        System.out.println("User answered with correct answer AND capitalization: " + bob.equals(maybeBob));
        System.out.println("User answered with correct answer: " + bob.equalsIgnoreCase(maybeBob));

        //Compare the start and end of Strings


        // Manipulation
        int locationOfAInK = kn.indexOf("a");
        System.out.println("The location of 'a' in the string of \"nk\" is: " + locationOfAInK); // 5

        String hiDad = "Hello, Father";
        String father = hiDad.substring(7, 13); //Father
        System.out.println(father);
        hiDad = hiDad.replace(father, kn);
        System.out.println(hiDad); //Hello, Kim Namjoon

        String hasWhiteSpace = "      a lot of white space";
        System.out.println(hasWhiteSpace.trim()); //a lot of white space (no w.s)
        System.out.println(hasWhiteSpace); //      a lot of white space (with w.s)


        //Rabbit Hole (works!)
        String makeMeWork = "\"%s\" totally works in a souf";
        System.out.printf(makeMeWork, kn);

    }
}
