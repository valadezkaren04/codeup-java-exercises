package shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5.0, 4.0);
        System.out.println("Rectangle perimeter: " + box1.getPerimeter());
        System.out.println("Rectangle area: " + box1.getArea());

        Rectangle box2 = new Square(5.0);
        System.out.println("Square perimeter: " + box2.getPerimeter());
        System.out.println("Square area: " + box2.getArea());
    }
}
