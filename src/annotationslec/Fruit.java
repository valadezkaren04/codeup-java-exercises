package annotationslec;

//Deprecated is used for an application that is due for an update
public class Fruit implements Food{
    private String flavor;

    @Deprecated
    private boolean hasFlesh;

    private boolean eatableSeeds;

    // overrides
    @Override
    public String taste() {
        return this.flavor;
    }

//    public void tasteBitter() {
//        System.out.println("Look at them run away!");
//    }

    public static void main(String[] args) {
        Fruit lime = new Fruit();
//        lime.tasteBitter(); // part of the tasteBitter method
        lime.flavor = "sour";
        System.out.println(lime.taste());
    }


}
