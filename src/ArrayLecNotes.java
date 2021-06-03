import java.util.Arrays;
public class ArrayLecNotes {
    public static void main(String[] args) {

        int[] numbers = {14, 64, 34, 44}; /** must dictate data type. all elements contained in this way
         ** are going to be this specific data type. Has to be same data type */
        System.out.println(numbers); //prints location of array in memory - not human readable.

        for (int i = 0; i < numbers.length; i++){ // One way to print out the numbers, can iterate through it with for loop.
            System.out.println(numbers[i]); // 14 64 34 44
        }

        /*--- Enhanced for loop ---*/
        for (int number : numbers){
            System.out.println(number); // 14 64 34 44
        }

        /**Arrays different from js. Length in java is defined.
         * Js has push/pull to add to array; arrays are static in Java. */

        numbers[1] = 33; // Can change number at a specific index
        //numbers[4] = 15; // Cannot change the length of the array. It will throw an exception.

/**enter how long you want array to be. We could set array to be a longer length, but if nothing added at that index it will return null. Dealing with reference data type; dealing with objects. */

        String[] topFiveBoyNames = new String[5];
        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Bob";
        topFiveBoyNames[3] = "Joe";
        topFiveBoyNames[4] = "Richard";
        for (String name : topFiveBoyNames){
            System.out.println(name);
            /** With [5] all names appear,
             * but if added [6} without it being defined it comes back 'null'
             * In Java 'null' is nothing. */
        }

        // No 'empty array' in java; default values assigned to each specific index.
        boolean[] lookAtDefaultVals = new boolean[3];
        for (boolean boo : lookAtDefaultVals){
            System.out.println(boo); // false false false
        }

        /*--- Array methods (Using the Arrays class imported: import java.util.Arrays;) ---*/

        // fill the entire array with the element value true. good to use to fill in default value
        Arrays.fill(lookAtDefaultVals, true);
        for (boolean boo : lookAtDefaultVals){
            System.out.println(boo); // true true true
        }

        // fill the entire array with the element value John
        Arrays.fill(topFiveBoyNames, "John");
        topFiveBoyNames[2] = "Winston";
        for (String name : topFiveBoyNames){
            System.out.println(name); // John John Winston John John
        }

        /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/
        int[] alsoNum = {14, 33, 34, 44};
        for (int number : numbers){ // numbers is at the top of page: int[] numbers = {14, 64, 34, 44};
            System.out.println(number); // 14 33 34 44
        }

        for (int number : alsoNum){
            System.out.println(number); // 14 33 34 44
        }

        System.out.println(numbers == alsoNum); // returns false. same numbers, but different objects
        System.out.println(Arrays.equals(numbers, alsoNum)); // true

       /*--- How to add to array ---*/

        // change the arrays length
        int[] yetMoreNums = Arrays.copyOf(numbers, 5);
        for (int number : yetMoreNums){
            System.out.println(number); // 14 33 34 44 0 (defaults newLength as 0)
        }

        // set up alias for numbers; numbersAgain does equal number.
        int[] numbersAgain = numbers;
        System.out.println(yetMoreNums == numbers); // returns false: Made a copy - new object yetMoreNums, not equal to numbers

        int[] unsortedNumbers = {99, -19, 88, 0, 3, 44, 13};
        Arrays.sort(unsortedNumbers); // Static method toString from arrays class. Returns a readable array that's sorted
        System.out.println(Arrays.toString(unsortedNumbers));  // [-19, 0, 3, 13, 44, 88, 99]
        // System.out.println(unsortedNumbers.toString());  This does not work

        /*-*-*-*-*- Two-Dimensional Arrays -*-*-*-*-*/

        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };
        for (char[] row : letters){
            System.out.println("+---+---+---+");
            System.out.println("| ");
            for (char n : row){
                System.out.print(n + " | ");
            }
            System.out.println(); // work as new line character at the end
        }
        System.out.println("+---+---+---+");
    }
}