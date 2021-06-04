public class BirdTest {
    public static void main(String[] args) {
        Bird cardinal = new Bird(); // bird gets created ; knows that it's Bird class because it is within the same package
        cardinal.setName("Cardinal");
        cardinal.setCanFly(true);
        cardinal.makeNoise(); // Tweet tweet
        cardinal.move(); // Flap flap

        Duck mallard = new Duck();
        //declare a reference: Duck mallard ;  assigned: =   ;  call the default constructor: new Duck()
        mallard.setName("Mallard");
        mallard.makeNoise(); // Tweet tweet without no code in Duc class

        Finch lesserGoldFinch = new Finch();
        lesserGoldFinch.setName("Lesser Goldfinch");
        lesserGoldFinch.makeNoise(); // Tweet tweet

        Penguin penguin = new Penguin();
        penguin.setName("Emperor Penguin");
        penguin.move(); // Emperor Penguin goes waddle waddle
        penguin.makeNoise(); // Emperor Penguin goes honk honk!

        // Polymorphism allows us to have different reference and object types
        //Bird myPenguin = new Penguin();

        //Finch houseFinch = new Finch();
        Bird piratesBestFriend = new Bird();
        System.out.println(piratesBestFriend.getName());

        Finch cassinsFinch = new Finch("Cassin's Finch", true);
        System.out.println(cassinsFinch.getName());

    }
}
