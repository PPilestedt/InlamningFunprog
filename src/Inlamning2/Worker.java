package Inlamning2;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    public String name;
    public Worker boss;
    public List<Worker> employees = new ArrayList<>();

    public Worker(String name){
        this.name = name;
    }
    public Worker(String name, Worker boss, List<Worker> employees){
        this.name = name;
        this.boss = boss;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getBoss() {
        return boss;
    }

    public void setBoss(Worker boss) {
        this.boss = boss;
        boss.addEmployee(this);
    }

    private void addEmployee(Worker poleWorker) {
        employees.add(poleWorker);
    }

    public List<Worker> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                '}';
    }
}
