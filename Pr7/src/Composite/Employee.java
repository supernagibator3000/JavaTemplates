package Composite;

public class Employee implements Component{
    private String name;
    private String position;
    private int salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee withPosition(String position){
        this.position = position;
        return this;
    }

    public Employee withSalary(int salary){
        this.salary = salary;
        return this;
    }

    @Override
    public void printFullInfo() {
        System.out.println(name + ' ' + position + ' ' + salary);
    }

    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printPosition() {
        System.out.println(position);
    }

    @Override
    public void printSalary() {
        System.out.println(salary);
    }
}
