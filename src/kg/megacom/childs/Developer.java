package kg.megacom.childs;

import kg.megacom.ENUM.DeveloperGrade;
import kg.megacom.parents.Employee;

public class Developer extends Employee {
    private String grades = "Middle";
    private DeveloperGrade grade;

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer(String fio, int age, int salary, DeveloperGrade grade) {
        super(fio, age, salary);
        this.grade = grade;
    }

    public DeveloperGrade getGrade() {
        return grade;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need this day for to end another stuffs in my life");
    }

    public Developer() {
    }
}