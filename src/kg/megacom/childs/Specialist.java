package kg.megacom.childs;

import kg.megacom.parents.Employee;

public class Specialist extends Employee {
    private int levels;

    public Specialist(String fio, int age, int salary, int levels) {
        super(fio, age, salary);
        this.levels = levels;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need this day for to spend my time another people, just not clients");
    }

    public Specialist() {
    }


}