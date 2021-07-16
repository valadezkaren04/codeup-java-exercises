public class ProblemSolved {
    public static void swapStrings(String [] a, String [] b) {
        String[] a = {"apple", "banana", "pear"};
        String[] b = {"bob", "sue", "lou"};

        for (int i = 0; i < a.length; i++) {
            String swap = a[i]; // takes value of bob (index of 0)
            a[i] = b[i]; // a = {"apple", "sue", "lou"};
            b[i] = swap ; // b = {"bob", "banana", "pear"};
            
        }
    }
}
