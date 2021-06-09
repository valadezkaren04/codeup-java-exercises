public class ExceptionStudyTest {
    public static void main(String[] args) {
        //ExceptionStudy study = new ExceptionStudy(); //extanciates the class
//        System.out.println(study.definitelyNotAnInteger); //Nope. I'm not an integer, I'm a String.
//        System.out.println(study.maybeAnInteger); // 42
//        System.out.println(Integer.parseInt(study.definitelyNotAnInteger)); // exception
//        System.out.println(Integer.parseInt(study.maybeAnInteger)); // exception

        // tries out the errors ; risky because it has an exception. Catches it before it can fail
//        try {
//            ExceptionStudy study = new ExceptionStudy();
//            System.out.println(Integer.parseInt(study.definitelyNotAnInteger)); // exception
//            System.out.println(Integer.parseInt(study.maybeAnInteger)); // exception
//        } catch (NumberFormatException e) {
//            System.out.println("Woah! o.O, that is not an integer...");
//            System.out.println("I got an exception: " + e); // returns back what the exception is
//            e.printStackTrace(); // traces the exception
//        }

        //AskingForAnInteger method ; runs it
        ExceptionStudy study = new ExceptionStudy();
        study.askForAnInterger();

        // runs the method
        study.moreComplexInt();

        try {
            study.echoWordCustomEx();
        } catch (CusswordException ce){
            System.out.println("How rude! >.<");
            System.out.println(ce.getMessage());
        }

    }
}
