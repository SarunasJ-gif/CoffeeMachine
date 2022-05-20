package com.sarunas;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner scanner = new Scanner(System.in);

    public static int waterInMachine = 400;
    public static int milkInMachine = 540;
    public static int coffeeInMachine = 120;
    public static int disposableCups = 9;
    public static int moneyInMachine = 550;

    public static int waterOneCup = 0;
    public static int milkOneCup = 0;
    public static int coffeeBeansOneCup = 0;
    public static int cost = 0;
    public static int oneCup = 1;

    public static void insert(String action) {
        System.out.println("> " + action);
        switch (action) {
            case "buy":
                buy();
                break;

            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            default:
                System.out.println("there is no such choice as you have chosen");
                break;
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String drinkType = scanner.nextLine();
        System.out.println("> " + drinkType);
        switch (drinkType) {
            case "1":
                expresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            case "back":
                return;
            default:
                System.out.println("It's no options " + drinkType + ". Please enter from 1 to 3 or \"back\"");
                break;
        }
        if (waterInMachine < waterOneCup) {
            System.out.println("Sorry, not enough water!");
        } else if (milkInMachine < milkOneCup) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeInMachine < coffeeBeansOneCup) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            waterInMachine -= waterOneCup;
            milkInMachine -= milkOneCup;
            coffeeInMachine -= coffeeBeansOneCup;
            disposableCups -= oneCup;
            moneyInMachine += cost;
        }
    }

    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int waterToAdd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + waterToAdd);
        waterInMachine += waterToAdd;
        System.out.println("Write how many ml of milk you want to add:");
        int milkToAdd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + milkToAdd);
        milkInMachine += milkToAdd;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeToAdd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + coffeeToAdd);
        coffeeInMachine += coffeeToAdd;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsToAdd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + cupsToAdd);
        disposableCups += cupsToAdd;
    }

    public static void take() {
        System.out.println("I gave you $" + moneyInMachine);
        moneyInMachine -= moneyInMachine;
    }

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInMachine + " ml of water");
        System.out.println(milkInMachine + " ml of milk");
        System.out.println(coffeeInMachine + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + moneyInMachine + " of money");
    }

    public static void expresso() {
        waterOneCup = 250;
        coffeeBeansOneCup = 16;
        cost = 4;
    }

    public static void latte() {
        waterOneCup = 350;
        milkOneCup = 75;
        coffeeBeansOneCup = 20;
        cost = 7;
    }

    public static void cappuccino() {
        waterOneCup = 200;
        milkOneCup = 100;
        coffeeBeansOneCup = 12;
        cost = 6;
    }
}
