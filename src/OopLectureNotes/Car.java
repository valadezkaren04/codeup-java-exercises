package OopLectureNotes;

import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner(System.in);
    public String model;
    public int year;
    public String color;
    public void run() {
        System.out.println("The car is running.");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);


        System.out.println(car1.model);

        Car car2 = new Car();

        car2.color = "Blue";
        car2.year = 2021;
        car2.model = "Kia Forte";
        car2.run();

        System.out.println(car2.color);

    }
}
