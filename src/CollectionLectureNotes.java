import java.util.ArrayList;

public class CollectionLectureNotes {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        ArrayList<Integer> collectionofNums = new ArrayList<>(); //carries over the value
        collectionofNums.add(16);
        collectionofNums.add(44);
        collectionofNums.add(24);

        collectionofNums.add(1, 14); //doesn't replace but pushes it down: 16 14 44 24

        /*---get length of collection---*/
        for (int i = 0; i < collectionofNums.size(); i++) { // uses the size method
            System.out.println(collectionofNums.get(i));
        }

        /*---iterating through the collection---*/
        for (Integer collectionofNum : collectionofNums) {
            System.out.println(collectionofNum); // 16 44 24
        }

        System.out.println(numbers); // unreadable code; memory // [I@5acf9800
        System.out.println(collectionofNums); //already has a .toString() method included// [16, 14, 44, 24]

        System.out.println(collectionofNums.contains(44)); // to see if element mataches/exists inside a collection, gets back a boolean// true
        System.out.println(collectionofNums.indexOf(44)); // 2nd index
        System.out.println(collectionofNums.lastIndexOf(44)); // 2 again because it is the last 44

        ArrayList<String> studentNames = new ArrayList<>();
        if (studentNames.isEmpty()) {
            System.out.println("Let's fill in the name of Student names"); // Let's fill in the name of Student names
        }
    }
}
