public class Person {

    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }

/* The class should have a constructor that accepts a `String` value and sets
 * the person's name to the passed string. */
    public Person(String name){
        this.name = name;
    }

    public Person(){}

/* Create a `main` method on the class that creates a new `Person` object and
 * tests the above methods. */
    public static void main(String[] args) {
        Person p1Test = new Person("karen"); // testing constructor
        System.out.println(p1Test.getName()); // karen
        p1Test.setName("Jimin"); // changes name to Jimin
        System.out.println("My new name is: " + p1Test.getName()); //My new name is: Jimin
        p1Test.sayHello(); // Hello, Jimin

        /*--- Understanding references ---*/

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true ; uses the equals method which allows it to compare string values.
//        System.out.println(person1 == person2); // false ; can't compare two string within objects

//        Person person1 = new Person("John");
//        Person person2 = person1; // creates a copy of it...ex: catfishing, "Like if I was cat fishing somebody, me person1 is pretending to be person2, but I’m really person1 too." -Bianca's example
//        System.out.println(person1 == person2); // true ; the comparison is made on objects that are the exact same


        Person person1 = new Person("John");
        Person person2 = person1; //person 2 is person 1
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John ; person 2 is equal to person 1
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane ; changing the name also impacts person 1's name (same object)
    }
}

