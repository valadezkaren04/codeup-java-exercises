import shapes.Square;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionLectureNotes {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        ArrayList<Integer> collectionofNums = new ArrayList<>(); //carries over the value
        collectionofNums.add(16);
        collectionofNums.add(44);
        collectionofNums.add(24);

        collectionofNums.add(1, 14); //doesn't replace but pushes it down: 16 14 44 24

        /*---replace in collection---*/
        System.out.println(collectionofNums); // [16, 14, 24]
        collectionofNums.set(2, 88);
        System.out.println(collectionofNums); // [16, 14, 88]

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


        /*---****IGNORE******---*/
//        ArrayList stuff = new ArrayList();
//        stuff.add("Beatrice");
//        stuff.add(13);
//        stuff.add(new Square(5));
//
//        for (Object thing : stuff) {
//            System.out.println(thing);
//        } // Beatrice 13
        /*---***************---*/

        System.out.println("------***------");

        HashMap<Character, Square> squares = new HashMap<>(); // Character is built into Java
        squares.put('A', new Square(5));
        squares.put('B', new Square(10)); // added after getting 0.0 to get back 100.0 for the sout
        Square sq = new Square(3);
        squares.put('D', sq);
        squares.putIfAbsent('D', new Square(9));
        squares.putIfAbsent('Q', sq);
        System.out.println(squares.get('A').getArea()); // 25.0
//        System.out.println(squares.get('C').getArea());
        System.out.println(squares.getOrDefault('B', new Square(0)).getArea());// 0.0 ; don't get back a # value ; there is no square with the value of B
        System.out.println(squares.containsKey('B')); //true
        System.out.println(squares.containsValue(new Square(5))); //false b.c they are not the same
        System.out.println(squares.containsValue(sq)); // true
        System.out.println(sq);
        System.out.println(squares.get('Q'));
        squares.remove('Q');
        System.out.println(squares.get('Q'));
        squares.remove('C', sq);
        System.out.println(squares.containsValue(sq));
        squares.replace('D', new Square(4));
        System.out.println(sq.getArea());
        System.out.println(squares.get('D').getArea());
        squares.replace('E', new Square(15));
//        System.out.println(squares.get('E').getArea());
        squares.clear();
        System.out.println(squares.size());
        System.out.println(squares.isEmpty());
    }
}

