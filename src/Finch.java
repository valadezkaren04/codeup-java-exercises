public class Finch extends Bird{
    //inherits makeNoise();

    // after super have to override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Tweet tweet"); // Lesser Goldfinch goes Tweet tweet
    }

    public Finch(){
        System.out.println("A Finch just got created");
    }

}
