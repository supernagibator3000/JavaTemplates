package Decorator;

public class LightCargo implements Smth{
    private int weight = 50;

    @Override
    public int getWeight() {
        return weight;
    }
}
