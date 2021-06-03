import java.util.Arrays;
public class ArraysExercises {

    public static Person [] addPerson(Person[] array, Person newPerson) { //takes in 2 arguments
        Person[] people = Arrays.copyOf(array, array.length + 1); //creates a copy of array; array.length + 1 creates a brand new array with an array increased by 1

        people[array.length] = newPerson; // acces the people array ; could have also said people[people.length - 1};
        return people; // returns the copy of array people
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // [I@5acf9800 ; prints location of array in memory - not human readable.
        System.out.println(Arrays.toString(numbers)); //^^ fixes it [1, 2, 3, 4, 5]

        /*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*/

        //create an array that holds 3 person objects & assign new instance of the Person class to each element.
        Person[] people = new Person[3];
        people[0] = new Person("Jungkook");
        people[1] = new Person("Jimin");
        people[2] = new Person("J-Hope");

        //Iterate through the array and print out the name of each person in the array.
        for (Person p : people){
            System.out.println(p.getName()); // Jungkook Jimin J-Hope
        }
        System.out.println("*-*-*-*-*-*-*-*-*"); //separator for clarity between both
        Person jin = new Person("Jin"); //creates a brand new person from the static method above ; public static Person [] addPerson(Person[] array, Person newPerson)
        people = addPerson(people, jin); //takes in people array as well as jin
        for (Person p : people){
            System.out.println(p.getName()); // Jungkook Jimin J-Hope Jin
        }
    }
}
