public class HelloWorldPartTwo {
    public static void main(String[] args) {
        System.out.println("Hello World! I'm practicing Java");

        int myFavNum = 14;
        System.out.println(myFavNum);

        String aString = "Hello beautiful people";
        System.out.println(aString);

        // string can be changed to something else ; reassigned

        aString = "now this is the string";
        System.out.println(aString);

        // but a string cannot be reassigned to a number

        // aString = 3.14159; // it is incompatible

        // long theNum = 3.14; // needs to be casted

        // long theNum = 123L;
        // System.out.println(theNum); // 123

        long theNum = 123;
        System.out.println(theNum); // 123

        float changingTheNum = 3.14F;
        theNum = (int) changingTheNum;
        System.out.println(theNum); // 3

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;

        // int three = (int) "three";

        // int x = 5;
        // System.out.println(x++); // prints out 5
        // System.out.println(x); // 6

        // int x = 5;
        // System.out.println(++x); // 6
        // System.out.println(x); // 6

        int x = 4;
        x = x + 5;


    }
}
