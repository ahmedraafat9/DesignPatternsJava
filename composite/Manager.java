package composite;

import java.util.ArrayList;

public class Manager implements Employee{
    private String name;
    private ArrayList<Employee> subordinates = new ArrayList<Employee>();

    public Manager(String name){
        this.name=name;
    }

    public void addOrdinates(Employee employee){
        subordinates.add(employee);
    }
    public void removeOrdinates(Employee employee){
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        System.out.println("Subordinates: ");
        for(Employee subordinate: subordinates){
            subordinate.showDetails();
        }
    }
}
