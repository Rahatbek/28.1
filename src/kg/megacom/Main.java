package kg.megacom;

import kg.megacom.ENUM.DeveloperGrade;
import kg.megacom.childs.CEO;
import kg.megacom.childs.Developer;
import kg.megacom.childs.Manager;
import kg.megacom.childs.Specialist;
import kg.megacom.parents.Employee;

public class Main {
    public static void main(String[] args) {


        /*Specialist harryPotter = new Specialist("Harry Potter", 23, 600, 2);
        Specialist hermioneGranger = new Specialist("Hermione Granger", 22, 700, 3);
        Specialist ronWeaslye = new Specialist("Ron Weasley", 24, 500, 1);*/

        Developer minervaMcGonagall = new Developer("Minerva McGonagall", 34, 1500, DeveloperGrade.TEAMLEAD);
        Developer doloresUmbridge = new Developer("Dolores Umbridge", 45, 2500, DeveloperGrade.SENIOR);
        Developer severusSnape = new Developer("Severus Snape", 50, 3000, DeveloperGrade.JUNIOR);
        Developer rolandaTryuk = new Developer("Rolanda Tryuk", 39, 1400, DeveloperGrade.MIDDLE);
        Developer rolandaTryuk1 = new Developer("Rolanda Tryuk", 39, 1400, DeveloperGrade.CEO);

        /*Manager rebeusHagrid = new Manager("Rebeus Hagrid", 38, 1000, true);
        Manager masterDobby = new Manager("master Dobby", 25, 900, false);*/

        CEO albusDumbldore = new CEO("Albus Dumbledore", 85, 4000, true, true);

        printDeveloperGrade(minervaMcGonagall);
        printDeveloperGrade(doloresUmbridge);
        printDeveloperGrade(severusSnape);
        printDeveloperGrade(rolandaTryuk);
        printDeveloperGrade(rolandaTryuk1);
    }

    private static void printDeveloperGrade(Developer developer) {
        switch (developer.getGrade()) {
            case JUNIOR:
                System.out.println("I am junior developer");
                break;
            case MIDDLE:
                System.out.println("I am middle developer");
                break;
            case SENIOR:
                System.out.println("I am senior developer");
                break;
            case TEAMLEAD:
                System.out.println("I am teamlead developer");
                break;
            default:
                System.out.println("You are trainee");
        }
    }
}
