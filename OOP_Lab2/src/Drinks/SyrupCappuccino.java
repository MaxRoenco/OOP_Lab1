package Drinks;


import Types.Intensity;
import Types.SyrupType;

public class SyrupCappuccino  extends Cappuccino {
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
}
