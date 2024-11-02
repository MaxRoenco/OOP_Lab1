package Drinks;

import Types.Intensity;

public class Drinks {
    private Intensity intensity;
    private String name;

    public Drinks(Intensity intensity, String name) {
        this.intensity = intensity;
        this.name = name;
    }

    public Intensity getIntensity() {
        return intensity;
    }
    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void printDrinkDetails() {

    }
}
