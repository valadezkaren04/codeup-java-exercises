package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("What is the radius of the circle?");
        Input in = new Input();

        Circle circle = new Circle(in.getDouble()); // return a double, expect a double

        System.out.println(circle.getArea()); // both of these come from Circle.Java
        System.out.println(circle.getCircumference());
    }
}
