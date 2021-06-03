import java.util.Arrays;


public class ArrayLecNotes {
    public static void main(String[] args) {
        int[] numbers = {14, 68, 67, 44};
        numbers[1] = 33;
        for (int i = 0; i < numbers.length; i++) {  //represent as a string, wihtout it, it will sout [I@5acf9800
            System.out.println(numbers[i]); // 14 68 67 44
        }

        /*--- enhanced for loop ---*/
        //for (int number : numbers) {  //will go trthough all different elements of the array
            //System.out.println(number);
        //}

        String[] topFiveBoyNames = new String[6];

        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "Hideo";

        for(String name : topFiveBoyNames) {
            System.out.println(name);
            /* With [5] all names appear,
             * but if added [6} without it being defined it comes back 'null'
             * In Java 'null' is nothing. */
        }

        boolean[] lookingAtDefaultValues = new boolean[3];

        for (boolean boo : lookingAtDefaultValues) {
            System.out.println(boo); // false false false
        }

        Arrays.fill(lookingAtDefaultValues, true);

        for (boolean boo : lookingAtDefaultValues) {
            System.out.println(boo);
        }

        Arrays.fill(lookingAtDefaultValues, "Jim");
        topFiveBoyNames[0] = "Naysa";

        for (String name : lookingAtDefaultValues) {
            System.out.println(name);
        }
    }
}
