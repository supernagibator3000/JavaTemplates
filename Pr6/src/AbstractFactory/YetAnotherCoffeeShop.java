package AbstractFactory;

public class YetAnotherCoffeeShop implements AbstractFactory {
    @Override
    public void orderCoffee(Coffee coffee) {
        System.out.println("===============\nYet Another Coffee Shop");
        makeCoffee(coffee);
        serveCoffee(coffee);
    }

    @Override
    public void makeCoffee(Coffee coffee) {
        System.out.println("-> Your " + coffee.getTypeOfCoffee() + " is ready");
    }

    @Override
    public void serveCoffee(Coffee coffee) {
        System.out.println("-> Here's your " + coffee.getTypeOfCoffee());
    }
}
