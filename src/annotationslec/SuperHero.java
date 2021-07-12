package annotationslec;

public class SuperHero extends Person {
    private String publicPersona;

    private int age;

    public SuperHero(String firstName, String lastName, String publicPersona, int age) {
        super(firstName, lastName);
        this.publicPersona = publicPersona;
        this.age = age;
    }

    public String getName() {
        return publicPersona;
    }

    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        SuperHero sb = new SuperHero("Dale", "Denverson", "The Shining Boy", 17);
        Person jim = new SuperHero("Jim", "James", "Super Jim", 54);

        System.out.println(sb.getName());
        System.out.println(jim.getName());
    }
}

