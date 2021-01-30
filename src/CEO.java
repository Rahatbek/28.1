public class CEO extends Employee {
    private boolean hasCompanyCar;
    private boolean hasStocks;

    public CEO(String fio, int age, int salary, boolean hasCompanyCar, boolean hasStocks) {
        super(fio, age, salary);
        this.hasCompanyCar = hasCompanyCar;
        this.hasStocks = hasStocks;
    }

    @Override
    public void goToDayOff() {
        System.out.println("I need this day for to rest all my own business");
    }

    public CEO() {

    }
}