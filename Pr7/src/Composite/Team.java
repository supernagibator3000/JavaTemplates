package Composite;

import java.util.ArrayList;

public class Team implements Component{
    private int id;
    private ArrayList<Component> teamMembers;

    public Team(int id){
        this.id = id;
        this.teamMembers = new ArrayList<>();
    }

    public Team addEmployee(Component employee){
        teamMembers.add(employee);
        return this;
    }

    public Team removeEmployee(Employee employee){
        teamMembers.remove(employee);
        return this;
    }

    @Override
    public void printFullInfo() {
        teamMembers.forEach(Component::printFullInfo);
    }

    @Override
    public void printName() {
        teamMembers.forEach(Component::printName);
    }

    @Override
    public void printPosition() {
        teamMembers.forEach(Component::printPosition);
    }

    @Override
    public void printSalary() {
        teamMembers.forEach(Component::printSalary);
    }
}
