package main;

import Drinks.Barista;
import Drinks.*;
import Types.Intensity;
import Types.SyrupType;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listOfDrinks = new ArrayList<>(Arrays.asList("coffee", "americano", "cappuccino", "pumpkinspicelatte", "syrupcappuccino"));
        Barista barista = new Barista(listOfDrinks);
        barista.display();
        barista.makeDrink();
    }
}