public class Penguin extends Bird{
    //override MakeNoise()
    public void makeNoise() {
        System.out.println(this.getName() + " goes honk honk!");

    }

    // override move()
    public void move() {
        System.out.println(this.getName() + " goes waddle waddle");
    }

}
