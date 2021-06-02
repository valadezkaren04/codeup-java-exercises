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

    public Person(String name){
        this.name = name;
    }

    public Person(){}

    public static void main(String[] args) {
        Person p1Test = new Person("karen");
        System.out.println(p1Test.getName()); // karen
        p1Test.setName("Jimin"); // changes name to Jimin
        System.out.println("My new name is: " + p1Test.getName()); //My new name is: Jimin
        p1Test.sayHello(); // Hello, Jimin

        /*--- Understanding references ---*/

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true ; uses the equals method which allows it to compare string values.
//        System.out.println(person1 == person2); // false ; can't compare two string within objcts

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true ; the comparison is made on objects that are the exact same


        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); // John
        System.out.println(person2.getName()); // John ; person 2 is equal to person 1
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane ; changing the name also impacts person 1's name
    }
}

