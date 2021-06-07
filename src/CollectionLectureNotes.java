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

        /*---empty array---*/
        ArrayList<String> studentNames = new ArrayList<>();
        if (studentNames.isEmpty()) {
            System.out.println("Let's fill in the name of Student names"); // Let's fill in the name of Student names
        }
        studentNames.remove("Beatrice"); // if array was not empty, it would remove Beatrice
        boolean resultRemove = studentNames.remove("Beatrice");
        System.out.println(resultRemove);//if done with a boolean it shows whether it was removed or not // false because it is an empty array. therefore the naem does not exist
        /*---**********---*/

        collectionofNums.remove((Integer) 44);
        System.out.println(collectionofNums); // it does remove 44 // [16, 14, 24]

        ArrayList<Double> collectionOfDoubles = new ArrayList<>();
        collectionOfDoubles.add(3.14);
        collectionOfDoubles.add(56.0);
        collectionOfDoubles.add(7.777777);
        collectionOfDoubles.add((double) 2);

        System.out.println(collectionOfDoubles); // [3.14, 56.0, 7.777777, 2.0]
        collectionOfDoubles.remove(2.0);
        System.out.println(collectionOfDoubles); // [3.14, 56.0, 7.777777]


        /*---**********---*/
//        ArrayList stuff = new ArrayList();
//        stuff.add("Beatrice");
//        stuff.add(13);
//        stuff.add(new Square(5));
//
//        for (Object thing : stuff) {
//            System.out.println(thing);
//        } // Beatrice 13
    }

}
