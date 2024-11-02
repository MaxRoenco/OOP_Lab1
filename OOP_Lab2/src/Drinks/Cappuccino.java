package Drinks;

import Types.Intensity;

public class Cappuccino extends Drinks{
    int mlOfMilk;
    public Cappuccino(String name, Intensity intensity, int mlOfMilk) {
        super(intensity, name);
        this.mlOfMilk = mlOfMilk;
    }
}
