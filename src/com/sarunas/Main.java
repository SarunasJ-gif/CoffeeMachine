package com.sarunas;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        boolean works = true;
        while (works) {
            System.out.println("Write actions (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("exit")) {
                break;
            } else {
                CoffeeMachine.insert(action);
            }
        }
    }
}
