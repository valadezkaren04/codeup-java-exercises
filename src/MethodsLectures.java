import java.util.Scanner;
public class MethodsLectures {

    public static void sayHello(String name) {
        System.out.printf("Hi there, my name is %s! Have a great day!%n", name);
    }

    public static void sayHello(String salutation, String name) {
        System.out.printf("%s, my name is %s! Have a great day!%n", salutation, name);
    }

    public static void sayHello(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Smooth like butter");
        }
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void willYouTakeUsToMtSplashmore(Scanner sc) {
        System.out.println("Will you take us to Mt. Splashmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYouTakeUsToMtSplashmore(sc);
        } else {
            System.out.println("Thanks Dad, you're the best!");
        }
    }

    public static void bottlesOfBlank(String beverage, int numBottles) {
        if(numBottles == 0) {
            System.out.printf("No more bottles of %s on the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottle of %s on the wall%n", beverage, beverage, beverage);
        } else if (numBottles == 1) {
            System.out.printf("1 bottle of %s on the wall%n1 bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else if (numBottles == 2) {
            System.out.printf("2 bottles of %s on the wall%n2 bottles of %s%nTake 1 down, pass it around%n1 bottle of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake 1 down, pass it around%n%d bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles - 1, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        }
    }
    public static void main(String[] args) {
        sayHello("Karen"); //Hi there, my name is Karen! Have a great day!
        sayHello("Heeyy", "karen"); //Heeyy, my name is karen! Have a great day!
        sayHello(4); //consoles 4 of them

        System.out.println(multiply(5,2)); //10
        int product = multiply(14,24); // 336
        System.out.printf("Did you know that %d * %d = %d?", product, product, product * product); //Did you know that 336 * 336 = 112896?

        Scanner sc = new Scanner(System.in);
        willYouTakeUsToMtSplashmore(sc);

        bottlesOfBlank("Surge", 15);

    }
}


