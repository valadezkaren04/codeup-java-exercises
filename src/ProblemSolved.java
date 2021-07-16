public class ProblemSolved {
    public static void swapStrings(String [] a, String [] b) {
        a = new String[]{"apple", "banana", "pear"};
        b = new String[]{"bob", "sue", "lou"};

        for (int i = 0; i < a.length; i++) {
            String swap = a[i]; // takes value of bob (index of 0)
            a[i] = b[i]; // a = {"apple", "sue", "lou"};
            b[i] = swap ; // b = {"bob", "banana", "pear"};

        }
    }
}
