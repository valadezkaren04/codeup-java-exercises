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

        long theNum = 123L;
        System.out.println(theNum);

        theNum = 123;
        System.out.println(theNum);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
    }
}
