package Drinks;

import Types.Intensity;

class Cappuccino extends Drinks{
    int mlOfMilk;
    public Cappuccino(String name, Intensity intensity, int mlOfMilk) {
        super(intensity, name);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }
    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    @Override

    public void printDrinkDetails(){
        System.out.println(getName() + " intensity: " + getIntensity() + "\n" + "Drink: " + getName() + "\n" + getName() + " milk: " + getMlOfMilk() + "\n");
    }

    public final Cappuccino makeCappuccino(){
        super.makeDrink();
        System.out.println("ml of Milk: " + getMlOfMilk());
        return this;
    }
}
