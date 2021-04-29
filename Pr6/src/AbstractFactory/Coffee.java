package AbstractFactory;

public class Coffee {
    String typeOfCoffee;
    boolean sugar;

    public Coffee(String typeOfCoffee){
        this.typeOfCoffee = typeOfCoffee;
    }

    public Coffee withSugar(boolean sugar){
        this.sugar = sugar;
        return this;
    }

    public String getTypeOfCoffee() {
        return typeOfCoffee;
    }
}
