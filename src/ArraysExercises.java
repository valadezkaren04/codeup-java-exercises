import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@5acf9800 ; prints location of array in memory - not human readable.

        //create an array that holds 3 person objects
        Person firstPerson = new Person("Javier");
        Person secondPerson = new Person("David");
        Person thirdPerson = new Person("Jay");

        //Assign new instance of the Person class to each element.
        Person[] personArray = new Person[3];
        personArray[0] = firstPerson;
        personArray[1] = secondPerson;
        personArray[2] = thirdPerson;

        //Iterate through the array and print out the name of each person in the array.
        for (Person p : personArray){
            System.out.println(p.getName());
        }
    }
}
