package ooplecnotes;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen(); // no need to import b.c it's in the same folder

        System.out.println(p.color); // blue
        System.out.println(p.point); // 10
        System.out.println(p.type); // gel

        // is it clicked?
        System.out.println(Pen.clicked); // the pen is unclicked there for clicked is: false
        Pen.click(); // the pen is now clicked
        System.out.println(Pen.clicked); // true


    }
}
