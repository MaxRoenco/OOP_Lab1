package main;

import Drinks.*;
import Types.Intensity;
import Types.SyrupType;

public class Main {
    public static void main(String[] args) {
        Intensity[] intensities = Intensity.values();
        SyrupType[] syrupTypes = SyrupType.values();


        Americano americano = new Americano("Americano", intensities[0], 10);
        Cappuccino cappuccino = new Cappuccino("Cappuccinno", intensities[0], 10);
        Coffee coffee = new Coffee("Coffee", intensities[2]);
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte("Pumpkin Spice Latte", intensities[1], 20, 10);
        SyrupCappuccino SyrupCappuccino = new SyrupCappuccino("Syrup Cappuccino", intensities[0], 10, syrupTypes[1]);


        System.out.println(americano.getName());
        System.out.println(cappuccino.getName());
        System.out.println(coffee.getName());
        System.out.println(pumpkinSpiceLatte.getIntensity());
        System.out.println(SyrupCappuccino.getSyrup());

    }
}