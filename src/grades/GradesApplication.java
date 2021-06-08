package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradesApplication {
    public static String getStudentInfo( ArrayList<String> list, HashMap <String, Student> students){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What student would you like to see more information on?");
        String studentInput = scanner.nextLine();
        if (!list.contains(studentInput)) {
            System.out.println("Sorry, no student found with the Github username of: " + " \"" + studentInput + "\"\n");
            System.out.println("Would you like to see another student? (Y/N)");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")){
                getStudentInfo(list, students);
            }
        } else {
            System.out.println("Name: " + students.get(studentInput).getName() + "- " + "Github Username: " + studentInput);
            System.out.println("Current Average: " + students.get(studentInput).getGradeAverage());
        }
        System.out.println("Would you like to see another student? (Y/N)");
        String userContinue = scanner.nextLine();
        if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")){
            getStudentInfo(list, students);
        }
        return studentInput;
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Karen");
        Student student2 = new Student("Jimin");
        Student student3 = new Student("Namjoon");
        Student student4 = new Student("Yoongi");


        student1.addGrade(98);
        student1.addGrade(83);
        student1.addGrade(100);

        student2.addGrade(75);
        student2.addGrade(94);
        student2.addGrade(80);

        student3.addGrade(97);
        student3.addGrade(90);
        student3.addGrade(65);

        student4.addGrade(99);
        student4.addGrade(89);
        student4.addGrade(79);

        students.put("ValadezKaren04", student1);
        students.put("Chimmy95", student2);
        students.put("Koya92", student3);
        students.put("Shooky94", student4);

        Set<String> keySet = students.keySet();

        ArrayList<String> usernameList = new ArrayList<>(keySet);

//      INTERFACE
        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students:");
        for (String username : usernameList){
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");
        getStudentInfo(usernameList, students);
    }
}

