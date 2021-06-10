package util;

public class InputTest {

    public static void main(String[] args) {
        Input in = new Input();
//        System.out.println(in.getString()); // String getString()
//
//        System.out.println(in.yesNo()); // boolean yesNo()
//
//        System.out.println(in.getInt(30, 60)); // int getInt(int min, int max)
//        System.out.println(in.getInt()); // int getInt()
//
//        System.out.println(in.getDouble(1, 4)); // double getDouble(double min, double max)
//        System.out.println(in.getDouble(1, 2)); // double getDouble()

        // Exception exercise
        int userInput = in.getInt("Enter an integer: ");
        System.out.println("User input: " + userInput);


    }
}
