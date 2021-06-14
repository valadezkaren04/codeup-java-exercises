package GroceryApp;

import util.Input;

import java.sql.SQLOutput;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class GroceryAppTest extends Input {
//
//    public static void addToList(HashMap<String, ArrayList<Groceries>> list, Input in) {
//        System.out.println("Please select a section: ");
//        int num = 1;
//        for (String section : list.keySet()) {
//            System.out.printf("%d: %s%n", num, section);
//            num++;
//        }
//        String selectSection = "";
//        while (!list.containsKey(selectSection))
//            selectSection
//    }
//
//    public static void printList(HashMap<String, ArrayList<Groceries>> list) {
//        System.out.println("Your list: \n");
//        int allSections = 0;
//        for (HashMap.Entry<String, ArrayList<Groceries>> pair : list.entrySet()) {
//            if (!pair.getValue().isEmpty()) {
//                allSections++;
//                System.out.printf("%s \n", pair.getKey());
//                for (Groceries item ; pair.getValue()) {
//                    if (item.getQuantity() > 1) {
//                        System.out.printf(" %s, %d, $%.2f each, $%.2f total%n", item.getName(), item.getQuantity(), item.getPrice(), (item.getQuantity() * item.getPrice()));
//                    } else {
//                        System.out.printf(" %s. $%.2f%n", item.getName(), item.getPrice());
//                    }
//                }
//                System.out.println();
//            }
//        }
//        if (allSections == 0) {
//            System.out.println("\nList is empty. \n Please add items to your list");
//        }
//    }
//
//    public static void runTheApp(HashMap<String, ArrayList<Groceries>> list, Input in) {
//        System.out.println("Welcome to BT21 Market\n");
//        System.out.println("*************************");
//
//        boolean run = true;
//        while(run) {
//            System.out.println("Please make your selection");
//            System.out.println("1. Add new item to the list");
//            System.out.println("2. View list");
//            System.out.println("3. Exit");

//            int userInput = in.getInt("Please enter: 1, 2, or 3", 1, 3);
//            in.getString();
//
//            switch (userInput) {
//                case 1:
//                    addToList(list, in);
//                    System.out.println("Returning to the menu...\n");
//                    break;
//                case 2:
//                    printList(list);
//                    System.out.println("Returning to the menu...\n");
//                    break;
//                case 3:
//                    System.out.println("Are you sure you want to exit?");
//                    if (in.yesNo()) {
//                        System.out.println("Thank you for choosing BT21! Come again soon n.n");
//                        run = false;
//                    } else {
//                        System.out.println("Returning to the menu...\n");
//                    }
//            }
//        }
//    }
//}
