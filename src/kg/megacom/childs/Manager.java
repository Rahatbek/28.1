package kg.megacom.childs;

import kg.megacom.parents.Employee;

public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need this day for to expand my acquaintances");
    }

    public Manager() {

    }
}