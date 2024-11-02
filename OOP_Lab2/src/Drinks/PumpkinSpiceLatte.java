package Drinks;

import Types.Intensity;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mlOfPumpkinSpice;
    public PumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mlOfPumpkinSpice) {
        super(name, intensity, mlOfMilk);
        this.mlOfPumpkinSpice = mlOfPumpkinSpice;
    }

    public int getMlOfPumpkinSpice() {
        return mlOfPumpkinSpice;
    }
    public void setMlOfPumpkinSpice(int mlOfPumpkinSpice) {
        this.mlOfPumpkinSpice = mlOfPumpkinSpice;
    }

    @Override

    public void printDrinkDetails(){
        System.out.println(getName() + " intensity: " + getIntensity() + "\n" + "Drink: " + getName() + "\n" + getName() + " milk: " + getMlOfMilk() + "\n"  + " Ml Of Pumpkin Spice: " + getMlOfPumpkinSpice() + "\n");
    }
}
