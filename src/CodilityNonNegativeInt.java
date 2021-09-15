//Two non-negative integers are called siblings if they can be obtained from each other by rearranging the digits of their decimal representations. For example, 123 and 213 are siblings. 535 and 355 are also siblings.A set consisting of a non-negative integer N and all of its siblings is called the family of N. For example, the family of 553 comprises three numbers: 355, 535 and 553.
// Write a function that, given a non-negative integer N, returns the largest number in the family of N.
// The function should return −1 if the result exceeds 100,000,000. For example, given N = 213 the function should return 321. Given N = 553 the function should return 553.

public class CodilityNonNegativeInt {
    // Function to print the maximum number
    static int printlargeNum(int num) {
        // hashed array to store total count of digits
        int count[] = new int[10];

        // Converting given number to string
        String str = Integer.toString(num);

        // Updating the count array
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - '0']++;

        // result is to store the final number
        int result = 0, multiplier = 1;

        // changing  the count array
        // to know the largest number
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }

        // Helped in returning the result
        return result;
    }

    // main program to test above function
    public static void main(String[] args) {
        int num = 252;
        System.out.println(printlargeNum(num));
    }
}
