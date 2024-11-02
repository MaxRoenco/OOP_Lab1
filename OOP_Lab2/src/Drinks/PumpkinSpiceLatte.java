package Drinks;

import Types.Intensity;

public class PumpkinSpiceLatte extends Cappuccino {
    private int mlOfPumpkinSpice;
    public PumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mlOfPumpkinSpice) {
        super(name, intensity, mlOfMilk);
        this.mlOfPumpkinSpice = mlOfPumpkinSpice;
    }
}
