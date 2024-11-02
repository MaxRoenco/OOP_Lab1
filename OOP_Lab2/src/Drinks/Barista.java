package Drinks;

import Types.Intensity;
import Types.SyrupType;

import java.util.List;

public class Barista {
    private List<String> arrayOfDrinks;

    Intensity[] intensities = Intensity.values();
    SyrupType[] syrupTypes = SyrupType.values();

    Americano americano = new Americano("Americano", intensities[0], 10);
    Cappuccino cappuccino = new Cappuccino("Cappuccinno", intensities[0], 10);
    Coffee coffee = new Coffee("Coffee", intensities[2]);
    PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte("Pumpkin Spice Latte", intensities[1], 20, 10);
    SyrupCappuccino syrupCappuccino = new SyrupCappuccino("Syrup Cappuccino", intensities[0], 10, syrupTypes[1]);


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
        for(String drink : this.arrayOfDrinks) {
            switch (drink){
                case "coffee":
                    coffee.printDrinkDetails();
                    break;
                case "cappuccino":
                    cappuccino.printDrinkDetails();
                    break;
                case "americano":
                    americano.printDrinkDetails();
                    break;
                case "pumpkinspicelatte":
                    pumpkinSpiceLatte.printDrinkDetails();
                    break;
                case "syrupcappuccino":
                    syrupCappuccino.printDrinkDetails();
                    break;
                default:
                    break;
            }
        }
    }

    public void display() {
        for (String drink : arrayOfDrinks) {
            System.out.println(drink);
        }
    }
}
