public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, it means x is 5");
//        }
//
//        System.out.println("On the other hand, this says nothing about x, because it runs regardless");

//        int y = 14;
//
//        if (y == 2) {
//            System.out.println("The statement 'y == 2' is true.");
//        } else {
//            System.out.println(" 'y == 2' is not true.");
//        }

//        short y = -5;
//        y = 14;
//        y = 32000;
       // y = 33000; can't put an int into a short
//        if (y < 0) {
//            System.out.println("The variable y contains a negative number");
//        } else if (y >= 0 && y < 30000) {
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "chocolate";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One vanilla ice cream cone coming right out.");
//                break;
//            case "chocolate":
//                System.out.println("One chocolate ice cream cone coming right out.");
//                break;
//            case "strawberry":
//                System.out.println("One strawberry ice cream cone coming right out.");
//                break;
//            default:
//                System.out.println("I'm sorry, we don't have that kind, sorry.");
//        }


        //cannot do this
//        String existence = "I exist";
//
//        if (existence) {
//            System.out.println("The programmer is a real being.");
//        }

        boolean existence = true;

        if (existence) {
            System.out.println("The programmer is a real being.");
        }

        /* LOGICAL OPERATORS */
        // you can do && || &

        int c = 0, d = 100, e = 50;

        if (c == 1 && e++ < 100) {
            //do anything
        }
    }
}
