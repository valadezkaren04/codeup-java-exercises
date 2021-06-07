package shapes;
import util.Input;

//public class CircleApp {
//    public static void main(String[] args) {
//        // Created a private static int variable to keep track of the circles being created, starting at 0.
//        private static int count = 0;
//
//        // TODO: **BONUS**
//        // Adding a counter method to keep track of the circles being created.
//        public static int counting(String message, int count) {
//            System.out.println(message + count);
//            return count;
//        }
//        // TODO: Continue creating circles and displaying information about them until the user says they to do not want to continue.
//        // Here we will use a do-while loop to create the looping behavior of creating circles.
//        public static void circleCounter() {
//            boolean confirmation;
//            do {
//                Input userInput = new Input();
//                double radius = userInput.getDouble("Type in a radius for your circle: ");
//                Circle circle1 = new Circle(radius);
//                System.out.println("Your circle radius is " + radius);
//                System.out.println("The area of your circle is " + circle1.getArea());
//                System.out.println("The circumference of your circle is " + circle1.getCircumference());
//
//                // After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another.
//                confirmation = userInput.yesNo("Create another circle? ");
//                // Increment the count at the end since a circle has been created.
//                count++;
//            } while (confirmation);
//            // After the user has exited the loop, report how many circles have been created.
//            counting("Amount of circles you have created: ", count);
//        }
//
//        public static void main(String[] args) {
//        System.out.println("What is the radius of said circle?");
//        Input in = new Input();
//
//        // longer, more explicit way.
////        double userRadius = in.getDouble();
//        // then plug this variable into the constructor to instantiate a new Circle object.
////        Circle c = new circle(userRadius);
//
//        Circle c = new Circle(in.getDouble());
//
//        System.out.println(c.getArea());
//        System.out.println(c.getCircumference());
//
//            // TODO: **BONUS**
//            circleCounter();
//        }
//    }
//}
