package shapes;

public class Square extends Rectangle{

    //this is "the side variable"
    private double side;

    //pass the variable of "side" to the parent class constructor.
    public Square(double side){
        super(side, side);
        //set "the side variable" equal to whats being passed into the Constructor
        this.side = side;
    }
    //by calling super() we can access the original public Rectangle constructor/method we created
    //However this method requires two arguments: length and width so we have to set those values equal to something or the code wont run.
    //we can do this by calling "side" twice to fill the values for Length & width.

    @Override
    public double getPerimeter() {
        System.out.println("This is overridden");
        return 4 * side;
    }

    @Override
    public double getArea() {
        System.out.println("This is overridden");
        return side * side;
    }
}




//package shapes;
//
//public class Square extends Rectangle{
//    public Square(double side) {
//        super(side, side); //sets both arguments from the constructor (length/width)
//        this.side = side;
//    }
//
//    private double side; // if not set, it won't run, default will come in
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//    public double getArea() {
//        this.setSide(this.getWidth());
//        return this.getSide() * this.getSide(); // Perimeter: 18.0. Area: 25.0
//    }
//
//    public double getPerimeter() {
//        this.setSide(this.getWidth());
//        return 4 * this.getSide();
//    }
//
//}
