package Drinks;

import Types.Intensity;

class Coffee extends Drinks{
    public Coffee(String name, Intensity intensity) {
        super(intensity, name);
    }

    @Override

    public void printDrinkDetails(){
        System.out.println(getName() + " intensity: " + getIntensity() + "\n" + "Drink: " + getName() + "\n");
    }
    final public Coffee makeCoffee(){
        super.makeDrink();
        return this;
    }

}
