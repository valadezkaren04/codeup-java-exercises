import java.io.IOException;
// IO : Input output ^^ old way
import java.nio.file.*;
// series of method that has to do with input and output in the new io
// * = wild card - everything in the file

public class FileIOLectureNotes {
    public static void main(String[] args) {
        //path obj represents a file on the system
        // this constructs a java representation of it (using Path)
//        Path path = Paths.get("src"); // src ; not a string
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath()); // /Users/av/IdeaProjects/codeup-java-exercises/src ; gives you the the path (where it came from)

        Path path = Paths.get("src", "FileIOLectureNotes.java");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

    }
}
