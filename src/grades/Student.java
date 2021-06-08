package grades;
import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for( int grade : grades) {
            total = total + grade;
        }
        return total / grades.size();
    }

    public static void main(String[] args) {
        Student testStudent = new Student("Karen");
        testStudent.addGrade(84);
        testStudent.addGrade(99);
        testStudent.addGrade(92);
        System.out.println(testStudent.getName());
        System.out.println("The average is " + testStudent.getGradeAverage());
    }
}
