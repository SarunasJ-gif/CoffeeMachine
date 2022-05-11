package com.sarunas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterInMachine = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + waterInMachine);
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkInMachine = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + milkInMachine);
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeInMachine = scanner.nextInt();
        scanner.nextLine();
        System.out.println("> " + coffeeInMachine);
        System.out.println("Write how many cups of coffee you will need: ");
        int inputNeedCupsOfCoffee = scanner.nextInt();
        scanner.nextLine();

        int waterOneCup = 200;
        int milkOneCup = 50;
        int coffeeBeansOneCup = 15;

        int waterNeed = waterOneCup * inputNeedCupsOfCoffee;
        int milkNeed = milkOneCup * inputNeedCupsOfCoffee;
        int coffeeBeansNeed = coffeeBeansOneCup * inputNeedCupsOfCoffee;

//        System.out.println("> " + inputNeedCupsOfCoffee);
//        System.out.println("For " + inputNeedCupsOfCoffee + " cups of coffee you will need:");
//        System.out.println(waterNeed + " ml of water");
//        System.out.println(milkNeed + " ml of milk");
//        System.out.println(coffeeBeansNeed + " g of coffee beans");

        int cupsEnoughWater = waterInMachine / waterOneCup;
        int cupsEnoughMilk = milkInMachine / milkOneCup;
        int cupsEnoughCoffee = coffeeInMachine / coffeeBeansOneCup;

        int cups = 0;
        if (cupsEnoughWater <= cupsEnoughMilk && cupsEnoughWater <= cupsEnoughCoffee) {
            while (waterInMachine >= waterOneCup) {
                waterInMachine -= waterOneCup;
                cups++;
            }
        } else if (cupsEnoughMilk <= cupsEnoughWater && cupsEnoughMilk <= cupsEnoughCoffee) {
            while (milkInMachine >= milkOneCup) {
                milkInMachine -= milkOneCup;
                cups++;
            }
        } else if (cupsEnoughCoffee <= cupsEnoughWater && cupsEnoughCoffee <= cupsEnoughMilk) {
            while (coffeeInMachine >= coffeeBeansOneCup) {
                coffeeInMachine -= coffeeBeansOneCup;
                cups++;
            }
        }

        if (cups == inputNeedCupsOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups < inputNeedCupsOfCoffee) {
            System.out.println("No, I can make only " + cups + " cup(s) of coffee");
        } else if (cups > inputNeedCupsOfCoffee) {
            int moreThanNeedCups = cups - inputNeedCupsOfCoffee;
            System.out.println("Yes, I can make that amount of coffee (and even " + moreThanNeedCups + " more than that)");
        }
    }
}
