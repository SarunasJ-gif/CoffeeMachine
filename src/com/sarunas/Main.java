package com.sarunas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterInMachine = 400;
        int milkInMachine = 540;
        int coffeeInMachine = 120;
        int disposableCups = 9;
        int moneyInMachine = 550;

        boolean works = true;

        while(works) {
            System.out.println("Write actions (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            System.out.println("> " + action);

            int waterOneCup = 0;
            int milkOneCup = 0;
            int coffeeBeansOneCup = 0;
            int cost = 0;
            int oneCup = 1;

            //        int cupsEnoughWater = 0;
            //        int cupsEnoughMilk = 0;
            //        int cupsEnoughCoffee = 0;
            //        int enoughCups = 0;

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String drinkType = scanner.nextLine();
                    System.out.println("> " + drinkType);
                    boolean buy = true;
                    switch (drinkType) {
                        case "1":
                            waterOneCup = 250;
                            coffeeBeansOneCup = 16;
                            cost = 4;
                            //                        cupsEnoughWater = waterInMachine / waterOneCup;
                            //                        cupsEnoughMilk = milkInMachine / 1;
                            //                        cupsEnoughCoffee = coffeeInMachine / coffeeBeansOneCup;
                            //                        enoughCups = disposableCups / oneCup;
                            break;
                        case "2":
                            waterOneCup = 350;
                            milkOneCup = 75;
                            coffeeBeansOneCup = 20;
                            cost = 7;
                            //                        cupsEnoughWater = waterInMachine / waterOneCup;
                            //                        cupsEnoughMilk = milkInMachine / milkOneCup;
                            //                        cupsEnoughCoffee = coffeeInMachine / coffeeBeansOneCup;
                            //                        enoughCups = disposableCups / oneCup;
                            break;
                        case "3":
                            waterOneCup = 200;
                            milkOneCup = 100;
                            coffeeBeansOneCup = 12;
                            cost = 6;
                            //                        cupsEnoughWater = waterInMachine / waterOneCup;
                            //                        cupsEnoughMilk = milkInMachine / milkOneCup;
                            //                        cupsEnoughCoffee = coffeeInMachine / coffeeBeansOneCup;
                            //                        enoughCups = disposableCups / oneCup;
                            break;
                        case "back":
                            buy = false;
                            break;
                        default:
                            System.out.println("It's no options " + drinkType + ". Please enter from 1 to 3 or \"back\"");
                            break;
                    }

                    if (!buy) {
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
                    break;
                //                int inputNeedCupsOfCoffee = 1;
                //
                //                int water = waterInMachine;
                //                int milk = milkInMachine;
                //                int coffee = coffeeInMachine;
                //                int cup = disposableCups;
                //                int cups = 0;
                //                if (cupsEnoughWater <= cupsEnoughMilk && cupsEnoughWater <= cupsEnoughCoffee && cupsEnoughWater <= enoughCups) {
                //                    while (water >= waterOneCup) {
                //                        water -= waterOneCup;
                //                        cups++;
                //                    }
                //                } else if (cupsEnoughMilk <= cupsEnoughWater && cupsEnoughMilk <= cupsEnoughCoffee && cupsEnoughMilk <= enoughCups) {
                //                    while (milk >= milkOneCup) {
                //                        milk -= milkOneCup;
                //                        cups++;
                //                    }
                //                } else if (cupsEnoughCoffee <= cupsEnoughWater && cupsEnoughCoffee <= cupsEnoughMilk && cupsEnoughCoffee <= enoughCups) {
                //                    while (coffee >= coffeeBeansOneCup) {
                //                        coffee -= coffeeBeansOneCup;
                //                        cups++;
                //                    }
                //                } else if (enoughCups <= cupsEnoughWater && enoughCups <= cupsEnoughMilk && enoughCups <= cupsEnoughCoffee) {
                //                    while (cup >= oneCup) {
                //                        cup -= oneCup;
                //                        cups++;
                //                    }
                //                }
                //
                //                if (cups >= inputNeedCupsOfCoffee) {
                //                    waterInMachine -= waterOneCup;
                //                    milkInMachine -= milkOneCup;
                //                    coffeeInMachine -= coffeeBeansOneCup;
                //                    disposableCups -= oneCup;
                //                    moneyInMachine += cost;
                //                } else {
                //                    System.out.println("Machine doesn't work");
                //                }
                //            break;
                //        if (cups == inputNeedCupsOfCoffee) {
                //            System.out.println("Yes, I can make that amount of coffee");
                //        } else if (cups < inputNeedCupsOfCoffee) {
                //            System.out.println("No, I can make only " + cups + " cup(s) of coffee");
                //        } else if (cups > inputNeedCupsOfCoffee) {
                //            int moreThanNeedCups = cups - inputNeedCupsOfCoffee;
                //            System.out.println("Yes, I can make that amount of coffee (and even " + moreThanNeedCups + " more than that)");
                //        }
                case "fill":
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
                    break;
                case "take":
                    System.out.println("I gave you $" + moneyInMachine);
                    moneyInMachine -= moneyInMachine;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(waterInMachine + " ml of water");
                    System.out.println(milkInMachine + " ml of milk");
                    System.out.println(coffeeInMachine + " g of coffee beans");
                    System.out.println(disposableCups + " disposable cups");
                    System.out.println("$" + moneyInMachine + " of money");
                    break;
                case "exit":
                    works = false;
                    break;
                default:
                    System.out.println("there is no such choice as you have chosen");
                    break;
            }
        }
    }
}
