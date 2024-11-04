package main;

import Drinks.Barista;
import Types.Intensity;
import Types.SyrupType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listOfDrinks = getDrinks(sc);

        Barista barista = new Barista(listOfDrinks);
        barista.makeDrink();
    }

    private static ArrayList<String> getDrinks(Scanner sc) {
        ArrayList<String> listOfDrinks = new ArrayList<>(); // Initialize the list outside the loop

        System.out.println("Make your order (type 'exit' to finish):");

        while (true) {
            String input = getInput(sc);
            if (input.equals("exit")) {
                break;
            }
            listOfDrinks.add(input);
        }
        return listOfDrinks;
    }


    public static String getInput(Scanner sc) {
        System.out.print("Your choice(coffee, americano, cappuccino, pumpkinspicelatte, syrupcappuccino): ");
        return sc.nextLine().toLowerCase();
    }
}
