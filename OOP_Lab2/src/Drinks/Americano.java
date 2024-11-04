package Drinks;

import Types.Intensity;

class Americano extends Drinks {
    int mlOfWater;
    public Americano(String name, Intensity intensity, int mlOfWater) {
        super(intensity, name);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }
    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    @Override

    public void printDrinkDetails(){
        System.out.println(getName() + " intensity: " + getIntensity() + "\n" + "Drink: " + getName() + "\n" + getName() + " milk: " + getMlOfWater() + "\n");
    }
    public final Americano makeAmericano(){
        super.makeDrink();
        System.out.println("ml of Water: " + mlOfWater);
        return this;
    }
}
