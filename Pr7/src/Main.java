import Composite.Component;
import Composite.Employee;
import Composite.Team;
import Decorator.BigCargo;
import Decorator.LightCargo;

public class Main {
    public static void main(String[] args) {
        Component employee1 = new Employee("Somebody").withPosition("CEO").withSalary(1);
        Component employee2 = new Employee("Body").withPosition("handyman").withSalary(0);

        Team team = new Team(1);

        team.addEmployee(employee1).addEmployee(employee2);
        team.printFullInfo();


        LightCargo lightCargo = new LightCargo();
        System.out.println("Light cargo weight: " + lightCargo.getWeight());

        BigCargo bigCargo = new BigCargo(lightCargo);
        System.out.println("Big cargo weight: " + bigCargo.getWeight());
    }
}
