package Drinks;

import Types.Intensity;
import Types.SyrupType;

import java.util.List;
import java.util.Scanner;

public class Barista {
    private List<String> arrayOfDrinks;
    Scanner sc = new Scanner(System.in);
    Intensity[] intensities = Intensity.values();
    SyrupType[] syrupTypes = SyrupType.values();

    public Barista(List<String> arrayOfDrinks) {
        this.arrayOfDrinks = arrayOfDrinks;
    }

    public List<String> getArrayOfDrinks() {
        return arrayOfDrinks;
    }

    public void setArrayOfDrinks(List<String> arrayOfDrinks) {
        this.arrayOfDrinks = arrayOfDrinks;
    }

    public void addDrink(String drink) {
        this.arrayOfDrinks.add(drink);
    }

    public void removeDrink(String drink) {
        this.arrayOfDrinks.remove(drink);
    }

    public void makeDrink() {
        for (String drink : this.arrayOfDrinks) {
            switch (drink.toLowerCase()) {
                case "coffee":
                    Coffee coffee = new Coffee("Coffee", getIntensity(sc));
                    coffee.makeCoffee();
                    break;
                case "cappuccino":
                    Cappuccino cappuccino = new Cappuccino("Cappuccino", getIntensity(sc), getMlOfMilk(sc));
                    cappuccino.makeCappuccino();
                    break;
                case "americano":
                    Americano americano = new Americano("Americano", getIntensity(sc), getMlOfWater(sc));
                    americano.makeAmericano();
                    break;
                case "pumpkinspicelatte":
                    PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte("Pumpkin Spice Latte", getIntensity(sc), getMlOfMilk(sc), getMlOfPumpkinSpice(sc));
                    pumpkinSpiceLatte.makePumpkinSpiceLatte();
                    break;
                case "syrupcappuccino":
                    SyrupCappuccino syrupCappuccino = new SyrupCappuccino("Syrup Cappuccino", getIntensity(sc), getMlOfMilk(sc), getSyrupType(sc));
                    syrupCappuccino.makeSyrupCappuccino();
                    break;
                default:
                    System.out.println("Invalid drink: " + drink);
                    break;
            }
        }
    }

    public Intensity getIntensity(Scanner sc) {
        System.out.print("Enter Intensity (light, normal, strong): ");
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "light":
                return Intensity.LIGHT;
            case "normal":
                return Intensity.NORMAL;
            case "strong":
                return Intensity.STRONG;
            default:
                System.out.println("Invalid Intensity. Defaulting to NORMAL.");
                return Intensity.NORMAL;
        }
    }

    public SyrupType getSyrupType(Scanner sc) {
        System.out.print("Enter SyrupType (macadamia, vanilla, coconut, caramel, chocolate, popcorn): ");
        String input = sc.nextLine().toLowerCase();
        switch (input) {
            case "macadamia":
                return SyrupType.MACADAMIA;
            case "vanilla":
                return SyrupType.VANILLA;
            case "coconut":
                return SyrupType.COCONUT;
            case "caramel":
                return SyrupType.CARAMEL;
            case "chocolate":
                return SyrupType.CHOCOLATE;
            case "popcorn":
                return SyrupType.POPCORN;
            default:
                System.out.println("Invalid SyrupType. Defaulting to NONE.");
                return null;
        }
    }

    public int getMlOfWater(Scanner sc) {
        System.out.print("Enter ml of water: ");
        int water = sc.nextInt();
        sc.nextLine();
        return water;
    }

    public int getMlOfMilk(Scanner sc) {
        System.out.print("Enter ml of milk: ");
        int milk = sc.nextInt();
        sc.nextLine();
        return milk;
    }

    public int getMlOfPumpkinSpice(Scanner sc) {
        System.out.print("Enter ml of Pumpkin Spice: ");
        int pumpkinSpice = sc.nextInt();
        sc.nextLine();
        return pumpkinSpice;
    }

    public void display() {
        for (String drink : arrayOfDrinks) {
            System.out.println(drink);
        }
    }
}
