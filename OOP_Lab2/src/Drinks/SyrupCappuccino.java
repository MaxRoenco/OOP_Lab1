package Drinks;


import Types.Intensity;
import Types.SyrupType;

class SyrupCappuccino  extends Cappuccino {
    private SyrupType syrup;
    public SyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(name, intensity, mlOfMilk);
        this.syrup = syrup;
    }
    public SyrupType getSyrup() {
        return syrup;
    }
    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override

    public void printDrinkDetails(){
        System.out.println(getName() + " intensity: " + getIntensity() + "\n" + "Drink: " + getName() + "\n" + getName() + " milk: " + getMlOfMilk() + "\n" + getName() + " Syrup Type " + getSyrup() + "\n");
    }

    public final SyrupCappuccino makeSyrupCappuccino(){
        super.makeDrink();
        System.out.println("Syrup: " + getSyrup());
        return this;
    }
}
