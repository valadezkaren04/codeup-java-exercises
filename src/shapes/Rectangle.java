package shapes;

//public class Rectangle {

//    //it should have protected properties for both length and width.
//    protected double length;
//    protected double width;
//
//    // Getters and Setters
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    // default constructor
//    public Rectangle() {
//
//    }
//
//    //Rectangle should define a constructor that accepts two numbers for length and width, and sets
//    //those properties ; constructor
//    public Rectangle(double length, double width) {
//        this.setLength(length);
//        this.setWidth(width);
//    }
//
//    public double getArea() {
//        return this.getLength() * this.getWidth();
//    }
//
//    public double getPerimeter() {
//        return (2 * this.getLength() + (2 * this.getWidth()));
//    }

    // second exercise
    public class Rectangle extends Quadrilateral implements Measurable {

        public Rectangle(double length, double width) {
            super(length, width);
        }

        @Override
        public double getPerimeter() {
            return (length * 2) + (width * 2);
        }

        @Override
        public double getArea() {
            return length * width;
        }

        @Override
        public void setLength(double length) {

        }

        @Override
        public void setWidth(double width) {

        }
    }
