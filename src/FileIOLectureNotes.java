import java.io.IOException;
// IO : Input output ^^ old way
import java.nio.file.*;
// series of method that has to do with input and output in the new io
// * = wild card - everything in the file
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLectureNotes {
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
            Files.write(toOurDataFile, romanEmpresses);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }



    }
}
