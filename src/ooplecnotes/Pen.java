package ooplecnotes;

public class Pen {

    //decribe the pen
    String type = "gel";
    String color = "blue";
    int point = 10;


    //describe actions
    static boolean clicked = false;
    public static void click() {
        clicked = true;
    }
    public static void unclick() {
        clicked = false;
    }
}
