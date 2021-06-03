public class ServerNameGenerator {
    private static String[] adj = {"radical", "gnarly", "amused", "brainy", "energetic", "fragile", "glamorous", "hilarious", "mushy", "zany"};
    private static String[] noun = {"balloon", "rainbow", "rain", "rocket", "lighter", "yacht", "sandwich", "scooter", "army", "pillow"};

    //creates a method that returns a random element from an array of strings
    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }


}
