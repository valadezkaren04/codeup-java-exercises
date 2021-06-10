import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
// IO : Input output ^^ old way
import java.nio.file.*;
// series of method that has to do with input and output in the new io
// * = wild card - everything in the file
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureNotes {

    public void readFileAndOutput (Path pathToFile) {
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String line : currentList) {
            System.out.println(line);
        }
    }

    // main method = runs code
    public static void main(String[] args) {
        //path obj represents a file on the system
        // this constructs a java representation of it (using Path)
//        Path path = Paths.get("src"); // src ; not a string
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath()); // /Users/av/IdeaProjects/codeup-java-exercises/src ; gives you the the path (where it came from)

//        Path path = Paths.get("src", "FileIOLectureNotes.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path pathToSrc = Paths.get("src"); //represent a path obj that represents src
//        System.out.println(pathToSrc);
//        Path wontWort = Paths.get(pathToSrc, "FileIOLectureNotes.java"); // needs to be a string

        // creates directory
        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);

        try {
            if (Files.notExists(toOurDataPlace)) {
                Files.createDirectories(toOurDataPlace);
            } else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
            Files.createDirectories(toOurDataPlace);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace));

        try {
            if (Files.notExists(toOurDataFile)) {
                Files.createFile(toOurDataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        // Write to a file
        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messalina", "Julia Domna");

        try {
            // 2 arguments for Files.write
            // The path to our file, the data we want to write
            Files.write(toOurDataFile, romanEmpresses);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        // Read from a file

        // create a place to put information we read from the file
//        List<String> currentList = new ArrayList<>();
//
//        // read the information from the file
//        try {
//            currentList = Files.readAllLines(toOurDataFile);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        // loop through the ArrayList and output each item
//        for (String line : currentList) {
//            System.out.println(line); // Livia Agrippina Messalina Julia Domna
//        }

        // commented ^Read from a file^ out due to putting it in a method

        //

        FileIOLectureNotes io = new FileIOLectureNotes(); // creating a new FileIOLec..
        io.readFileAndOutput(toOurDataFile); // instantiation

        /**Can someone explain what the difference between a static and non static method is?
         Do static methods allow you to call them without creating an object first while non
         static method require an object to be made?

         Static methods are generalized methods that are independent of object instantiation.
         * You have to refer to the class name like we saw
         * Javier demo (“FileIOLection.readFileAndOutput()”).
         * Non-static methods (Instance Methods) are methods that can be accessed once
         * an object has been instantiated from the class using the “new” keyword.*/

        // Append a single item to our list

        try {
            Files.writeString(toOurDataFile, "Julia Maesa\n", StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);

        // Append a list to a list

        List<String> lateRomanEmpresses = new ArrayList<>();
        lateRomanEmpresses.add("Galla Placidia");
        lateRomanEmpresses.add("Theodara");
        lateRomanEmpresses.add("Licinia Eudoxia");

        try {
            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);

        //



    }
}
