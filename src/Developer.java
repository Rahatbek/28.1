public class Developer extends Employee {
    private String grades = "Middle";

    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need this day for to end another stuffs in my life");
    }

    public Developer() {

    }
}