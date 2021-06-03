public class ServerNameGenerator {
    private static String[] adj = {"radical", "gnarly", "amused", "brainy", "energetic", "fragile", "glamorous", "hilarious", "mushy", "zany"};
    private static String[] noun = {"balloon", "rainbow", "rain", "rocket", "lighter", "yacht", "sandwich", "scooter", "army", "pillow"};

    //creates a method that returns a random element from an array of strings
    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length); //cast the value
        return strings[randomNum];
    }

    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static String makeServerName (String[] arr1, String[] arr2) {
        String adj = randomElement(arr1); // makes use of the first array
        String noun = randomElement(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Your new server name is: ");
        System.out.println(makeServerName(adj,noun)); // random names such as: mushy-sandwhich
    }


}
