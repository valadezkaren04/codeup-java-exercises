import java.util.Scanner;

//Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey, my name's Bob...What do you want?...stop bothering me..");
        String reply = "";
        while (!reply.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want?");
            reply = scanner.nextLine();
            if (reply.isEmpty()) {
                System.out.println("Ugh, k");
            } else if (reply.endsWith("?")) {
                System.out.println("Uh huh, sure");
            } else if (reply.endsWith("!")) {
                System.out.println("...yo, chill. Turn it down a few notches.");
            } else {
                System.out.println("...yeah, whatever.");
            }
        }
        System.out.println("...k, see ya.");
    }
}
