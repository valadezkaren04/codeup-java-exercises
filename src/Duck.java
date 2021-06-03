
public class Duck extends Bird { //inherits all the instance var and methods of the Bird class
    //Duck inherits all public methods from Bird class

    //lets override a method
    //overrides makeNoise()
//    public void makeNoise(){
//        System.out.println(this.getName() + " goes Quack quack!"); // Mallard goes Quack quack!
//    }

    /*-- using super --*/
    // Duck is a sub class
    // When overriding you have to fulfill the protocol
    // The arguments must be the same, and return types compatible
    //
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Quack quack!"); // Mallard goes Quack quack!
    }


}
