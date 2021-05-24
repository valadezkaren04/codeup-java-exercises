public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(", World!");
        //you can use brackets to section off your code
        {
            System.out.println("Look at me!");
            System.out.println("I'm in brackets!");
        }
        /* multiple
         * line
         * comment
         */
        System.out.println("But I'm not... :(");
        /*this line closes itself */
        System.out.println("I'm here too..");

        /* DATA TYPES */
        byte smallNum = 34; // Very short integers from -128 to 127
        System.out.println(smallNum);

        short notAsSmallNum = 30000; // Short integers from -32,768 to 32,767.

        int num = 45000000; // Integers from -2,147,483,648 to 2,147,483,647.

        long largeNum = 14; // Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.

        System.out.println(largeNum);

        float decimal = 1.5F; // F is casting //Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits.

        double bigDecimal = 45; // Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits.
        System.out.println(bigDecimal);

        char singleLetter = 'g'; //NEEDS TO BE IN SINGLE QUOTES (strings are double quotes// A single Unicode character that’s stored in two bytes.

        boolean amILearningJava = true; // A true or false value.

        /* STRINGS */
        String message = "How is it going?\n Is \"everything\" alright? \n\t Java isn't that scary, is it?";
        System.out.println(message);

        /* CONSTANTS */
        // cannot change value of final
        final char SINGLE_LETTER = 'a';
        /* SINGLE_LETTER = "A"; // Cannot redefine this */

        int sum = 4 + 5;
        System.out.println(sum);

        String sumAgain = "4" + 5;
        System.out.println(sumAgain);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = Long.MAX_VALUE;
        System.out.println(++iAmALong); //overflows

        iAmALong = 99;
        iAmAnInt = (int) iAmALong; //casts iAmALong to fit inside an int
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble); // 27.0

        iAmADouble = 3.141598;
        iAmAnInt = (int) iAmADouble;
        System.out.println(iAmAnInt); //prints out 3, it rounds down no matter what

        /*System.out.println((boolean) ); //boolean cnanot be casted for num*/



    }
}
