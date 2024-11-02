package Drinks;

import Types.Intensity;

public class Americano extends Drinks {
    int mlOfWater;
    public Americano(String name, Intensity intensity, int mlOfWater) {
        super(intensity, name);
        this.mlOfWater = mlOfWater;
    }
}
