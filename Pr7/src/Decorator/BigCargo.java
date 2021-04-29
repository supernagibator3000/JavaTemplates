package Decorator;

public class BigCargo implements Smth{
    LightCargo lightCargo;

    public BigCargo(LightCargo lightCargo){
        this.lightCargo = lightCargo;
    }

    @Override
    public int getWeight() {
        return lightCargo.getWeight() + 100;
    }
}
