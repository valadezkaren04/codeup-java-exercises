package ooplecnotes;

public class Headphones {
    String charge = "Micro USB";
    String[] controls = {"power", "volume", "skip", "play/pause"}; // the controls have an array of things it can do
    String color = "red/black";

    //sets the starting point of obj
    static boolean power = false;
    static int volume = 0;

    // describing the actions
    public static void powerOn() {
       power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp() {
        volume++; // each time the button is pressed, it will increment the volume
    }

    public static void volumeDown() {
        volume--; // each time the button is pressed, it will decrement the volume
    }
    /**In real life, the microchip within the headphones call for the methods and that is what makes the buttons react. Keeps track of the different states. */


}
