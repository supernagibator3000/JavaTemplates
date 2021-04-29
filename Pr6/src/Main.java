import AbstractFactory.*;
import Prototype.Cup;

public class Main {
    public static void main(String[] args) {
        CoffeeShop cafe1 = new CoffeeShop();
        YetAnotherCoffeeShop cafe2 = new YetAnotherCoffeeShop();
        cafe1.orderCoffee(new Coffee("Latte").withSugar(true));
        cafe2.orderCoffee(new Coffee("Espresso").withSugar(false));


        Cup cupOfCoffee = new Cup(50);
        Cup cupOfCoffeeClone = (Cup) cupOfCoffee.clone();



    }
}
