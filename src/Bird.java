// Bird is the super class
public class Bird {

    // can it fly?
    private boolean canFly;

    //getters and setters
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    // what kind of bird?
    public String name;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // make sure this is not an integer...
        // make sure user is logged in
        this.name = name;
    }

    public void makeNoise() {

        System.out.println(this.getName() + " goes ");
    }

    public void move() {
        System.out.println("Flap flap");
    }

    public Bird() {
        //constructor creates a new object
        System.out.println("A Bird Just Got Created");
        this.canFly = true;
        this.name = "Parrot";
    }

    public Bird(String nameOfThisBird, boolean itCanFly){
        this.name = nameOfThisBird;
        this.canFly = itCanFly;
    }

}
//write notes down from curriculum