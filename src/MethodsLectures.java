
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


    public static void main(String[] args) {
        sayHello("Karen"); //Hi there, my name is Karen! Have a great day!
        sayHello("Heeyy", "karen"); //Heeyy, my name is karen! Have a great day!
        sayHello(4); //consoles 4 of them

        System.out.println(multiply(5,2)); //10
        int product = multiply(14,24); // 336
        System.out.printf("Did you know that %d * %d = %d?", product, product, product * product); //Did you know that 336 * 336 = 112896?

    }
}
