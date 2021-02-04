package kg.megacom;

import kg.megacom.childs.CEO;
import kg.megacom.childs.Developer;
import kg.megacom.childs.Manager;
import kg.megacom.childs.Specialist;
import kg.megacom.parents.Employee;

public class Main {
    public static void main(String[] args) {


        Specialist harryPotter = new Specialist("Harry Potter", 23, 600, 2);
        Specialist hermioneGranger = new Specialist("Hermione Granger", 22, 700, 3);
        Specialist ronWeaslye = new Specialist("Ron Weasley", 24, 500, 1);

        Developer minervaMcGonagall = new Developer("Minerva McGonagall", 34, 1500, "Middle");
        Developer doloresUmbridge = new Developer("Dolores Umbridge", 45, 2500, "Senior?");
        Developer severusSnape = new Developer("Severus Snape", 50, 3000, "Junior");
        Developer rolandaTryuk = new Developer("Rolanda Tryuk", 39, 1400, "Senior");

        Manager rebeusHagrid = new Manager("Rebeus Hagrid", 38, 1000, true);
        Manager masterDobby = new Manager("master Dobby", 25, 900, false);

        CEO albusDumbldore = new CEO("Albus Dumbledore", 85, 4000, true, true);

        Employee[] employeesgoToDayOff = new Employee[]{harryPotter, hermioneGranger, ronWeaslye, minervaMcGonagall, doloresUmbridge, severusSnape,
                rolandaTryuk, rebeusHagrid, masterDobby, albusDumbldore};
        for (int i = 0; i < employeesgoToDayOff.length; i++)
            employeesgoToDayOff[i].goToDayOff();
    }
}
