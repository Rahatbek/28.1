package kg.megacom.parents;

public abstract class Employee {
    private String fio;
    private int age;
    private int salary;
    Employee[] employees;

    public abstract void goToDayOff();

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }
}