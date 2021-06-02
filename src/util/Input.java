package util;
import java.util.Locale;
import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public Input (){
        this.scanner = new Scanner(System.in); //created a constructor.

    }

    public String getString(){ //getter
        System.out.println("Please enter a sentence");
        String input = scanner.nextLine();
        return input;
    }

    public boolean YesNo(){
        System.out.println("Yes or No?");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("yes")||input.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {

    }

//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()

}
